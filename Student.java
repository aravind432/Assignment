package org.student;

import org.department.Department;

public class Student extends Department {
public void StudentName() {
	System.out.println("ARAVIND");
}
public void StudentDept() {
	System.out.println("AERO");
}
public void StudentId() {
	System.out.println("Ae007");
}
public static void main(String[] args) {
	Student student=new Student();
	student.CollegeName();
	student.CollegeCode();
	student.CollegeRank();
	student.DepartmentName();
	student.StudentName();
	student.StudentDept();
	student.StudentId();
	 
}
	
}
