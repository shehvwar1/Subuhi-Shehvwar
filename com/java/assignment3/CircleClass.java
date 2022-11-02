package com.java.assignment3;

import java.util.Scanner;

public class CircleClass {
	private double center;
	/*public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}*/
	private double radius;
	private static  int count =0;
	//sprivate int num;
	CircleClass()
{
	System.out.println("This is the default constructor");	
	//num = 30;
}
/*static void getCounts()
{
	 count++;
	
}*/
CircleClass(double center, double radius)
{
	this.center=center;
	this.radius = radius;
	count++;
}
/*void dimensions()
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the center of circle");
	center = sc.nextDouble();
	System.out.println("Enter the radius of circle");
	radius = sc.nextDouble();
}
void displayDimensions(double center, double radius)
{
	//this.center = center;
	//this.radius = radius;
	System.out.println("Center :" + this.center);
	System.out.println("radius :" + this.radius);
}*/
	public double getCenter() {
		return center;
	}
	public void setCenter(double center) {
		this.center = center;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public static int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	
	

}
