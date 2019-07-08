package practice;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main_05 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		Deque<Number> deque = new ArrayDeque<Number>();
		
		int cmd = 0;
		System.out.print("Enter command (1:push front, 2:push back, 3:pop front, 4:pop back, 5:size, -1:exit) : ");
		while((cmd = sc.nextInt()) != -1)
		{
			if(cmd == 1)
			{
				System.out.print("Enter number to push : ");
				deque.addFirst(sc.nextInt());
				System.out.println(deque);
			}
			else if(cmd == 2)
			{
				System.out.print("Enter number to push : ");
				deque.addLast(sc.nextInt());
				System.out.println(deque);
			}
			else if(cmd == 3)
			{
				System.out.println("Pop front element");
				deque.pollFirst();
				System.out.println(deque);
			}
			else if(cmd == 4)
			{
				System.out.println("Pop last element");
				deque.pollLast();
				System.out.println(deque);
			}
			else if(cmd == 5)
				System.out.println("The size of the deque is " + deque.size());
				
			System.out.print("Enter command (1:push front, 2:push back, 3:pop front, 4:pop back, 5:size, -1:exit) : ");
		}
	}
}