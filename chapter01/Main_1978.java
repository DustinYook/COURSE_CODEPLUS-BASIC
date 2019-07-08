package chapter01;

import java.util.Scanner;

public class Main_1978 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int result = 0;
		
		while(n-- > 0)
		{
			int m = sc.nextInt();
			if(isPrime(m))
				result++;
		}
		
		System.out.println(result);
	}
	
	public static boolean isPrime(int num)
	{
		if(num < 2)
			return false;
			
		for(int i = 2; i * i <= num; i++)
		{
			if(num % i == 0)
				return false;
		}
		return true;
	}
}