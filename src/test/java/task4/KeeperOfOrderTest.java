package task4;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class KeeperOfOrderTest {
    private ArrayList<Integer> arrayList = new ArrayList<Integer>();
    private Set<Integer> result = new TreeSet<Integer>();
    private Set<Integer> treeset = new TreeSet<Integer>();

    @Before
    public void fillCollection(){
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(2);
        arrayList.add(4);
        treeset.add(2);
        treeset.add(3);
    }

    @Test
    public void testCheckNumbers(){
        KeeperOfOrder keeperOfOrder = new KeeperOfOrder();
        result.addAll(keeperOfOrder.checkNumbers(arrayList));
        assertEquals(result, treeset);
    }
}
