package chapter01;

import java.util.Scanner;

public class Main_9613 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt(); // 테스트 케이스의 수 입력
		
		while(t-- > 0)
		{
			int n = sc.nextInt(); // 입력받을 매개변수 입력
			int n_copy = n;
			int[] arr = new int[n]; // 숫자가 저장될 공간

			int idx = 0;
			while(n-- > 0)
				arr[idx++] = sc.nextInt();
			
			long sum = 0;
			for(int i = 0; i < n_copy; i++)
				for(int j = i + 1; j < n_copy; j++)
					sum += gcd(arr[i], arr[j]);
			System.out.println(sum);
		}
	}
	
	public static int gcd(int a, int b)
	{
		if(b == 0)
			return a;
		else
			return gcd(b, a % b);
	}
}