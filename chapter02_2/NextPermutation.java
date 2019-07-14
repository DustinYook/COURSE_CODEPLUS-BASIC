package chapter02_2;

import java.util.Scanner;

public class NextPermutation 
{
	public static boolean next_permuation(int[] a)
	{
		// i를 구함
		int i = a.length - 1;
		while(i > 0 && a[i-1] >= a[i])
			i -= 1;
		
		if(i <= 0)
			return false; // 마지막 순열
		
		// j를 구함
		int j = a.length - 1;
		while(a[j] <= a[i-1])
			j -= 1;
		
		// i와 j의 순서를 바꿈
		int temp = a[i-1];
		a[i-1] = a[j];
		a[j] = temp;
		
		// 순열을 뒤집음
		j = a.length - 1;
		while(i < j)
		{
			temp = a[i];
			a[i] = a[j];
			a[i] = temp;
			i += 1;
			j -= 1;
		}
		return true;
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0; i < n; i++)
			a[i] = i + 1;
		
		do 
		{
			for(int i = 0; i < n; i++)
				System.out.println(a[i] + " ");
			System.out.println();
		} while(next_permuation(a));

	}
}
