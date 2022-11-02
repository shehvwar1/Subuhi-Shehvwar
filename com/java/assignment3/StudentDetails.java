package com.java.assignment3;

import java.util.Scanner;

public class StudentDetails {
	private String name;
	private int age;
	private double weight;
	private static int count =0;
	public static int getCount() {
		return count;
	}
	public static void setCount(int count) {
		StudentDetails.count = count;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	void studentDetails()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Provide the student name");
		name = sc.next();
		System.out.println("Provide the student age");
		age = sc.nextInt();
		System.out.println("Provide the student weight");
		weight = sc.nextDouble();
	}
	void displyDetails()
	{
		/*this.name = name;
		this.age = age;
		this.weight = weight;*/
		System.out.println("name: " + this.name);
		System.out.println("age: " + this.age);
		System.out.println("weight: " + this.weight);
		
		count++;
	}
}
