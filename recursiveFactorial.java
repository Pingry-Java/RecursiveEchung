import java.util.Scanner;

public class recursiveFactorial
{
	public static Scanner scan = new Scanner(System.in);
	public static void main(String[] args)
	{
		System.out.println("Enter a positive integer value to find its factorial");
		String numb = scan.nextLine();
		
		int number = Integer.parseInt(numb);
		System.out.println(factorial(number));
	}
	
	public static int factorial(int number)
	{
		if (number == 0)
		{
			return 1;
		}
		return number * factorial(number - 1);	
	}
}