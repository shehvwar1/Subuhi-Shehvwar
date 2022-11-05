package com.java.Inheritance;

import java.util.Scanner;

public class Student {
	private String name;
	protected int id;
	 double grade;
	 public int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getGrade() {
		return grade;
	}
	public void setGrade(double grade) {
		this.grade = grade;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	Student()
	{
		this.name = name;
		this.id = id;
		this.grade=grade;
		this.age = age;
	}
	boolean isPassed(double grade)
	{
		System.out.println("Student is passed");
		return true;
	}
	void setDetails()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter student name");
		name = sc.next();
		System.out.println("Enter student id");
		id = sc.nextInt();
		System.out.println("Enter student Grade");
		grade = sc.nextDouble();
		System.out.println("Enter student age");
		age = sc.nextInt();
		
	}
	void getDetails()
	{
		System.out.println("name of student is " + this.name);
		System.out.println("ID of student is " + this.id);
		System.out.println("Grade of student is " + this.grade);
		System.out.println("Age of student is " + this.age);
	}

	 
}
class Undergrad extends Student{
	void setDetails()
	{
		super.setDetails();
	}
	void getDetails()
	{
		super.getDetails();
	}
	boolean isPassed(double grade)
	{
		if(grade>=70)
		{
			System.out.println("sudent is passed");
			return super.isPassed(grade);
		}
		else
		{
			System.out.println("Student is failed");
			return false;
		}
	}
}
class Grad extends Undergrad{
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}