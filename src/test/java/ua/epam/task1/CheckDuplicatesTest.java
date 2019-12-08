package ua.epam.task1;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class CheckDuplicatesTest {
    @Test
    public void testContainDuplicates() {
        CheckDuplicates checkDuplicates = new CheckDuplicates();
        ArrayList arrayList = new ArrayList();
        boolean result;
        arrayList.add(1);
        arrayList.add(1);
        arrayList.add(3);
        arrayList.add(4);

        result = checkDuplicates.containDuplicates(arrayList);
        assertEquals(result, true);

        arrayList.clear();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);

        result = checkDuplicates.containDuplicates(arrayList);
        assertEquals(result, false);
    }
}
