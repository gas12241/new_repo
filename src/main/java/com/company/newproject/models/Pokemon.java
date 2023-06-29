package com.company.newproject.models;

import com.company.newproject.controllers.PokemonController;

import java.util.Objects;

public class Pokemon {
    private Integer pokemonID;
    private String name;
    private Integer health;

    public Pokemon(Integer pokemonID, String name, Integer health) {
        this.pokemonID = pokemonID;
        this.name = name;
        this.health = health;
    }

    public Integer getPokemonID() {
        return pokemonID;
    }

    public void setPokemonID(Integer pokemonID) {
        this.pokemonID = pokemonID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHealth() {
        return health;
    }

    public void setHealth(Integer health) {
        this.health = health;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pokemon pokemon = (Pokemon) o;
        return Objects.equals(getPokemonID(), pokemon.getPokemonID()) && Objects.equals(getName(), pokemon.getName()) && Objects.equals(getHealth(), pokemon.getHealth());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPokemonID(), getName(), getHealth());
    }

    @Override
    public String toString() {
        return "Pokemon{" +
                "pokemonID=" + pokemonID +
                ", name='" + name + '\'' +
                ", health=" + health +
                '}';
    }
}
