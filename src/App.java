// import the random library
import java.util.Random;
import java.util.Scanner;

class randomNumber{
    public static void main(String[] args) {
        //Creating a varible so I know when they get it right so I can break the loop
        boolean correctNumber = false;
        //The number class should select a random number
        //initiate random
        Random rand = new Random();
        //Assign a boundary for the random number this is trivial
        int bound = 10;
        //Give them three tries to guess the number
        int tries = 3;
        //Actually create the random number and assign it to num
        int num = rand.nextInt(bound);
        System.out.println("Guess the Number! You have " + tries + " tries! The number can be another 0-10!");
        //Loop untill they guess the correctNumber or they run out of tries
        while (correctNumber == false && tries > 0)   {
            //initiate the scanner
            Scanner scanner = new Scanner(System.in);
            //Takes away one try for every failed attempt
            tries = (tries-1);
            //sets input equal to the number you enter
            int input = scanner.nextInt();
            //checks to see if the random number(num) is equal to the number inputted(input)
            if (num == input) {
                //Just prints out a message congradulating them
                System.out.println("You guessed it! Great job!");
                //sets correct number to true so it breaks the while loop
                correctNumber = true;
                //insures that it breaks the loop
                break;
                //If tries is greater than 0 it will tell them how many tries they have left
            } else if(tries > 0) {
                //prints the trys they have remaining
                System.out.println("You got it wrong. Try again! You have " + tries + " tries left" );
        }
    }   // if they run out of tries it will go into this loop
        if (tries == 0) {
            //Lets them know what the number was
            System.out.println("Nice try! The number was " + num + " Feel free to try again!");
            
        }
    }
}
