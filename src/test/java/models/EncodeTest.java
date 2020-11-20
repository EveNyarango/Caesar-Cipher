package models;

import org.junit.Test;

import static org.junit.Assert.*;

public class EncodeTest {
    @Test
    public void runEncode_ifInputIsString() {
Encode testEncode = new Encode("xyz",3);
assertEquals("xyz", testEncode.getmInputString());
    }
    @Test
    public void  runDecoding_ifKeyIsInt() {
        Encode testEncode = new Encode("xyz", 3);
        assertEquals(3, testEncode.getmShift());
    }
    @Test
    public void encode(){

    }
}
