package com.gavrikyk;

public interface Stack {
    void push(Object value);

    Object pop();

    Object peek(); // овертає значеня але не достає зі стеку

    boolean contains (Object value);

    boolean isEmpty();

    int size();

    void clear();



}
