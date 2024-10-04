package se.anna.dicegame2;

import static se.anna.dicegame2.Players.*;

public class Main {
    public static void main(String[] args) {
        while (true) {
            Players players = new Players();
            players.playerAmount();

            PlayGame game = new PlayGame();
            game.gameplay(players.getPlayers());
            game.calculateWinner(players.getPlayers());

            PlayAgain playAgainInstance = new PlayAgain();
            if (!playAgainInstance.playAgain()) {   //! negates the boolean value returned by playAgain()
                break;                              //If the negated value is true, this means that the original
            }                                       //value was false. I.e., the user chose not to play again.
        }
        scanner.close();
        System.out.println("Goodbye!");
    }
}
