//This program will calculate a consumer calorie intake from a bag of cookies
//The bag contains 40 cookies
//4 cookies equals 1 serving
//Each serving is 300 calories

//import scanner
import java.util.Scanner;
public class Lab5
{
	public static void main(String[] args)
	{
		//declaring of vars

		double caloriePerCookie = 300/4;
		int maxCookies = 40;
		double userCalories;
		int userCookieCount;
		
		
		//create scanner object to read keyboard input
		Scanner keyboard = new Scanner(System.in);

		//receive user input
		do
		{
			System.out.print("How many cookies did you eat? ");
			userCookieCount = keyboard.nextInt();
		}while(userCookieCount > maxCookies || userCookieCount < 0);
		
		//display user results
		userCalories = userCookieCount * caloriePerCookie;

		System.out.printf("You consumed a total of %.2f calories.\n", userCalories);

		
		
	}
}