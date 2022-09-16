// Find Maximum number between two Numbers by taking User Input
package com.test.Basic_Java_Programs;

import java.util.Scanner;

public class Test16_Max_number_input 
{
	public static void main(String[] args) 
	{
		int a, b;
		
		System.out.print("Enter two Numbers : ");
		
		Scanner sc = new Scanner(System.in);
		
		a = sc.nextInt();
		
		b = sc.nextInt();
		
		if (a > b) 
		{
			System.out.println(a);
		} 
		else 
		{
			System.out.println(b);
		}
		
	}

}


/* Output:
 
Enter two Numbers : 20 30
30


*/