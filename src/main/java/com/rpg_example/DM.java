package com.rpg_example;
import java.util.Random;

public class DM {
    /* Generate some static methods for the Dungeom Master */
    public static int rollStats() {
        Random rand = new Random();
        int stats = rand.nextInt(13) + 6;
        return stats;
    }

    /* stats modifier */
    public static int getStatsModifier(int stats) {
        int modifier = 0;
        /* TODO (if you want Above & Beyond)
            Do Image Search for: ability scores and modifiers
        */
        return stats + modifier;
    }
}
