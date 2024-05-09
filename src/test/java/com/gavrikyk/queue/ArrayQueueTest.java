package com.gavrikyk.queue;

//void enqueue(Object value); // закидує в масив
//Object dequeue(); // дістає з масиву
//Object peek(); // дивимось яке значення наступне без доставання його
//int size(); // повертає розмір
//boolean isEmpty(); // повертає boolean, він пустий
//boolean contains(Object value); // повертає чи є таке значання в об'єкті
//void clear(); // очищуємо
//String toString(); // [A, B, C] if size = 3

import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayQueueTest {
       @Test
    public void testEnqueueAndDequeueAndSize (){
        ArrayQueue arrayQueue = new ArrayQueue();

        arrayQueue.enqueue("A");
        arrayQueue.enqueue("B");



        assertEquals(2, arrayQueue.size());
//        assertEquals("B",arrayQueue.dequeue());
//        assertEquals("A",arrayQueue.dequeue());
        assertEquals(0,arrayQueue.size());
        assertTrue(arrayQueue.isEmpty());

    }
@Test
    public void testAssertThrows (){
        ArrayQueue arrayQueue = new ArrayQueue();

        assertThrows(NoSuchElementException.class, () -> {
            arrayQueue.dequeue();
       });

    }

    @Test
    public void testEnqueueAndPeek (){
        ArrayQueue arrayQueue = new ArrayQueue();
        arrayQueue.enqueue("A");
        arrayQueue.enqueue("B");

        assertEquals(2, arrayQueue.size());
        assertEquals("B",arrayQueue.peek());
        assertEquals("B",arrayQueue.peek());
        assertEquals(2,arrayQueue.size());

    }

    @Test
    public void testSize (){
        ArrayQueue arrayQueue = new ArrayQueue();

        arrayQueue.enqueue("A");
        arrayQueue.enqueue("B");

        assertEquals(2, arrayQueue.size());


    }

    @Test
    public void testIsEmpty (){
        ArrayQueue arrayQueue = new ArrayQueue();

        assertTrue(arrayQueue.isEmpty());


    }

//    @Test
//    public void testToString (){
//        ArrayQueue arrayQueue = new ArrayQueue();
//
//        assertTrue(arrayQueue.isEmpty());
//
//    }



}
