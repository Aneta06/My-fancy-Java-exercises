package com.greenfoxacademy.oopexamples.counter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CounterTest {
    Counter c = new Counter();

    @Test
    void addNumber() {
        c.addNumber(5);
        assertEquals(5, c.addNumber(5));

    }

    @Test
    void addIncrease() {
        c.addIncrease();
        assertEquals(1, c.getCounter());
    }

    @Test
    void getCounter() {
        Counter counter = new Counter(5);
        assertEquals(5, counter.getCounter());
    }

    @Test
    void reset() {
        c.reset();
        assertEquals(0, c.getCounter());
    }
}