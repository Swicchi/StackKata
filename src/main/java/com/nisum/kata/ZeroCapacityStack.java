package com.nisum.kata;

public class ZeroCapacityStack implements Stackable {

    @Override
    public boolean isEmpty() {
        return true;
    }

    @Override
    public void push(int item) {
        throw new Stack.OverFlow();
    }

    @Override
    public int pop() {
        throw new Stack.UnderFlow();
    }

    @Override
    public int getCapacity() {
        return 0;
    }

    @Override
    public int top() {
        throw new Stack.UnderFlow();
    }
}
