package com.tnsif.Assignment1;
import java.util.Scanner;

class NumberSwapper
{
    private int first;
    private int second;

    public void getNumbers()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        first = scanner.nextInt();
        System.out.print("Enter the second number: ");
        second = scanner.nextInt();
    }

    public void swapNumbers() 
    {
        // Using bitwise XOR to swap numbers without a temporary variable
        first = first ^ second;
        second = first ^ second;
        first = first ^ second;
    }

    public void displayResult() 
    {
        System.out.println("After swapping:");
        System.out.println("First number: " + first);
        System.out.println("Second number: " + second);
    }
}

public class SwapNum
{
	public static void main(String[] args)
	{
		NumberSwapper numberSwapper = new NumberSwapper();
        numberSwapper.getNumbers();
        numberSwapper.swapNumbers();
        numberSwapper.displayResult();
	}
}