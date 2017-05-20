package com.abc.test;

import com.abc.model.Student;

public class TestStudent {

	public static void main(String[] args) {
		Student student1 = new Student(1, "Abcd", "hhjjhk@gmail.com");
		Student student2 = new Student(1, "Abcd", "hhjjhk@gmail.com");
		Student student3 = new Student(1, "Abcd", "hhjjhk@gmail.com");
		
		System.out.println(student1);
		System.out.println(student2);
		System.out.println(student3);
	}

}
