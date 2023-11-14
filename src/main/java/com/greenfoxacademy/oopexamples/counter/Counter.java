package com.greenfoxacademy.oopexamples.counter;

public class Counter {

    private int counter;
    private final int defaultValue;

    public Counter() {
        counter = 0;
        defaultValue = 0;
    }

    public Counter(int counter) {
        this.counter = counter;
        defaultValue = counter;
    }

    public int addNumber(int number) {
        return number;
    }

    public void addIncrease() {
      counter += 1;
    }

    public int getCounter() {
        return counter;
    }

    public void reset(){
        this.counter = defaultValue;
    }
}
