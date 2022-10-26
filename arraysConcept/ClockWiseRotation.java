package com.java.arraysConcept;

import java.util.Scanner;

public class ClockWiseRotation {
public static void clockWiseRotation() {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the array length");
	int n = sc.nextInt();
	int arr[]  = new int[n];
	System.out.println("Taking input from user");
	for(int i=0;i<n;i++)
	{
		arr[i] = sc.nextInt();
	}
	System.out.println("Accessing userinput");
	for(int i=0; i<n;i++)
	{
		System.out.print(arr[i]+ " ");
	}
	System.out.println();
	System.out.println("rotationg array clockwise");
	for(int i =n-1; i>=0; i--)
	{
		System.out.print(arr[i]+ " ");
	}
}
	public static void main(String[] args) {
		clockWiseRotation();

	}

}
