package task5;

import java.util.ArrayList;
import java.util.Arrays;

public class MyHashMap {
    private int[] array;

    public MyHashMap() {
        this.array = new int[1000001];
        Arrays.fill(array, -1);
    }

    void put(int key, int value){
        array[key] = value;
    }
    int get(int key){
        return array[key];
    }

    void remove(int key){
        array[key] = -1;
    }
}
