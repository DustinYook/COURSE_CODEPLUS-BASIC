package chapter01;

import java.util.Scanner;

public class Main_2609 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();

		System.out.println(gcd(num1, num2));
		System.out.println((num1 * num2) / gcd(num1, num2));
	}
	
	// 유클리드 호제법을 재귀함수로 구현
	public static int gcd(int a, int b)
	{
		if(b == 0)
			return a;
		else
			return gcd(b, a % b);
	}
}