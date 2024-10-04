package se.anna.dicegame2;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Players {
    static Scanner scanner = new Scanner(System.in);
    private ArrayList<String> players = new ArrayList<>();

    public ArrayList<String> getPlayers() {
        return players;
    }

    public void playerAmount(){
        while (true) {
            System.out.println("Choose amount of players.");
            try {
                int amountOfPlayers = scanner.nextInt();
                scanner.nextLine();
                //FAILSAFE FOR NEGATIVE INT INPUT
                if (amountOfPlayers <= 0){
                    System.out.println("Invalid input. Please choose a positive number.");
                    continue;       //loop back to prompt
                }
                chooseName(amountOfPlayers);
                break;              //exit loop if input is valid
            //FAILSAFE FOR NON-INTEGER INPUT
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please input a number.");
                scanner.nextLine(); //clear the invalid input
            }
        }
    }

    public void chooseName(int amountOfPlayers) {
        for (int i = 1; i <= amountOfPlayers; i++) {
            System.out.println("Input name for player " + i);
            String player = scanner.nextLine();
            players.add(player);        //adds input from scanner into ArrayList players
        }
        // ALTERNATIVE SYSTEMOUTPRINT FOR WELCOMING PLAYERS
        /*for (String allPlayers : players) {
            System.out.print("Welcome " + allPlayers + "! ");
        }*/
        System.out.println("Welcome "+players+"!");
    }
}
