package com.nisum.kata;

public interface Stackable {
    boolean isEmpty();

    void push(int item);

    int pop();

    int getCapacity();

    int top();
}
