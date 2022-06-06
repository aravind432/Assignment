package org.department;

import org.college.College;

public class Department extends College {
	
	public void DepartmentName() {
		System.out.println("AERO");
	}
	
	public static void main(String[] args) {
		Department department=new Department();
		department.CollegeName();
		department.CollegeCode();
		department.CollegeRank();
		department.DepartmentName();
		
	}
}
