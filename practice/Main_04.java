package practice;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Main_04 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		Queue<Number> queue = new PriorityQueue<Number>();
		
		int cmd = 0;
		System.out.print("Enter command (1:enqueue, 2:dequeue, 3:size) : ");
		while((cmd = sc.nextInt()) != -1)
		{
			if(cmd == 1)
			{
				System.out.print("Enter number to enqueue : ");
				queue.add(sc.nextInt());
				System.out.println(queue);
			}
			else if(cmd == 2)
			{
				System.out.println("Dequeue the element");
				queue.poll();
				System.out.println(queue);
			}
			else if(cmd == 3)
				System.out.println("The size of the queue is " + queue.size());
				
			System.out.print("Enter command (1:enqueue, 2:dequeue, 3:size) : ");
		}
	}
}
