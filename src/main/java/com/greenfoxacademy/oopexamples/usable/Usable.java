package com.greenfoxacademy.oopexamples.usable;

public class Usable {


     private String status;

    public Usable(){
        status = "I'm not used at all.";
    }

    public void use(){
        status = "Now, I was used at least once.";
    }

    public void setStatus(String s) {
        status = s;
    }

    public String getStatus() {
        return status;
    }

}
