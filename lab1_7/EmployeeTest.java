package lab1_7;
// Test driver that creates two new employees, 
// initializes the instance variables with the 
// contructor and calls yearlySalary to display 
// the yearly salary. Then it gives them each a 
// 10% raise by getting and setting the new 
// monthly salary.

public class EmployeeTest {

	public static void main(String[] args) {
		Employee firstEmployee = new Employee("John", "Green", 1500.00);
		Employee secondEmployee = new Employee("Jane", "Green", 1600.00);
		double yearlySalary;
		
		// print the initial names and salary of employees
		System.out.printf("The employees first name is %s%n", firstEmployee.getFirstName());
		System.out.printf("The employees last name is %s%n", firstEmployee.getLastName());
		System.out.printf("The employees yearly salary is %.2f%n%n", firstEmployee.getYearlySalary());
		
		// print the initial names and salary of employees
		System.out.printf("The employees first name is %s%n", secondEmployee.getFirstName());
		System.out.printf("The employees last name is %s%n", secondEmployee.getLastName());
		System.out.printf("The employees yearly salary is %.2f%n%n", secondEmployee.getYearlySalary());
		
		// test set methods and print new names and salaries
		firstEmployee.setFirstName("John");
		firstEmployee.setLastName("Doe");
		firstEmployee.setMonthlySalary(2000.00);

		System.out.printf("The employees first name is %s%n", firstEmployee.getFirstName());
		System.out.printf("The employees last name is %s%n", firstEmployee.getLastName());
		System.out.printf("The employees yearly salary is %.2f%n%n", firstEmployee.getYearlySalary());

		// test set methods and print new names and salaries
		secondEmployee.setFirstName("Jane");
		secondEmployee.setLastName("Doe");
		secondEmployee.setMonthlySalary(2500.00);
		
		System.out.printf("The employees first name is %s%n", secondEmployee.getFirstName());
		System.out.printf("The employees last name is %s%n", secondEmployee.getLastName());
		System.out.printf("The employees yearly salary is %.2f%n%n", secondEmployee.getYearlySalary());
		
		// give them a 10 percent raise and print their new yearly salary
		yearlySalary = firstEmployee.getYearlySalary();
		firstEmployee.setMonthlySalary((yearlySalary * 1.1)/12);
		System.out.printf("The employees yearly salary with a 10 percent raise is %.2f%n", firstEmployee.getYearlySalary());
		
		yearlySalary = secondEmployee.getYearlySalary();
		secondEmployee.setMonthlySalary((yearlySalary * 1.1)/12);
		System.out.printf("The employees yearly salary with a 10 percent raise is %.2f%n", secondEmployee.getYearlySalary());
	}

}
