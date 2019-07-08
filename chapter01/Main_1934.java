package chapter01;

import java.util.Scanner;

public class Main_1934 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t-- > 0)
		{
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println((a * b) / gcd(a, b));
		}
	}
	
	// 유클리드 호제법의 재귀함수 구현
	public static int gcd(int a, int b)
	{
		if(b == 0)
			return a;
		else
			return gcd(b, a % b);
	}
}