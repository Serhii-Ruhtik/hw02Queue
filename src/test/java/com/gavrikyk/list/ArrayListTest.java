package com.gavrikyk.list;

import com.gavrikyk.arrayList.ArrayList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayListTest {
    @Test
    public void testAdd(){
        ArrayList list = new ArrayList();
        list.add("A");
        list.add("B");
        assertEquals(2, list.size());
    }

    @Test
    public void testContainsReturnTrue(){
        ArrayList list = new ArrayList();
        list.add("A");
        list.add("B");


        assertTrue(list.contains("A"));
    }


    @Test
    public void testContainsReturnFalse(){
        ArrayList list = new ArrayList();
        list.add("A");
        list.add("B");

        assertFalse(list.contains("C"));
    }

    @Test
    public void testRemove(){
        ArrayList list =new ArrayList();
        list.add("A");
        list.add("B");
        list.add("C");

        assertEquals(3, list.size());
        list.remove(1);
        assertEquals(2, list.size());
    }

    @Test
    public void testGetIndexTrue(){
        ArrayList list = new ArrayList();
        list.add("A");
        list.add("B");
        list.add("C");

        assertEquals(3, list.size());
        assertTrue(list.get(0).equals("A"));

    }

    @Test
    public void testGetIndexFalse(){
        ArrayList list = new ArrayList();
        list.add("A");
        list.add("B");
        list.add("C");

        assertEquals(3, list.size());
        assertFalse(list.get(1).equals("A"));

    }

    @Test
    public void testSet(){
        ArrayList list = new ArrayList();

        list.add("A");
        list.add("B");
        list.add("C");

        assertEquals(3, list.size());

        list.set("D", 1);
        assertEquals(3, list.size());
        assertEquals("D", list.get(1));


    }

    @Test
    public void testClear(){
        ArrayList list = new ArrayList();
        list.add("A");
        list.add("B");
        list.add("C");

        assertEquals(3, list.size());
        list.clear();
        assertEquals(0, list.size());

    }

    @Test
    public void testIsEmptyTrue(){
        ArrayList list = new ArrayList();

        assertTrue(list.isEmpty());
    }

    @Test
    public void testIsEmptyFalse(){
        ArrayList list = new ArrayList();

        list.add("A");
        list.add("B");
        list.add("C");

        assertFalse(list.isEmpty());

    }

}
