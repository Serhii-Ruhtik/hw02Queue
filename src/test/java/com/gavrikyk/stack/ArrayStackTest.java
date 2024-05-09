package com.gavrikyk.stack;

//void push(Object value); кладе значення в стек
//Object pop(); дістає значення і видаляє його із стеку
//Object peek(); // овертає значеня але не достає зі стеку
//boolean contains (Object value);
//boolean isEmpty();
//int size();
//void clear();

import com.gavrikyk.ArrayStack;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayStackTest {

    @Test
    public void testPushAndPopWorkCorrectlyAndChangeSize(){
        ArrayStack arrayStack = new ArrayStack();
        arrayStack.push("A");
        arrayStack.push("B");

        assertEquals(2, arrayStack.size());
        assertEquals("B", arrayStack.pop());
        assertEquals("A", arrayStack.pop());
        assertEquals(0,arrayStack.size());
        assertTrue(arrayStack.isEmpty()); //первіряє, масив пустий?
    }

    @Test
    public void testPushOverInitialCapasityAndPopWorkCorrectlyAndChangeSize(){
        ArrayStack arrayStack = new ArrayStack();
        for (int i = 0; i < 15; i++) {
            arrayStack.push(i);
        }
        assertEquals(15, arrayStack.size());

        for (int i = 14; i >= 0; i--) {
            assertEquals(i, arrayStack.pop());
        }

        assertEquals(0,arrayStack.size());
        assertTrue(arrayStack.isEmpty()); //первіряє, масив пустий?
    }

    @Test
    public void testPushAndPeek(){
        ArrayStack arrayStack = new ArrayStack();
        arrayStack.push("A");
        arrayStack.push("B");

        assertEquals(2, arrayStack.size());
        assertEquals("B", arrayStack.peek());
        assertEquals("B", arrayStack.peek());
        assertEquals(2,arrayStack.size());
        assertFalse(arrayStack.isEmpty());
    }

    @Test
    public void testIsEmptyReturnTrueOnNewStack(){
        ArrayStack arrayStack = new ArrayStack();

        assertTrue(arrayStack.isEmpty());
    }

    @Test
    public void testIsEmptyReturnFalseOnStackWithData(){
        ArrayStack arrayStack = new ArrayStack();
        arrayStack.push("A");

        assertFalse(arrayStack.isEmpty());
    }

    @Test
    public void testIsEmptyReturnFalseOnStackAfterClear(){
        ArrayStack arrayStack = new ArrayStack();
        arrayStack.push("A");
        arrayStack.push("B");

        arrayStack.clear();

        assertTrue(arrayStack.isEmpty());
    }

    @Test
    public void testContainsReturnTrue(){
        ArrayStack arrayStack = new ArrayStack();
        arrayStack.push("A");
        arrayStack.push("B");

        assertTrue(arrayStack.contains(new String("A")));
    }

    @Test
    public void  testContainsReturnFalse(){
        ArrayStack arrayStack = new ArrayStack();
        arrayStack.push("A");
        arrayStack.push("B");

        assertFalse(arrayStack.contains("C"));
    }
    @Test
    public void  testContainsReturn(){
        ArrayStack arrayStack = new ArrayStack();

        assertFalse(arrayStack.contains("A"));
    }

    @Test
    public void testThrowIllegalStateExceptionWhenPopOnEmptyStack(){
        ArrayStack arrayStack = new ArrayStack();
        Assertions.assertThrows(IllegalStateException.class, () -> arrayStack.pop());
    }


}
