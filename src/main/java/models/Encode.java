package models;

public class Encode {

    private  String mInputString;
    private int mShift;

//    constructor

    public Encode(String mInputString, int mShift) {
        this.mInputString = mInputString;
        this.mShift = mShift;
    }

    public String getmInputString() {
        return mInputString;
    }

    public int getmShift() {
        return mShift;
    }
    public static  String encode( Encode encode) {
        if (encode.mShift > 26) {
            encode.mShift = encode.mShift % 26;
        }
        else if(encode.mShift < 0) {
    encode.mShift = (encode.mShift % 26) + 26;
        }

        String outputString = "";
        int length = encode.mInputString.length();
        for (int i = 0; i < length ; i++) {
            char cc = encode.mInputString.charAt(i);
            if(Character.isLetter(cc)){
                if(Character.isLowerCase(cc)){
                    char c = (char)(cc-encode.mShift);
                    if(c<'a'){
                        outputString += (char)(cc + (26-encode.mShift));
                    }
                    else {
                        outputString += c;
                    }
                }
                else if(Character.isUpperCase(cc)){
                    char c = (char)(cc-encode.mShift);
                    if(c<'A'){
                        outputString += (char)(cc + (26-encode.mShift));
                    }
                    else {
                        outputString += c;
                    }
                }
            }
            else{
                outputString += cc;
            }
        }
        return outputString;
    }
}
