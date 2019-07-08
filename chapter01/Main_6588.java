package chapter01;

import java.util.Scanner;

public class Main_6588 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		// 매번 에라토스테네스의 체를 이용해서 구하면 시간초과 뜸 -> 반드시 미리 한 번만 구해야 함
		final int MAX = 1000000;
		
		int[] prime = new int[MAX]; // 소수를 저장하는 배열
		boolean[] check = new boolean[MAX + 1]; // true이면 소수가 아님
		
		int idx = 0;
		for(int i = 2; i < MAX; i++)
		{
			if(check[i] == false) // i가 소수라면
				prime[idx++] = i; // 소수목록에 추가
			
			for(int j = i + i; j < MAX; j += i) // i의 모든 배수들을 
				check[j] = true; // 소수가 아니라고 표시
		}
		
		int n;
		while((n = sc.nextInt()) != 0) 
		{
			for(int i = 0; i < prime.length; i++)
			{
				int a = prime[i];
				int b = n - a;
				if(!check[b]) // 소수이면 아래 블록을 수행
				{
					System.out.println(String.format("%d = %d + %d", n, a, b));
					break;
				}
			}
		}
	}
}