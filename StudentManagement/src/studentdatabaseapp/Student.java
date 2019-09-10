package studentdatabaseapp;

import java.util.Scanner;

public class Student {
	private String firstName;
	private String lastName;
	private String studentId;
	private int gradeYear;
	private static int courseCost=600;
	private String courses="";
	private int tuitionFees=0;
	private static int id=1000;
	
	//constructor that will prompt to enter name and year for student
	public Student() {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter First Name: ");
		this.firstName=in.nextLine();
		System.out.print("Enter Last Name: ");
		this.lastName=in.nextLine();
		System.out.print("Enter Class: ");
		this.gradeYear=in.nextInt();
		setStudentId();
		
		
		
		
		
	}
	
	private void setStudentId() {
		id++;
		this.studentId= gradeYear+""+id;
		
	}
	//a function to enroll students in different courses like history, maths, english, chemistry, computer science each course cost 600$
	public void enrollCourses() {
		
		do{
			System.out.print("Enter the course you want to enroll in(Press Q to quit): ");
			Scanner c=new Scanner(System.in);
			String k=c.nextLine();
			if(!(k.equals("Q")||k.equals("q"))) {
				courses=courses+"\n\t"+k;
				tuitionFees=tuitionFees+courseCost;
				
				
			}else {
				break;
			}	
		}while(true);
		
	
		
	}
	
	
	
	
	public void viewFees() {
		System.out.println("Fees: "+tuitionFees);
	}
	//the student should be able to view the balance and pay tuition
	public void payFees() {
		viewFees();
		
		System.out.print("Enter payment Amount: ");
		Scanner in= new Scanner(System.in);
		int payment= in.nextInt();
		tuitionFees=tuitionFees-payment;
		System.out.print("Thank you for your payment of Rs."+payment+"\n");
		viewFees();
	}
	//function to show name, id, courses enrolled and balanca
	public void showInfo() {
		System.out.println("Name: "+firstName+" "+lastName+
				"\nID: "+studentId+
				"\nClass: "+gradeYear+
				"\nCourses: "+courses+
				"\nFees: "+tuitionFees);
	}
}
