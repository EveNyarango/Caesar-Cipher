package models;

public class Decode {
    private String mInputString;
    private int mShift;

    public Decode(String mInputString, int mShift) {
        this.mInputString = mInputString;
        this.mShift = mShift;
    }

    public String getmInputString() {
        return mInputString;
    }

    public int getmShift() {
        return mShift;
    }
    public static  String decode(Decode decode){
if(decode.mShift >26) {
decode.mShift = decode.mShift % 26;
}else if(decode.mShift < 0){
    decode.mShift = (decode.mShift % 26) + 26;

}
String outputString = "";
int length = decode.mInputString.length();
for (int i = 0; i < length; i++){
    char cc = decode.mInputString.charAt(i);
    if (Character.isLetter(cc)){
        if (Character.isLowerCase(cc)){
            char c = (char)(cc + (26-decode.mShift));
            if (c>'z'){
                outputString += (char)(cc + (26-decode.mShift));
            }

                else {
                    outputString += c;

            }
        }

       else if (Character.isUpperCase(cc)){
            char c = (char)(cc + (26-decode.mShift));
            if (c>'Z'){
                outputString += (char)(cc + (26-decode.mShift));
            }

            else {
                outputString += c;

            }
        }


    }
    else {
        outputString += cc;
    }
}
return outputString;

    }
}
