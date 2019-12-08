package ua.epam.task5;


import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class MyHashMapTest {
    MyHashMap myHashMap = new MyHashMap();

    @Before
    public void setUp(){
        myHashMap.put(1,11);
        myHashMap.put(2,12);
        myHashMap.put(4, 14);
        myHashMap.put(7, 9392);
    }

    @Test
    public void testGet(){
        int result = myHashMap.get(7);
        assertEquals(result, 9392);
    }

    @Test
    public void testRemove(){
        myHashMap.remove(7);
        int result = myHashMap.get(7);
        assertEquals(result, -1);
    }
}
