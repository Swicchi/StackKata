package com.nisum.kata;

public class Stack {
    private int[] items;
    private int position = 0;

    public Stack(int capacity) {
       items = new int[capacity];
    }

    public boolean isEmpty() {
        return position==0;
    }

    public void push(int item) {
        if(position == getCapacity()){
            throw new OverFlow();
        }
        this.items[position++] = item;
    }

    public int pop() {
        if(isEmpty()){
            throw new UnderFlow();
        }
        return items[--position];
    }

    public int getCapacity() {
        return items.length;
    }

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
