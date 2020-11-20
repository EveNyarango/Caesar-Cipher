import com.sun.tools.javac.comp.Enter;
import models.Decode;
import models.Encode;

import java.util.Scanner;

public class App {
  public static void main (String[] args){
Scanner myScanner = new Scanner (System.in);
boolean runCaesar = true;

while (runCaesar) {

System.out.println("Hi, this Caesar Cipher");
System.out.println("=======================");
System.out.println("Enter encode to encrypt or decode to decrypt or exit to leave the App");
String choice = myScanner.nextLine();

if (choice.equals("encode")){
    System.out.println("models.Encode the message by entering it in the next line");
    String input = myScanner.nextLine();
    System.out.println("====================");

    System.out.println("Enter a key");
    int key = myScanner.nextInt();
    System.out.println("===================");
    Encode caesar = new Encode(input, key);
    String encoded = Encode.encode(caesar);
    System.out.println("Encoded message:" + encoded);
    System.out.println("=========================");
    System.out.println("=========================");
    System.out.println("=========================");
}
else if(choice.equals("decode")){
    System.out.println("To decode a message enter it below");
    String mess = myScanner.nextLine();
    System.out.println("==============================");

    System.out.println("Enter the key you used");
    int nom = myScanner.nextInt();
    System.out.println("==========================");
    Decode caesar = new Decode(mess, nom);
    String decoded = Decode.decode(caesar);

    System.out.println("Decoded message:" + decoded);
    System.out.println("=========================");
    System.out.println("=========================");
    System.out.println("=========================");
}
else if (choice.equals("exit")){
    runCaesar = false;
}
}
  }
}
