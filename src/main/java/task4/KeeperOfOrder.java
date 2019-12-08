package task4;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class KeeperOfOrder {

    public Set checkNumbers(ArrayList<Integer> array) {
        if (array.size() < 2 || array == null) {
            return null;
        }
        int previous = Integer.MAX_VALUE;
        Set missingNumbers = new TreeSet();
        for (int i = 0; i < array.size(); i++) {
            if (previous == array.get(i)) {
                missingNumbers.add(previous);
                missingNumbers.add(i + 1);
            }
            previous = array.get(i);
        }
        return missingNumbers;
    }
}
