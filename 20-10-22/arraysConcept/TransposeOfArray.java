package com.java.arraysConcept;

import java.util.Scanner;

public class TransposeOfArray {
	public static void transposeOfArra() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the rows");
		int row = sc.nextInt();
		System.out.println("Enter thhe columns");
		int col = sc.nextInt();
		int arr[][] = new int[row][col];
		System.out.println("Taking arra input from user");
		for(int i=0; i<row; i++)
		{
			for(int j=0; j<col;j++)
			{
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println("original array matrix is");
		for(int i=0; i<row;i++)
		{
			for(int j=0; j<col;j++)
			{
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}
		System.out.println("Transpose of array matrix:");
		for(int i=0; i<col;i++)
		{
			for(int j=0; j<row; j++)
			{
				System.out.print(arr[j][i] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		transposeOfArra();

	}

}
