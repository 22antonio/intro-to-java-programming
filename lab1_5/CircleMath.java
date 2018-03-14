package lab1_5;
// lab 1.5: CicleMath.java
// takes a radius from the user and calculates the diameter, circumference and area of the circle
import java.util.Scanner;

public class CircleMath {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter the radius of the circle: ");
		int radius = input.nextInt();
		
		double diameter = 2 * radius; 
		double circumgerence = 2 * Math.PI * radius;
		double area = Math.PI * radius * radius;
		
		System.out.printf("The diameter is: ");
		System.out.printf("The circumference is: ");
		System.out.printf("The area is: ");
		

	}

}
