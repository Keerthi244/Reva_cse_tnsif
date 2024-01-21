package com.tnsif.Assignment1;
import java.util.Scanner;


public class NumberGame 
{

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);

        System.out.println("Enter three numbers:");

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        scanner.close();

        NumberProcessor numberProcessor = new NumberProcessor();
        numberProcessor.findSmallestNumber(num1, num2, num3);
    }
}

class NumberProcessor 
{
    void findSmallestNumber(int num1, int num2, int num3) 
    {
        int smallest = (num1 <= num2) ? ((num1 <= num3) ? num1 : num3) : ((num2 <= num3) ? num2 : num3);

        if (num1 == num2 && num2 == num3) 
        {
            System.out.println("All numbers are equal");
        }
        else 
        {
            System.out.println("The smallest number is: " + smallest);
        }
    }
}

