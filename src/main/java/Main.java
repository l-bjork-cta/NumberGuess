import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Create scanner
        Scanner consoleRead = new Scanner(System.in);

        //Ask user for min and max range for session
        int sessionMinRange = Utility.IsValidInt(consoleRead, "Input lower boundary:");
        //Current issue - upper boundary can be set to be lower than lower boundary
        int sessionMaxRange = Utility.IsValidInt(consoleRead, "Input upper boundary:", sessionMinRange);
        int sessionGameAmount = Utility.IsValidInt(consoleRead, "Input the number of games to be played:");
        int sessionGuessAmount = Utility.IsValidInt(consoleRead, "Input the number of guesses per game:");

        //Create session object and pass in vars gotten from consoleRead
        Session gameSession = new Session(sessionMinRange, sessionMaxRange, sessionGameAmount, sessionGuessAmount);
        gameSession.startSession(consoleRead);
        //Close reader
        consoleRead.close();

    }
}
