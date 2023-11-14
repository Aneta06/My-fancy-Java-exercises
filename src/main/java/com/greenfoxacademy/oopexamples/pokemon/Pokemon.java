package com.greenfoxacademy.oopexamples.pokemon;

import java.util.ArrayList;
import java.util.List;

public class Pokemon {

   private String name;
    private String type;
    private String effectiveAgainst;

    public Pokemon( String name, String type, String effectiveAgainst){
        this.name = name;
        this.type =type;
        this.effectiveAgainst = effectiveAgainst;
    }

    public boolean isEffectiveAgainst(Pokemon anotherPokemon){
        return this.effectiveAgainst.equals(anotherPokemon.type);
    }
    public String getEffectiveAgainst(){
        return effectiveAgainst;
    }

    public String getName(){
        return name;
    }

    public String getType(){
        return type;
    }

   }

