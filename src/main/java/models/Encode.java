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
}
