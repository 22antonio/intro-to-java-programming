package lab6;
/*
 *  Name: Antonio Medel
 *  Class: CSIS 293-6876
 *  Assignment: 4.2 Lab 6
 *  
 */

public class testComplex {

	public static void main(String[] args) {
		
		// creates Complex numbers
		Complex num1 = new Complex(5.0F, 11.0F);
		Complex num2 = new Complex(4.0F, 5.0F);
		Complex num3 = new Complex();
		Complex result;
		
		// displays the initial values of the complex numbers
		num1.displayComplexNum();
		num2.displayComplexNum();
		num3.displayComplexNum();
		
		System.out.println(" ");
		
		// adds and subtracts the two complex numbers
		result = num1.add(num2);
		result.displayComplexNum();
		
		result = num1.subtract(num2);
		result.displayComplexNum();
		
		result = num3.add(num1);
		result.displayComplexNum();
	}

}
