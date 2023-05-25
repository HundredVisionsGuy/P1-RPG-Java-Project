package com.rpg_example;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        System.out.println("We have a new character!\n");
        Character hero = new Character("Phred");
        System.out.println(hero);

        // Demonstrate the getters and setters
        hero.setDexterity(9);
        hero.setStrength(11);
        hero.setStrength(-5);
        System.out.println(hero.getDexterity());

        System.out.println(hero);
    }
}
