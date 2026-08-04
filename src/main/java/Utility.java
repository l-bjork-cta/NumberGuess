import java.util.Random;
import java.util.Scanner;

public class Utility {
    public static int RandNumberGen(int minRandBound, int maxRandBound)
    {
        Random randNumObj = new Random();
        //calc random number based on bounds
        int randNum = randNumObj.nextInt(minRandBound, maxRandBound);
        //return random number for use in session
        return randNum;
    }

    public static int IsValidInt(Scanner scanner, String prompt)
    {
        //Print initial prompt
        System.out.println(prompt);
        //While the scanner doesnt have an int
        while(scanner.hasNextInt() == false)
        {
            //tell user the input expectations
            System.out.println("Invalid Input! Ensure a whole number is used");
            //drop current scanner value
            scanner.next();
            //prompt user to re-enter
            System.out.println(prompt);
        }
        //return actual int value
        return scanner.nextInt();
    }
}
