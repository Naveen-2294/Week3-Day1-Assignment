package org.student;

import org.department.Department;

public class Student extends Department {
	
	public void studentName() {
		System.out.println("The Student Name is Naveenkumar T");
	}
	public void studentDept() {
		System.out.println("The Student Department is Computer Science");
	}
	public void studentId() {
		System.out.println("The Student Id is 11UCS108");
	}

	public static void main(String[] args) {
		Student s = new Student();
		System.out.println("The StudentDetails :");
		System.out.println("===========================");
		s.studentName();
		s.studentDept();
		s.studentId();
		System.out.println("                        ");
		System.out.println("The Department Details:");
		System.out.println("=======================");
		s.departmentName();
		System.out.println("                          ");
		System.out.println("The College Details:");
		System.out.println("====================");
		s.collegeName();
		s.collegCode();
		s.collegeRank();
		
				
	}
}
