package com.percentage;
import java.util.Scanner;

public class Percentagecalculator {
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter your first subject marks:");
		float a= sc.nextFloat();
		System.out.println("enter your second subject marks:");
			float b=sc.nextFloat();
			System.out.println("enter your third sunject marks:");
			float c=sc.nextFloat();
			System.out.println("enter your fourth subject marks:");
			float d=sc.nextFloat();
			System.out.println("enter your fifth subject marks:");
			float e=sc.nextFloat();
			float percentage=(a+b+c+d+e)/5;
			System.out.println("your percentage is :"+percentage);
	}

}
