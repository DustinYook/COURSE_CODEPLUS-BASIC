package practice;

import java.util.Scanner;

public class Main_02 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the iteration number : ");
		int iteration = sc.nextInt();
		
		for(int i = 0; i < iteration; i++)
		{
			System.out.print("Enter num1 : ");
			int num1 = sc.nextInt();
			System.out.print("Enter num2 : ");
			int num2 = sc.nextInt();
			System.out.println(String.format("%d + %d = %d", num1, num2, num1 + num2));
		}
		
		while(iteration-- > 0)
		{
			System.out.print("Enter num1 : ");
			int num1 = sc.nextInt();
			System.out.print("Enter num2 : ");
			int num2 = sc.nextInt();
			System.out.println(String.format("%d + %d = %d", num1, num2, num1 + num2));
		}
	} 
}
