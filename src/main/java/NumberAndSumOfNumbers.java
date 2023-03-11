
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // set a variable to store the count of inputs given
        int countOfInputs = 0;
        // set a variable to store the sum of the inputs given
        int sumOfInputs = 0;

        // prompt the user for an input in a loop
        while (true) {
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());

            // if the number is not equal to 0, increment the count of inputs, and add the current number to the sum
            if(number != 0) {
                countOfInputs = countOfInputs + 1;
                sumOfInputs = sumOfInputs + number;
            // if the number is 0, print the count of input and sum of the inputs given and break the loop
            } else {
                System.out.println("Number of numbers: " + countOfInputs);
                System.out.println("Sum of the numbers: " + sumOfInputs);
                break;
            }
        }
    }
}
