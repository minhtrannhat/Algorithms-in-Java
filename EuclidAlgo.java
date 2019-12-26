import java.util.Scanner;

public class EuclidAlgo
{
	public static void main(String[] args) 
	{
		Scanner reader = new Scanner(System.in);

		// take the user's input into m and n 
		System.out.print("Please input two positive integers: ");

		int m = reader.nextInt();
		int n = reader.nextInt();

		System.out.println("So the two Integers are " + m + " and " + n);

		if ( m < n )
		{
			int temp = m;
			m = n;
			n = temp;
			System.out.println(" The greatest common divisor of" + m + " and " + n + " is " + euclidAlgo(m, n));
		}

		else if (m == n) 
		{
			System.out.println(" Their greatest common divisor is 1");
		}

		else 
			System.out.println(" The greatest common divisor of " + m + " and " + n + " is " + euclidAlgo(m, n));
	}

	public static int euclidAlgo(int m, int n)
	{
		int r = m % n;

		if ( r == 0 )
		{
			return n;
		}

		else 
		{
			m = n;
			n = r;
			return euclidAlgo( m, n);
		}
	}
}
