package se.anna.dicegame2;

import java.util.InputMismatchException;
import static se.anna.dicegame2.Players.scanner;

public class PlayAgain {

    public boolean playAgain() {
        while (true) {
            try {
                System.out.println("Play again? Input 1 for yes or 2 for no.");
                int yesOrNo = scanner.nextInt();
                scanner.nextLine();
                if (yesOrNo == 1) {
                    return true;
                } else if (yesOrNo == 2) {
                    System.out.println("Thank you for playing!");
                    scanner.close();
                    return false;
                } else {
                    System.out.println("That is not a 1 (play another game) or 2 (exit the program).");
                }
            //FAILSAFE FOR INPUTS THAT ARE NOT 1 OR 2
            } catch (InputMismatchException e) {
                System.out.println("That is not a 1 (play another game) or 2 (exit the program).");
                scanner.nextLine();
            }
        }
    }
}
