// 핵심 아이디어 : 2명 뺀 나머지 더한게 100이 되는지 확인하는 것
package chapter02_1;

import java.util.Arrays;
import java.util.Scanner;

public class Main_2309 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int[] list = new int[9];
		
		/** 입력처리 */
		for(int i = 0; i < 9; i++)
			list[i] = sc.nextInt();
		
		/** 정렬처리 */
		Arrays.sort(list);

		/** 전체 합 */
		int tot = 0; // 9명 난쟁이 키의 합
		for(int i : list)
			tot += i;
		
		/** 제외할 2명을 고르는 처리 */
		boolean flag = false;
		for(int i = 0; i < 9; i++) // 첫번째 제외대상 선택
		{
			for(int j = i + 1; j < 9; j++) // 두번째 제외대상 선택
			{
				if(tot - (list[i] + list[j]) == 100) // 나머지 7명 키의 합이 100인지 확인
				{
					for(int k = 0; k < 9; k++)
					{
						if(k == i || k == j)
							continue;
						else
							System.out.println(list[k]);
					}
					flag = true;
					break; // 여기에서 break 하나만 쓰면 루프 하나 밖에 안빠져나가는 문제! 
				}
				if(flag)
					break;
			}
		}
	}
}