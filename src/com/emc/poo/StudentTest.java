package com.emc.poo;

import static org.junit.Assert.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class StudentTest {

	@Test
	void testEqualsObject() {
		Student student = new Student();
		student.setId(1);
		student.setName("Pepe");
		student.setSurname("Soto");
		student.setAddress("Calle Prim");

		Student student1 = new Student(1, "Pepe", "Soto", "Calle Prim");

		assertEquals(student, student1);

		Student student2 = new Student();
		student.setId(1);
		student.setName("Pepes");
		student.setSurname("Soto");
		student.setAddress("Calle Prim");

		Student student3 = new Student(1, "Pepe", "Soto", "Calle Prim");

		assertNotEquals(student2, student3);
	}

}
