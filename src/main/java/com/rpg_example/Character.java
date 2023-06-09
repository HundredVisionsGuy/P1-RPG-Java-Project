package com.rpg_example;

import java.util.ArrayList;

public class Character {

    // add fields
    private String name;
    private int strength = DM.rollStats();
    private int dexterity = DM.rollStats();
    private int strengthModifier = DM.getStatsModifier(strength);
    private ArrayList<String> inventory = new ArrayList<String>();
    private int maxInventorySize = 5;
    private int constitution;

    public static void main(String[] args) {
        System.out.println("Yo, I'm testing this Character class");
    }
    // Constructor Method
    public Character(String name) {
        this.name = name;
    }

    // Getters and Setters
    public int getConstitution() {
        return constitution;
    }

    public void setConstitution(int constitution) {
        this.constitution = constitution;
    }

    public ArrayList<String> getInventory() {
        return inventory;
    }

    public void addItem(String item) {
        // Don't allow the inventory to grow larger than a set amount
        // hint .size() 
        this.inventory.add(item);
    }
    
    public String getName() {
        return name;
    }
    
    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void addStrength(int amount) {
        this.strength += amount;
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
        output += "\nConstitution: " + this.constitution;
        return output;
    }
}
