package com.emc.poo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Getters and Setters object construction via default constructor
		Student student = new Student();
		student.setId(1);
		student.setName("Pepe");
		student.setSurname("Soto");
		student.setAddress("Calle Prim");

		System.out.println(student.toString());

		Student student1 = new Student(1, "Pepe", "Soto", "Calle Prim");

		System.out.println(student1.toString());

		boolean isEquals = student.equals(student1);

		System.out.println(isEquals);

	}

}
