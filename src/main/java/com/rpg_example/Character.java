package com.rpg_example;

public class Character {
    private String name;
    private int strength;

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public Character(String charName) {
        name = charName;
    }
    
    public String toString() {
        return name;
    }
}
