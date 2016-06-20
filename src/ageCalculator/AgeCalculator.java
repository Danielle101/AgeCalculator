//this app calculates the users age based on user input
package ageCalculator;

import java.time.LocalDate;
import java.util.*;

public class AgeCalculator {

	public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        String choice = "y";
		Scanner scan = new Scanner(System.in);
		// Gets current year
		int currentYear = LocalDate.now().getYear();
		//gets current month
        int currmonth = cal.get(cal.MONTH);


		// Ask user for age input
		System.out.print("How old are you now? ");

		// user inputs age
		int currentAge = Validator.getValidInt(1, 130);
		System.out.println("Please enter the month your were born?(1-12):");
		int userMonth = scan.nextInt();
		while (choice.equalsIgnoreCase("y")) {
			// Ask the user for the year they would like to know how old they were in
			System.out.print("What is the year you want to know how old you were, are, or will be in?: ");
			int inputYear = scan.nextInt();

			// calculate how many years to add to the user's current age.
			int yearsToAdd = inputYear - currentYear;

			// Next, we add the result from above to the user's current age.
			int ageThen = currentAge + yearsToAdd;

			// display the users age and the year the user input
			if (ageThen > 1 && inputYear == 2016 && userMonth > currmonth) {
				System.out.println("You are "+ageThen+ " years old. You will be " + (ageThen+1) + " years old in month " + userMonth +" of "+ inputYear + ".");}
			if (ageThen > 1 && inputYear > 2016) {
				System.out.println("You will be " + ageThen + " years old in " + inputYear + ".");
			} else if (ageThen == 1) {
				System.out.println("You were " + ageThen + "  year old in " + inputYear + ".");
			} else if (inputYear < (currentYear - currentAge)) {
				System.out.println("You had not been born yet.");
			} else if (inputYear < 2016) {
				System.out.println("You were " + ageThen + " years old in " + inputYear + ".");
			}
			// ask the user if they'd like to enter another year

			choice = Validator.getString("\nWould you like to enter another year?(y/n):");
		}
	}
}
