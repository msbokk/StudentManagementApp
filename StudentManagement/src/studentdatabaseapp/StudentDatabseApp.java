package studentdatabaseapp;

import java.util.Scanner;

public class StudentDatabseApp {

	public static void main(String[] args) {
		//Ask the user how many students will be added
		
		System.out.println("How many students do you want to create?");
		Scanner in=new Scanner(System.in);
		int noOfStudents= in.nextInt();
		Student [] student= new Student[noOfStudents];
		for(int i=0;i<noOfStudents;i++) {
			student[i]=new Student();
			student[i].enrollCourses();
			student[i].payFees();
			
			//create that many users
		}
		
for(int i=0;i<noOfStudents;i++) {
		
			student[i].showInfo();
			//create that many users
		}
		

	}

}
