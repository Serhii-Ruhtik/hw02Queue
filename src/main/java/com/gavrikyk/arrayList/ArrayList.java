package com.gavrikyk.arrayList;

import java.util.Iterator;

public class ArrayList implements List{
    private int size;
    private Object[] array;

    public ArrayList() {
        array = new Object[5];
    }

//✅
    @Override
    public void add(Object value) {
        capacity();

        array[size] = value;
        size++;
    }

    private void capacity (){
        if (size == array.length) {
            Object[] newArray = new Object[array.length*2];
            for (int i = 0; i < array.length; i++) {
                newArray[i] = array[i];
            }
            array = newArray;
        }
    }

//✅
    @Override
    public void add(Object value, int index) {
        for (int i=index; i<size; i++){
            if(array[i] == null){
                array[i] = value;
                break;
            }
        }


    }

//✅
    @Override
    public Object remove(int index) {
        if(index < 0 || index >= size){
           throw new IndexOutOfBoundsException();
        }
        Object removedElement = array[index];

        for (int i = index; i < size; i++) {
        array[i] = array[i+1];
        }
        array[size - 1] = null;
        size--;

        return removedElement;
    }

//✅
    @Override
    public Object get(int index) {
        return array[index];
    }

//✅
    @Override
    public Object set(Object value, int index) {
        return array[index] = value;
    }
//✅
    @Override
    public boolean contains(Object value) {
        for (int i = 0; i <size; i++) {
            if (array[i].equals(value)) {
                return true;
            }
        }
        return false;
    }
//✅
    @Override
    public int indexOf(Object value) {
        for (int i = 0; i < size -1; i++) {
            if (array[i] == value) {
               return i;
            }
        }
        return -1;
    }
//✅
    @Override
    public int lastIndexOf(Object value) {
        for (int i = size -1; i >= 0; i--) {
            if (array[i] == value) {
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

//    @Override
//    public String toString() {
//        String result = " ";
//        for (int i = 0; i < size ; i++) {
//            result += (array[i] + " ");
//            if (i < size - 1) {
//                result += ", ";
//            }
//        }
//        System.out.println("[" + result + "]");
//        return result;
//    }
}
