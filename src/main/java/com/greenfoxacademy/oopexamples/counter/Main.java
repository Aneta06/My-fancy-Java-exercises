package com.greenfoxacademy.oopexamples.counter;

public class Main {

    public static void main(String[] args) {


        Counter counter = new Counter();
        Counter counter1 = new Counter(10);

        System.out.println(counter.addNumber(8));

        System.out.println(counter.getCounter());
        System.out.println(counter1.getCounter());

        counter.addIncrease();
        counter.addIncrease();
        System.out.println(counter.getCounter());

        counter1.addIncrease();
        System.out.println(counter1.getCounter());

        counter.reset();
        System.out.println(counter.getCounter());

        counter1.reset();
        System.out.println(counter1.getCounter());


    }
}
