package com.test.Basic_Java_Programs;

import java.util.Scanner;

public class Test19_power_calculation_program 
{

	public static void main(String[] args) 
	{
		int n,p,result=1;
		
		System.out.print("Enter any Number : ");
		
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		
		System.out.print("Enter Power : ");
		
		p = sc.nextInt();
		
		for (int i = 1; i <=p; i++) 
		{
			result = n*result;
			
		}
		
		System.out.println("Power " + result);
	}

}


/* Output:

Enter any Number : 5
Enter Power : 2
Power 25


*/