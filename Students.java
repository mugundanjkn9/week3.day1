package org.student;

public class Students {
	
	public int getStudentInfo(int sid) {
		System.out.println("The details of student id is : "+sid);
		return sid;
	}
	
	public void getStudentInfo(int id, String name) {
		System.out.println("The details of student id as : "+id);
		System.out.println("The details of student name as : "+name);
	}
	
	public void getStudentInfo(String email, long phoneno) {
		System.out.println("The details of student email id as : "+email);
		System.out.println("The details of student phone no as : "+phoneno);
	}
	
	public static void main(String[] args) {
		
		Students s1 = new Students();
		s1.getStudentInfo(1001);
		s1.getStudentInfo(14472, "Mugundan");
		s1.getStudentInfo("mugundanjkn9@gmail.com", 8122280901l);
	}
	
}
