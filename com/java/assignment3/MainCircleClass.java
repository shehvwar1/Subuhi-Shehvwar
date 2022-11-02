package com.java.assignment3;

import java.util.Arrays;

public class MainCircleClass {

	public static void main(String[] args) {
		CircleClass cc2 = new CircleClass(); 
		CircleClass cc = new CircleClass(5,7); 
		CircleClass cc1 = new CircleClass(6.0, 8.7); 
		System.out.println("circle1 -center : " +(cc.getCenter()) + "Radius" + cc.getRadius());
		System.out.println("circle2 -center : " +(cc1.getCenter()) + "Radius" + cc1.getRadius());
		System.out.println("No of class objects created are: " + CircleClass.getCount());
		

	}

}
