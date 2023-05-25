package com.rpg_example;

public class Character {
    // add fields
    private String name;
    private int strength;
    private int dexterity;

    // Constructor Method
    public Character(String name) {
        this.name = name;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }
    
    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength += strength;
    }

    public int getDexterity() {
        return dexterity;
    }

    public void setDexterity(int dexterity) {
        this.dexterity += dexterity;
    }

    // toString override
    public String toString() {
        String output = "Character\n";
        output += "Name: " + this.name;
        output += "\nStrength: " + this.strength;
        output += "\nDexterity: " + this.dexterity;
        return output;
    }
}
