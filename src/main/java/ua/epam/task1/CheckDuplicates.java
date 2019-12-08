package ua.epam.task1;

import java.util.*;

public class CheckDuplicates {
    public boolean containDuplicates(ArrayList array){
        boolean isContainDuplicates = false;
        if(array.size() == 0 || array == null) return isContainDuplicates;
        int lenght = array.size();
        Set<Integer> set = new HashSet<Integer>(array);
        if(lenght != set.size()){
            isContainDuplicates = true;
            return isContainDuplicates;
        }
        return isContainDuplicates;
    }
}
