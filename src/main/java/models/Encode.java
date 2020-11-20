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

    }
}
