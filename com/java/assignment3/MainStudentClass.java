package com.java.assignment3;

public class MainStudentClass {

	public static void main(String[] args) {
		StudentDetails sd = new StudentDetails();
		System.out.println("student 1");
		sd.studentDetails();
		System.out.println("Displaing Information");
		sd.displyDetails();
		System.out.println("name : "+ sd.getName() + "age:" + sd.getAge()  + "weight:" + sd.getWeight());
		StudentDetails sd1 = new StudentDetails();
		System.out.println("student 2");
		sd.studentDetails();
		System.out.println("Displaing Information");
		sd.displyDetails();
		System.out.println("name : "+ sd1.getName() + "age:" + sd1.getAge()  + "weight:" + sd1.getWeight());
		System.out.println("Number of objects created" + StudentDetails.getCount());

	}

}
