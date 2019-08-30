package com.nisum.kata;

public class Stack implements Stackable {
    private int[] items;
    private int position = 0;

    public Stack(int capacity) {
       items = new int[capacity];
    }

    @Override
    public boolean isEmpty() {
        return position==0;
    }

    @Override
    public void push(int item) {
        if(position == getCapacity()){
            throw new OverFlow();
        }
        this.items[position++] = item;
    }

    @Override
    public int pop() {
        if(isEmpty()){
            throw new UnderFlow();
        }
        return items[--position];
    }

    @Override
    public int getCapacity() {
        return items.length;
    }

    @Override
    public int top() {
        if (isEmpty()){
            throw new UnderFlow();
        }
        return items[position-1];
    }

    public static class UnderFlow extends RuntimeException {
    }

    public static class OverFlow extends RuntimeException {
    }
}
