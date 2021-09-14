package com.codebind;

import java.util.Scanner;

public class Userinput {
	public static void main(String arg[]){
		 System.out.println("taking input from user");
		 Scanner sc = new Scanner(System.in);
		 System.out.println("enter first number:");
//		 int a = sc.nextInt();
		 float a = sc.nextFloat();
		 System.out.println("enter second number:");
//		 int b = sc.nextInt();
		 float b = sc.nextFloat();
		 float sum = a+b;
		 System.out.println("the sum of two number is :"+sum);
	}

}
