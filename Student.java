package org.student;

import org.department.Department;

public class Student extends Department{
	
	public String studentName(String sname) {
		System.out.println(" Student Name : "+sname);
		return sname;		
	}
	
	public String studentDept(String sdept) {
		System.out.println(" Student Department : "+sdept);
		return sdept;		
	}
	
	public String studentId(String sid) {
		System.out.println(" Student Department : "+sid);
		return sid;		
	}

	public static void main(String[] args) {
		
		Student newstd = new Student();
		newstd.collegeName("Maamallan Institute of Technology");
		newstd.collegeCode(653);
		newstd.collegeRank(47);
		newstd.deptName("Computer Science");
		newstd.studentName("Mugundan");
		newstd.studentDept("CSE");
		newstd.studentId("CS11472");
	}

}
