import java.util.Scanner;
//Class attributes
public class Session{
    private int minRange;
    private int maxRange;
    private int gameAmount;
    private int guessAmount;

    //Class constructor
    public Session(int minRange,int maxRange, int gameAmount, int guessAmount)
    {
        this.minRange = minRange;
        this.maxRange = maxRange;
        this.gameAmount = gameAmount;
        this.guessAmount = guessAmount;
    }
    //Session creator --- instantiation??
    public void startSession(Scanner consoleRead)
    {
        //Display choices back to user
        System.out.println("You have selected to play: "
                + gameAmount + " games with " + guessAmount + "guesses per game!");
        //Start game logic


    }
}
