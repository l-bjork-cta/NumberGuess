import java.util.Scanner;
public class Session {
    public static void main() {
        //Create scanner
        Scanner consoleRead = new Scanner(System.in);

        //Ask user for min and max range for session
        int sessionMinRange = Utility.IsValidInt(consoleRead, "Input lower boundary:");
        int sessionMaxRange = Utility.IsValidInt(consoleRead, "Input upper boundary:");
        int sessionGameAmount = Utility.IsValidInt(consoleRead, "Input the number of games to be played:");
        int sessionGuessAmount = Utility.IsValidInt(consoleRead, "Input the number of guesses per game:");

        //Pass ranges for number into random number generator and save to var
        int sessionRandNum = Utility.RandNumberGen(sessionMinRange,sessionMaxRange);



        //success of random num generated, show ranges
        System.out.println("New number generated in range " + sessionMinRange + " and " +sessionMaxRange + " !" );
        System.out.println("You will play: " + sessionGameAmount + " games, with " + sessionGuessAmount
                + " guesses per game");
        System.out.println("A new number within the ranges will be generated for each game");





    }
}
