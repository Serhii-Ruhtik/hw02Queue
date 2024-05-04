package com.gavrikyk.queue;

public interface Queue {
    void enqueue(Object value); // закидує в масив

    Object dequeue(); // дістає з масиву

    Object peek(); // дивимось яке значення наступне без доставання його

    int size(); // повертає розмір

    boolean isEmpty(); // повертає boolean, він пустий

    boolean contains(Object value); // повертає чи є таке значання в об'єкті

    void clear(); // очищуємо

    String toString(); // [A, B, C] if size = 3

}
