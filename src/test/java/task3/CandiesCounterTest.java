package task3;


import static org.junit.Assert.*;
import org.junit.Test;

public class CandiesCounterTest {

    @Test
    public void testgetCandies_ok(){
        CandiesCounter candiesCounter = new CandiesCounter();
        int result;
        int[] array = {1,2,2,6,6,7};
        result = candiesCounter.getCandies(array);
        assertEquals(result, 3);
    }

    @Test
    public void testGetCandies_failed(){
        CandiesCounter candiesCounter = new CandiesCounter();
        int result;
        int[] array = {1,2,2,6,6};
        result = candiesCounter.getCandies(array);
        assertEquals(result, 3);
    }
}
