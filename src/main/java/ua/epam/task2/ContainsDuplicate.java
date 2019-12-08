package ua.epam.task2;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                int previous = map.get(nums[i]);
                if (i - previous <= k)
                    return true;
            }
            map.put(nums[i], i);
        }

        return false;
    }
}
