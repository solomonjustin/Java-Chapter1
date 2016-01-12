public class Lab4
{
	public static void main(String[] args)
	{
		//declaring of vars

		char star = '*';
		int numOfStars = 1;
		int maxStars = 7;
		int whiteSpaces = maxStars/2;
		

		//displaying each var's value

		for(int a = 1; a <= maxStars; ++a)
		{
			for(int b = 1; b <= whiteSpaces; ++b)
			{
				System.out.printf(" ");
			}

			for(int i = 1; i <= numOfStars; ++i)
			{
				System.out.printf("%s", star);
			}

			System.out.println("\n");

			if(a < 4)
			{
				numOfStars = numOfStars + 2;
				whiteSpaces = whiteSpaces - 1;
			}

			else
			{
				numOfStars = numOfStars - 2;
				whiteSpaces = whiteSpaces + 1;
			}	

		}
		
	}
}