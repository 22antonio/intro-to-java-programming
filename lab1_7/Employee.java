package lab1_7;

// This is the employee class. It contains a contructor that initializes instance variables.

public class Employee {
	private String fName;
	private String lName;
	private double monthlySalary;
	
	// constructor
	public Employee(String fName, String lName, double monthlySalary) {
		this.fName = fName;
		this.lName = lName;
		this.monthlySalary = monthlySalary;
	}
	
	// set methods
	public void setFirstName(String fName) {
		this.fName = fName;
	}
	
	public void setLastName(String lName) {
		this.lName = lName;
	}
	
	public void setMonthlySalary(double monthlySalary) {
		this.monthlySalary = monthlySalary;
	}
	
	// get methods
	public String getFirstName() {
		return fName;
	}
	
	public String getLastName() {
		return lName;
	}
	
	public double getMonthlySalary() {
		return monthlySalary;
	}
	
	public double getYearlySalary() {
		return monthlySalary * 12;
	}
	
}
