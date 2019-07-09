package chapter02_1;

import java.util.Scanner;

public class Main_1476 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int e = sc.nextInt(); // 1 <= e <= 15
		int s = sc.nextInt(); // 1 <= s <= 28
		int m = sc.nextInt(); // 1 <= m <= 19
		
		int year = 1; // year를 구하기 위한 변수
		
		int i = 1; // e와 매핑
		int j = 1; // s와 매핑
		int k = 1; // m과 매핑
		
		while(true)
		{
			if(i == e && j == s && k == m)
			{
				System.out.println(year);
				break;
			}
			else
			{
				i++;
				j++;
				k++;
				
				year++;
				
				if(i == 16)
					i = 1;
				if(j == 29)
					j = 1;
				if(k == 20)
					k = 1;
			}
		}
	}
}