package ua.epam.task2;

import static org.junit.Assert.*;
import org.junit.Test;

public class ContainsDuplicateTest {

    @Test
    public void testContainsDuplicate(){
        ContainsDuplicate containsDuplicate = new ContainsDuplicate();
        boolean result;
        int[] array = {1,2,3,1,2,3};
        int[] array2 = {1,2,3,1};
        result = containsDuplicate.containsDuplicate(array, 2);
        assertEquals(result, false);
        result = containsDuplicate.containsDuplicate(array2, 3);
        assertEquals(result, true);
    }
}
