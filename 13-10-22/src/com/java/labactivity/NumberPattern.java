package com.java.labactivity;

import java.util.Scanner;

public class NumberPattern {
	public static void numberPattern() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number of rows");
		int row = sc.nextInt();
		for(int i=1; i<=row; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		numberPattern();

	}

}
