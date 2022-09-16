package com.test.Basic_Java_Programs;

import java.util.Scanner;

public class Test13_ASCII_of_Character 
{
	public static void main(String[] args) 
	{
		char ch;
		 
		System.out.print("Enter any Character : ");
		
		Scanner sc = new Scanner(System.in);
		
		ch = sc.next().charAt(0);
		
		int a = ch;
		
		System.out.println(" ASCII value of " + ch + " is " + a);
		
	}

}


/*

Enter a Character : A
 ASCII value of A is 65



*/