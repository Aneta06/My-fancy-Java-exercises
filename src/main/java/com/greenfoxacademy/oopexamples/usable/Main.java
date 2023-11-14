package com.greenfoxacademy.oopexamples.usable;

public class Main {
    public static void main(String[] args) {

        Usable usable = new Usable();

        //funguje jen kdyz je promena public
//        System.out.println(usable.status);

        System.out.println(usable.getStatus());

        usable.use();
        System.out.println(usable.getStatus());

        usable.setStatus("Ahoj");
        System.out.println(usable.getStatus());

    }

}
