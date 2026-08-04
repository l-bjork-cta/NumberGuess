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
    //Default method for IsValidInt
    public static int IsValidInt(Scanner scanner, String prompt)
    {
        //Print initial prompt
        System.out.println(prompt);
        //While the scanner doesn't have an int
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
    //Overloading the IsValidInt check to pass through the min range
    public static int IsValidInt(Scanner scanner, String prompt, int minRange)
    {
        int result = 0;
        while(true)
        {
            //Print initial prompt
            System.out.println(prompt);

            //check if input is an integer
            if(scanner.hasNextInt() == true)
            {
                //setting input to result
                result = scanner.nextInt();
                //is result larger than minimum range?
                if(result > minRange)
                {
                    //if so break out of loop
                    break;
                }
                else
                {
                    //else, correct the user for valid input
                    System.out.println("Invalid Input! Ensure input is larger than minimum range");
                }
            }
            else
            {
                //else - tell user that it has to be a whole number
                System.out.println("Invalid Input! Ensure a whole number is used");
                //empty the scanner as it didn't pass the int check
                scanner.next();
            }
        }
        //return the result for max range
        return result;
    }
}
