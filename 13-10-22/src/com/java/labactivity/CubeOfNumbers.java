package com.java.labactivity;

import java.util.Scanner;

public class CubeOfNumbers {

	public static void cubeOfNumbers()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr any number for cubing upto");
		int num = sc.nextInt();
		for(int i=1; i<=num; i++)
		{
			System.out.println("number is" + " " + i + " and cube of" + " " + i + " is" + " " +(i*i*i));
		}
	}
	public static void main(String[] args) {
		cubeOfNumbers();

	}

}
