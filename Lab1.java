//This program will store my age, name, a desired annual income as literals
//It will also dispay these values on screen

public class Lab1
{
	public static void main(String[] args)
	{
		//vars that will be used in the income profile

		String name = "Justin Solomon";
		int age = 20;
		int desiredIncome = 150000;

		System.out.printf("My name is %s, my age is %d, and I hope to earn $%,d a year.\n", name, age, desiredIncome);
	}
}