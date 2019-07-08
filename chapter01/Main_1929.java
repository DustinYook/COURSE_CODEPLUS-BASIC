package chapter01;

import java.util.ArrayList;
import java.util.Scanner;

public class Main_1929 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		ArrayList<Integer> arr = eratos(n);
		
		for(int a : arr)
		{
			if(a >= m)
				System.out.println(a);
		}
	}
	
	public static ArrayList<Integer> eratos(int n)
	{
		ArrayList<Integer> prime = new ArrayList<Integer>(); // 소수 저장
		boolean[] check = new boolean[n + 1]; // 지워졌으면 true
		int pn = 0; // 소수의 개수
		
		check[0] = true;
		check[1] = true; // 1은 제외
		for(int i = 2; i < check.length; i++)
			check[i] = false;
		
		for(int i = 2; i <= n; i++)
		{
			if(check[i] == false) // i가 지워지지 않았으면
			{
				prime.add(i); // i를 prime number로 등록하고
				
				// 오버플로우의 위험성 때문에 i*i로는 잘 쓰지 않음
				for(int j = i + i; j <= n; j += i) // i의 배수를 모두 지움
					check[j] = true;
			}
		}
		return prime;
	}
}