import java.util.Scanner;
import java.util.Random;

public class HighorLow {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random gen = new Random();
        int guess = 0;
        Boolean Valid = false;
        String Bad = "";
        int val = gen.nextInt(10)+ 1;

        do {
            System.out.println("Guess a number between 1 and 10");
            if (input.hasNextInt()){
                guess = input.nextInt();
                input.nextLine();
                Valid = true;
            }
            else {
                Bad = input.nextLine();
                System.out.println("You have entered " + Bad);
                System.out.println("Please enter a valid value");

            }
        }while(!Valid);
        System.out.println("The random number is " + val);
        if (Valid){
            System.out.println("You have entered " + guess);
            if (guess == val){
                System.out.println("You were dead on with your guess");
            }
            else if (guess > val){
                System.out.println("You were too high with your guess");
            }
            else if (guess < val){
                System.out.println("You were too low with your guess");
            }
        }

    }
}
