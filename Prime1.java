import java.util.Scanner;
public class Prime1
{
	static boolean prime(int n)
	{
	int count=0;
	for(int i = 2; i<n; i++)
	{
		if(n % i ==0)
		{
			count++;
			}
			}
		if(count==0)
		{
			return true;
			}
			return false;
			}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc. nextInt();
		if(prime(n))
		{
		System.out.println("prime");
		}
		else
		{
			System.out.println("not prime");
			}
	}
}
		