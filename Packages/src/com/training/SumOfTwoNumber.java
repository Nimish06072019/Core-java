package com.training;
import java.util.Scanner;
import static java.lang.Math.*;

public class SumOfTwoNumber {

	public static void main(String[] args) {
		
		System.out.println("Enter two Number : ");
		Scanner sc = new Scanner(System.in);
		int a  = sc.nextInt();
		int b  = sc.nextInt();
		
		int sum = a + b ;
		double x  = sqrt(36);
		double y  = pow(12,2.3);
		System.out.println(x);
		System.out.println(y);
		
		System.out.println("Sum of two number is  : " +  sum);
	}

}
