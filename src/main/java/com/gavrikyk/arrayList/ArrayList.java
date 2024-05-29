package com.gavrikyk.arrayList;

import java.util.Iterator;
import java.util.Objects;
import java.util.StringJoiner;

public class ArrayList implements List{
    private static final int DEFAULT_INITIAL_CAPACITY = 5;
    private static final int DEFAULT_GROWTH_FACTOR = 2;
    private int size;
    private Object[] array;

    public ArrayList() {
        array = new Object[DEFAULT_INITIAL_CAPACITY];
    }

//✅
    @Override
    public void add(Object value) {
        capacity();

        add(value, size);
    }

//✅
    @Override
    public void add(Object value, int index) {
        validateIndexForAdd(index);
        capacity();

        System.arraycopy(array, index, array, index +1, size - index);
        array[index] = value;
        size++;
    }

//✅
    @Override
    public Object remove(int index) {
        validateIndex(index);

        Object removedElement = array[index];

        System.arraycopy(array, index + 1, array, index, size - index - 1);

        array[size - 1] = null;
        size--;

        return removedElement;
    }


//✅
    @Override
    public Object get(int index) {
        validateIndex(index);

        return array[index];
    }

//✅
    @Override
    public Object set(Object value, int index) {
        validateIndex(index);

        return array[index] = value;
    }
//✅
    @Override
    public boolean contains(Object value) {
        return indexOf(value) != -1;
    }
//✅
    @Override
    public int indexOf(Object value) {
        for (int i = 0; i < size -1; i++) {
            if (Objects.equals(array[i], value)) {
               return i;
            }
        }
        return -1;
    }
//✅
    @Override
    public int lastIndexOf(Object value) {
        for (int i = size -1; i >= 0; i--) {
            if (Objects.equals(array[i], value)) {
                return i;
            }
        }
        return -1;
    }
//✅
    @Override
    public void clear() {
        for (int i = 0; i < size -1; i++) {
            array[i] = null;
        }
        size = 0;

    }
//✅
    @Override
    public int size() {
        return size;
    }
//✅
    @Override
    public boolean isEmpty() {
        return size == 0;

    }
//🛠
    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public String toString() {
        StringJoiner sj = new StringJoiner(", ", "[", "]");
        for (int i = 0; i < size; i++) {
            sj.add(array[i].toString());
        }
        return sj.toString();
    }

    private void capacity (){
        if (size == array.length) {
            Object[] newArray = new Object[array.length*DEFAULT_GROWTH_FACTOR];
            for (int i = 0; i < array.length; i++) {
                newArray[i] = array[i];
            }
            array = newArray;
        }
    }

    private void validateIndexForAdd(int index){
        if(index < 0 || index > size){
            throw new IndexOutOfBoundsException("Index: " + index + " must be between [ " + 0 + "," + size + "]");
        }
    }

    private void validateIndex(int index){
        if(index < 0 || index > size - 1){
            throw new IndexOutOfBoundsException("Index: " + index + " must be between [ " + 0 + "," + (size -1) + "]");
        }
    }
}
