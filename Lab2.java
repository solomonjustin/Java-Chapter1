public class Lab2
{
	public static void main(String[] args)
	{
		//declaring of vars

		//strings
		String firstName = "Justin";
		String middleName = "Mikhail";
		String lastName = "Solomon";

		//chars
		char firstInitial = 'J';
		char middleInitial = 'M';
		char lastInitial = 'S';

		//displaying each var's value
		System.out.printf("First Name: %-20sMiddle Name: %-20sLast Name: %-20s\nFirst Initial: %-17sMiddle Initial: %-17sLast Initial: %-17s\n", firstName, middleName, lastName, firstInitial, middleInitial, lastInitial);
	}
}