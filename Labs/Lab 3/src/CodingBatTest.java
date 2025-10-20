import org.junit.Test;

import static org.junit.Assert.*;

public class CodingBatTest {

    CodingBat cb = new CodingBat();

    @Test
    public void sleepIn() {
        assertEquals(true, cb.sleepIn(true,true));
        assertEquals(true, cb.sleepIn(false,false));
    }

    @Test
    public void monkeyTrouble() {
        assertEquals(true, cb.monkeyTrouble(true,true));
    }

    @Test
    public void sumDouble() {
        assertEquals(3 , cb.sumDouble(1,2));
        assertEquals(8 , cb.sumDouble(2, 2));
    }

    @Test
    public void diff21() {
        assertEquals(11,cb.diff21(10));
    }
}