package com.abc.test;
// chaitanya
import com.abc.model.Employee;

public class Test {
	public static void main(String[] args) {
		Employee employee=new Employee();
		employee.setId(1);
		employee.setName("mahap");
		employee.setEmail("mail");
		System.out.println("Id is "+employee.getId()+"Name is "+employee.getName()+"email is"+employee.getEmail());
	}

}
