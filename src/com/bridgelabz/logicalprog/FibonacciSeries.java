package com.bridgelabz.logicalprog;

import java.util.Scanner;

public class FibonacciSeries {
	static Scanner sc = new Scanner(System.in);
	public static void main(String [] args) {
		System.out.println("enter the length of the series: ");
		int length =sc.nextInt();
		System.out.print("0 1 ");
		int num1=0 , num2=1 , fib=0;
		for(int i=1;i<=length-2;i++) {
			fib= num1+num2;
			num1=num2;
			num2=fib;
			System.out.print(fib+" ");
		}
	}
}
