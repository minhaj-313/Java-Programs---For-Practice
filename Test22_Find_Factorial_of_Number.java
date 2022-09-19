package com.test.Basic_Java_Programs;

import java.util.Iterator;
import java.util.Scanner;

public class Test22_Find_Factorial_of_Number 
{
	public static void main(String[] args) 
	{
		int n, fact = 1;
		
		System.out.print("Enter a Number : ");
		
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		
		for (int i = 1; i<= n; i++)
		{
			fact = fact*i;
		}
		System.out.println("Factorial : " + fact);
		
	}

}

// Output :
/*

Enter a Number : 10
Factorial : 3628800




*/