package com.bridgelabz.logicalprog;

import java.util.Scanner;

public class ReverseNumber {
	static Scanner sc = new Scanner(System.in);
		public static void main(String [] args) {
			int rev=0,rem=0;
			System.out.println("enter a number that you want to reverse :");
			int num = sc.nextInt();
			while(num != 0 ) {
				rem=num%10;
				rev=rev*10+rem;
				num=num/10;
			}
			System.out.println("the reverse of the number is "+rev);
		}

}
