package se.anna.dicegame2;

import java.util.Random;

public class Diceroll {
    public int roll() {
        Random random = new Random();
        int roll = random.nextInt(6) + 1;
        return roll;
    }
}