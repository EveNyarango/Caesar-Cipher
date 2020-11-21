package models;
import models.Encode;

import org.junit.Test;

import static org.junit.Assert.*;

public class EncodeTest {
    @Test
    public void runEncode_ifInputIsString() {
Encode testEncode = new Encode("abc",3);
assertEquals("abc", testEncode.getmInputString());
    }
    @Test
    public void  runDecode_ifKeyIsInt() {
        Encode testEncode = new Encode("abc", 3);
        assertEquals(3, testEncode.getmShift());
    }
    @Test
    public void encode(){

    }
}
