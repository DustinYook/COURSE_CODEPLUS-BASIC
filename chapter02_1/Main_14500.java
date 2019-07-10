package chapter02_1;

import java.util.Scanner;

public class Main_14500 
{
	static int[][][] block = {
			// 'ㅁ'자 블록 : 1종류
			{ {+1, 0}, {0, -1}, {+1, -1} },
			// 'ㅡ'자 블록  : 2종류
			{ {+1, 0}, {+2, 0}, {+3, 0} },
			{ {0, +1}, {0, +2}, {0, +3} },
			// 'ㄱ'자 블록 : 8종류
			{ {0, -1}, {0, -2}, {+1, -2} },
			{ {+1, 0}, {+2, 0}, {0, -1} },
			{ {+1, 0}, {+1, -1}, {+1, -2} },
			{ {+1, 0}, {+2, 0}, {+2, +1} },
			{ {+1, 0}, {+1, +1}, {+1, +2} },
			{ {0, +1}, {+1, 0}, {+2, 0} },
			{ {+1, 0}, {0, -1}, {0, -2} },
			{ {+1, 0}, {+2, 0}, {+2, -1} },
			// 'ㄹ'자 블록 : 4종류
			{ {0, -1}, {+1, -1}, {+1, -2} },
			{ {+1, 0}, {+1, +1}, {+2, +1} },
			{ {0, +1}, {+1, +1}, {+1, +2} },
			{ {+1, 0}, {+1, +1}, {+2, +1} },
			// 'ㅗ'자 블록 : 4종류
			{ {+1, 0}, {+1, -1}, {+2, 0} },
			{ {0, -1}, {0, -2}, {+1, -1} },
			{ {+1, 0}, {+1, +1}, {+2, 0} },
			{ {+1, 0}, {+1, +1}, {+1, -1} }
	};
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		int[][] input = new int[m][n];
		
		for(int i = 0; i < m; i++)
			for(int j = 0; j < n; j++)
				input[i][j] = sc.nextInt();
	
		int max = -999; // 최댓값을 저장할 변수
		
		for(int i = 0; i < m; i++)
		{
			for(int j = 0; j < n; j++)
			{
				for(int type = 0; type < 19; type++) // 19개 종류 모두 탐색
				{
					boolean flag = true;
					int sum = input[i][j]; // 셀의 합을 저장할 변수
					
					for(int cell = 0; cell < 3; cell++) // 1종류 내의 4개 셀에 대해 처리
					{
						int x_pos = i + block[type][cell][0]; // x좌표 구함
						int y_pos = j + block[type][cell][1]; // y좌표 구함
						
						if((x_pos >= 0 && x_pos < m) && (y_pos >= 0 && y_pos < n)) // 정상범위에 있는지 확인
							sum += input[x_pos][y_pos];
						else // 정상범위에 없으면 루프 탈출
						{
							flag = false;
							break;
						}
					}
					if((flag == true) && max < sum)
						max = sum;
				}
			}
		}
		System.out.println(max);
	}
}
