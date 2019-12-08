package task3;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CandiesCounter {
    public int getCandies(int[] array) {
        if (array.length < 2 || array == null || array.length % 2 != 0) {
            return -1;
        }
        Set<Integer> sistersCandies = new HashSet<Integer>();
        for (int i = 0; i < array.length; i++) {
            if (sistersCandies.size() != array.length / 2) {
                sistersCandies.add(array[i]);
            }
        }
//        Iterator iterator = sistersCandies.iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next()+" ");
//        }
        return sistersCandies.size();
    }
}
