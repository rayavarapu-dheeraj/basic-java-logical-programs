package com.bridgelabz.logicalprog;
import java.util.Scanner;
public class PrimeNum {
	static Scanner sc = new Scanner(System.in);
		public static void main(String [] args) {
			int counter=0;
			System.out.println("enter a number to check if it's a prime number:");
			int num = sc.nextInt();
			if(num==0||num==1) {
				System.out.println("the number you entered is not a prime number");
			}
			else
			{
			for(int i=2;i<=num/2;i++) {
				if(num%i==0) {
					counter=1;
					System.out.println("the number you entered is not a prime number");
					break;
				}
			}
			if(counter==0) {
				System.out.println("the number you entered is a prime number");
			}
		}
		}
	}
