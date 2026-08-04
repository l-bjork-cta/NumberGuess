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
    //Session creator
    public void startSession(Scanner consoleRead)
    {
        //Display choices back to user
        System.out.println("You have selected to play: "
                + gameAmount + " games with " + guessAmount + " guesses per game!");
        System.out.println("Range is set between: " + minRange + " and " + maxRange);
        //Start game logic
        //win amount tracker
        int gamesWins = 0;
        //Games will loop in here until amount of games selected has been reached.
        for(int i = 0; i < gameAmount; i++)
        {
            //Increment game amounts
            i++;
            //Random number generated
            int target = Utility.RandNumberGen(minRange, maxRange);

            //current game loop
            for (int j = 0; j < guessAmount; j++)
            {
                //increment guesses
                j++;
                //prompt user for guess
                int guess = Utility.IsValidInt(consoleRead, "Type a guess:");
                //check guess
                if(guess == target)
                {
                    //break loop, and set win conditions
                    gamesWins++;
                    System.out.println("Correct!");
                    break;
                }
                //else - guide user in right direction
                else if (guess > target)
                {
                    System.out.println("Try a smaller number");
                }
                else {System.out.println("Try a larger number");}
            }



        }



    }
}
