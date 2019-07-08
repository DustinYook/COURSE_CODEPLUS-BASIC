package practice;

import java.util.EmptyStackException;
import java.util.Scanner;
import java.util.Stack;

public class Main_03 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		Stack<Number> stack = new Stack<Number>();
		
		int cmd = 0;
		System.out.print("Enter command (1:push, 2:pop, 3:size) : ");
		while((cmd = sc.nextInt()) != -1)
		{
			if(cmd == 1)
			{
				System.out.print("Enter number to push : ");
				stack.push(sc.nextInt());
				System.out.println(stack);
			}
			else if(cmd == 2)
			{
				try
				{
					System.out.println("Pop the element");
					stack.pop();
					System.out.println(stack);
				}
				catch(EmptyStackException ex)
				{
					System.err.println("stack is empty!");
				}
			}
			else if(cmd == 3)
				System.out.println("The size of the stack is " + stack.size());
				
			System.out.print("Enter command (1:push, 2:pop, 3:size) : ");
		}
	}
}