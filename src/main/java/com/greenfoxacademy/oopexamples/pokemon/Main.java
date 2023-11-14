package com.greenfoxacademy.oopexamples.pokemon;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Pokemon pokemon1 = new Pokemon("Pikacu", "water", "fire");
        Pokemon pokemon2 = new Pokemon("Rajcu", "earth", "grass");
        Pokemon pokemon3 = new Pokemon("Cojavim", "fire", "water");

        System.out.println(pokemon1.getName() + " " + pokemon1.getType() + pokemon1.getEffectiveAgainst());

        List<Pokemon> pokemonListOfAsh = initializePokemons();

        Pokemon wildPokemon = new Pokemon("Oddish", "grass", "water");

        for (Pokemon p : pokemonListOfAsh) {
            if (p.isEffectiveAgainst(wildPokemon)) {
                System.out.println("I choose you, " + p.getName());

            }

        }

    }

    private static List<Pokemon> initializePokemons() {
        List<Pokemon> pokemon = new ArrayList<>();

        pokemon.add(new Pokemon("Bulbasaur", "grass", "water"));
        pokemon.add(new Pokemon("Pikachu", "electric", "water"));
        pokemon.add(new Pokemon("Charizard", "fire", "grass"));
        pokemon.add(new Pokemon("Pidgeot", "flying", "fighting"));
        pokemon.add(new Pokemon("Kingler", "water", "fire"));

        return pokemon;
    }

}
