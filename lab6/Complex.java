package lab6;
/*
 *  Name: Antonio Medel
 *  Class: CSIS 293-6876
 *  Assignment: 4.2 Lab 6
 *  
 */

public class Complex {

	private float realPart, imaginaryPart;
	
	Complex(){ 														// constructor that provides default values of 0.
		realPart = 0;
		imaginaryPart = 0;
	}
	
	Complex(float real, float imaginary){							// constructor with provided values
		realPart = real;
		imaginaryPart = imaginary;
	}
	
	Complex add(Complex input){										// add method that adds two complex numbers together
		Complex sum = new Complex();
		sum.realPart = realPart + input.realPart;
		sum.imaginaryPart = imaginaryPart + input.imaginaryPart;
		return sum;
	}
	
	 Complex subtract(Complex input) {								// subtract method that subtracts two complex numbers
		Complex diff = new Complex();
		diff.realPart = realPart - input.realPart;
		diff.imaginaryPart = imaginaryPart - input.imaginaryPart;
		return diff;
	}
	
	public void displayComplexNum() {								// display method that displays the resultant complex number
		System.out.println(realPart + " + " + imaginaryPart + "i");
	}
	

}
