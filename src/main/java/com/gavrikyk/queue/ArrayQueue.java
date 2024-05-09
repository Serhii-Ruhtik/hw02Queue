package com.gavrikyk.queue;

import java.util.NoSuchElementException;

public class ArrayQueue implements Queue {
    private int size;
    private Object[] array;

    public ArrayQueue() {
        array = new Object[10];
    }

    @Override
    public void enqueue(Object value) {
    array[size] = value;
    size++;
    }

    @Override
    public Object dequeue() {

        if (isEmpty()) { //🤷‍♀️
            throw new NoSuchElementException("Queue is empty");
        }
        Object result = array[size-1];
        size--;
        return result;
    }

    @Override
    public Object peek() {
        return array[size - 1];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return true;
    }

    @Override
    public boolean contains(Object value) {
        return false;
    }

    @Override
    public void clear() {

    }
}
