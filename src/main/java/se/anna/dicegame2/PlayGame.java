package se.anna.dicegame2;

import java.util.ArrayList;
import static se.anna.dicegame2.Players.scanner;

public class PlayGame {

    private ArrayList<Integer> rollSum = new ArrayList<>();

    public void gameplay(ArrayList<String> players) {
        System.out.println("How many dice should each player roll?");
        int amountOfRolls = scanner.nextInt();
        scanner.nextLine();
        Diceroll roll = new Diceroll();

        for (int i = 0; i < players.size(); i++) {
            System.out.println(players.get(i) + ", roll your dice by pressing Enter.");
            scanner.nextLine();

            //ADDS EACH PLAYER'S ROLLS INTO A SUM
            int sum = 0;
            for (int j = 0; j < amountOfRolls; j++) {
                sum += roll.roll();
            }
            rollSum.add(sum);       //places the sums of the player's rolls into ArrayList rollSum
            System.out.println(players.get(i) + ", the sum of your dice adds up to " + sum);
        }
    }

    public void calculateWinner(ArrayList<String> players) {
        int largest = 0;
        int winningIndex = 0;
        //loops through the ArrayList rollSum and updates the integer largest
        for (int i = 0; i < rollSum.size(); i++) {
            int winningNumber = rollSum.get(i);
            //checks if winningNumber (the current number in the loop) is greater than largest
            if (winningNumber > largest) {
                largest = winningNumber;
                winningIndex = i; //if yes, winningIndex is updated to the current index
            }
        }
        System.out.println("\nThe highest sum of rolled dice is " + largest + ". " + players.get(winningIndex)
                + " wins!");
    }
}
