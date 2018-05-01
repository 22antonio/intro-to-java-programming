package lab4;
import java.util.Scanner;

public class Largest {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);		// create a scanner for user input
		
		int counter = 0;									// a counter to count to 10
		int number;										// the integer most recently input by the user
		int largest = 0;									// the largest number so far
		
		System.out.println("Please enter 10 numbers: "); // prompt the user to enter 10 numbers
		while (counter < 10) {							// a while loop until counter is < 10
			number = userInput.nextInt();				// number will take in the user input
			if (number > largest) {						// check if the number entered is larger than the largest number so far
				largest = number;
			}
			counter++;									// increment counter
		}
		
		System.out.print(largest);						// print the largest number
	}

}
