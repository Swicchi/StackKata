package com.nisum.kata;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class ZeroCapacityStackTest {

    private Stackable stack;

    @Before
    public void setUp() {
        stack = new ZeroCapacityStack();
    }

    @Test
    public void new_stack_should_be_empty() {
        assertThat(stack.isEmpty(), is(true));
    }

    @Test(expected = Stack.UnderFlow.class)
    public void when_popping_empty_stack_throws_stack_under_flow() {
        stack.pop();
    }

    @Test(expected = Stack.OverFlow.class)
    public void when_pushing_full_stack_throw_stack_over_flow() {
        stack.push(2);
    }

    @Test(expected = Stack.UnderFlow.class)
    public void when_topping_empty_stack_throws_stack_under_flow() {
        stack.top();
    }

    @Test
    public void new_stack_has_zero_capacity() {
        assertThat(stack.getCapacity(), is(0));
    }

}
