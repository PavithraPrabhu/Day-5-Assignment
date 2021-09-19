package org.student;

import org.department.Department;

public class Student extends Department {

	public void studentName() {
		String studentname = "Pavithra";
		System.out.println("Student Name is " +studentname);
	}
	public void studentDept() {
		System.out.println("ECE dept");
		}
	
	public void studentId() {
		System.out.println("Student's Id is specified");
	}
	
	public static void main(String[] args) {
		Student stuObj = new Student();
		stuObj.studentName();
		stuObj.studentId();
		stuObj.studentDept();
		
		//from Department class
		stuObj.deptName();
		
		//from College class
		stuObj.collegeName();
		stuObj.collegeCode();
		stuObj.collegeRank();
		

	}

}
