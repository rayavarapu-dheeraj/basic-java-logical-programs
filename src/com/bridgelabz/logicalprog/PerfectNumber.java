package com.bridgelabz.logicalprog;

import java.util.Scanner;

public class PerfectNumber {
	static Scanner sc = new Scanner(System.in);
	public static void main(String [] args) {
		int sum=0;
		System.out.println("enter a number to check if it's a perfect number:");
		int num = sc.nextInt();
		for(int i=1;i<=num/2;i++) {
			if(num%i==0) {
				sum=sum+i;
			}
		}if(sum==num) {
			System.out.println("the number you entered is a perfect number: "+sum);
		}
	}

}
