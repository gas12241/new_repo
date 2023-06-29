package com.company.newproject.controllers;

import com.company.newproject.models.Pokemon;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.Objects;
import java.util.Random;

public class PokemonController {
    private Pokemon[] pokemons = {
            new Pokemon(1, "Squirtle", 75),
            new Pokemon(2, "Charmander", 80),
            new Pokemon(3, "Bulbasaur", 70),
    };

    @RequestMapping(value = "/pokemon", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public Pokemon getPokemon() {

        Random rand = new Random();

        return pokemons[rand.nextInt(3)];
    }
}
