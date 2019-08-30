package com.nisum.kata;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;


public class StackTest {

    private Stack stack;

    @Before
    public void setUp() {
        stack = new Stack(10);
    }

    @Test
    public void new_stack_should_be_empty() {
        assertThat(stack.isEmpty(),is(true));
    }

    @Test
    public void when_pushing_one_stack_is_not_empty() {
        stack.push(1);

        assertThat(stack.isEmpty(),is(false));
    }

    @Test
    public void when_42_is_pushed_42_is_popped() {
        stack.push(42);

        assertThat(stack.pop(),is(42));
    }

    @Test
    public void when_84_is_pushed_84_is_popped() {
        stack.push(84);

        assertThat(stack.pop(),is(84));
    }

    @Test
    public void when_26_and_64_are_pushed_64_and_26_are_popped() {
        stack.push(26);
        stack.push(64);

        assertThat(stack.pop(),is(64));
        assertThat(stack.pop(),is(26));

    }

    @Test
    public void when_22_and_66_are_pushed_and_after_pop_is_empty() {
        stack.push(22);
        stack.push(66);

        stack.pop();
        stack.pop();

        assertThat(stack.isEmpty(),is(true));
    }

    @Test(expected = Stack.UnderFlow.class)
    public void when_popping_empty_stack_throws_stack_under_flow() {
        stack.pop();
    }

    @Test
    public void new_stack_with_capacity_2_is_created() {
        stack = new Stack(2);

        assertThat(stack.getCapacity(), is(2));
    }

    @Test
    public void new_stack_with_capacity_3_is_created() {
        stack = new Stack(3);

        assertThat(stack.getCapacity(), is(3));
    }

    @Test(expected = Stack.OverFlow.class)
    public void when_pushing_full_stack_throw_stack_over_flow() {
        stack = new Stack(0);

        stack.push(2);
    }

    @Test
    public void when_22_is_pushed_then_top_is_22() {
        stack.push(22);

        assertThat(stack.top(),is(22));
    }

    @Test
    public void when_42_is_pushed_then_top_is_42() {
        stack.push(42);

        assertThat(stack.top(),is(42));
    }

    @Test(expected = Stack.UnderFlow.class)
    public void when_topping_empty_stack_throws_stack_under_flow() {
        stack.top();
    }
}
