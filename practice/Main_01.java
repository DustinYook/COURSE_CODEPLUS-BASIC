package practice;

import java.util.Scanner;

public class Main_01 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		String str1 = sc.next();
		String str2 = sc.next();
		System.out.println(str1.concat(str2));
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		System.out.println(num1 + num2);
		
		double num3 = sc.nextDouble();
		double num4 = sc.nextDouble();
		System.out.println(num3 + num4);
	}
}
