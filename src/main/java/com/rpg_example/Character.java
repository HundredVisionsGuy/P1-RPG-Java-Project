package com.rpg_example;

public class Character {
    // private fields
    private String name;
    private int strength;
    private int dexterity;

    // instance methods
    public Character(String name) {
        this.name = name;
    }

    // getters and setters
    public String getName() {
        return name;
    }
    
    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }
    
    public int getDexterity() {
        return dexterity;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }


    // toString override
    public String toString() {
        String output = "Character Name: " + name;
        output += "\nStrength: " + strength;
        output += "\nDexterity: " + dexterity;
        return output;
    }
}
