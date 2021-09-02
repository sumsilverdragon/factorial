/* this program determines the factorial of a user input integer
    factorial is a num multiplied by each of its preceding numbers
            n! = n * (n-1)! */

//import scanner
import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        //declare variables
        //num will start with user input value
        int num;
        //factorial will be used in calculation
        long factorial = 1;
        //declare scanner object
        Scanner input = new Scanner(System.in);

        //assign user input to num
        System.out.println("Enter the number, to determine its factorial");
        num = input.nextInt();
        //close scanner
        input.close();

        //check that user has entered a valid positive number, else display error message
        if (num < 0) {
            System.out.println("Can't determine the factorial of a negative number");
        }
        else if (num <= 1) {
            //use f string
            System.out.printf("%d! = %d", num, factorial);
        }
        else {
            //for loop to determine factorial, declare a loop counter: starts at num, decrement--, condition:exits for loop when counter is 2
            for( int counter = num; counter >= 2; counter --) {
                factorial = factorial * counter;
            }
            //display result
            System.out.printf("%d! = %d", num, factorial);
        }

    }
}
