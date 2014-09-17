package nvcc.scs200;
import java.util.Scanner;
/*
 * Author: Kyle Dela Rosa	
 * Date: 9/15/2014
 * Purpose: Find 
 * Algorithm;
 * 1. Establish Interest constant before the method
 * 2. Prompt the user for monthly mortgage payment
 * 3. Identify the keyboard input 
 * 4. read input from user keyboard as an integer (mortgage)
 * 5. Prompt user for current balance of the mortage
 * 6. Read input from user keyboard as an integer (balance)
 * 7. close the keyboard
 * 8. Multiply balance by interest rate and divide by 12 to find interest amount monthly
 * 9. Output the interest amount
 * 10.Find what is paid to mortgage
 * 11.Output the paid amount to mortgage per month  
 * 
 */

public class Assignment1 {
	
	//Establish Interest constant before the method
	public static final double INTEREST_RATE = 0.0749;

	public static void main(String[] args) {
	    //Prompt the user for monthly mortgage payment
		System.out.println("What is your monthly mortgage payment? ");
		//Identify the keyboard input 
		Scanner keyboard = new Scanner(System.in);
		//Read input from user keyboard as an integer (mortgage)
		int mortgage = keyboard.nextInt();
		//Prompt user for current balance of the mortage
	        System.out.println("What is your current balance on your mortgage?");
		//Read input from user keyboard as an integer (balance)
		int balance = keyboard.nextInt();
		//close the keyboard
		keyboard.close();
		//Multiply balance by interest rate and divide by 12 to find interest amount monthly
		double interestAmount = ((balance * INTEREST_RATE) / 12);
		//Output the interest amount
		System.out.println("This month's paid interest is " + interestAmount);
		//Find what is paid to mortgage
		double paidToMortgage = mortgage - interestAmount;
		//Output the paid amount to mortgage per month
		System.out.println("The amount paid towards the mortgage is " + paidToMortgage);
		
		
		

	}

}
