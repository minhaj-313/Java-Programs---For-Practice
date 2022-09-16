package com.test.Basic_Java_Programs;

import java.util.Scanner;

public class Test12_vowel_or_Consonant 
{
	public static void main(String[] args) 
	{
		char ch;
		
		System.out.print("Enter Character : ");
		
		Scanner sc = new Scanner(System.in);
		
		ch = sc.next().charAt(0);
		
		if (ch =='a' || ch== 'e' ||ch=='i' || ch=='o' || ch=='u')
		{
			System.out.println("Vowels");
		} 
		else 
		{
			System.out.println("Consonant");
		}
		
	}

}


/* Output:
 
 
 Enter Character : a
Vowels





*/