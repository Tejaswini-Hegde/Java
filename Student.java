import java.io.*;
import java.util.Scanner;
public class Student {

	public Student() {
		// TODO Auto-generated constructor stub
	}
	Scanner sc=new Scanner(System.in);
	String usn=null,name=null,address=null,email=null,branch=null;
	//Long contact=null;
	/*String name=null;
	String address=null;
	String email=null;
	String branch=null;*/
	Student(String usn,String name,String address,String email,String branch)
	{
		this.usn=usn;
		this.name=name;
		this.address=address;
		this.email=email;
		//this.contact=contact;
		this.branch=branch;
		
	}
	double calculate()
	{
		System.out.println("Enter Tution Fees");
		double tfees=sc.nextDouble();
		System.out.println("Enter Exam Fees");
		double examfees=sc.nextDouble();
		
		double total=tfees+examfees;
		return(total);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter USN");
		String usn=s.nextLine();
		System.out.println("Enter Name");
		String name=s.nextLine();
		System.out.println("Enter Address");
		String address=s.nextLine();
		System.out.println("Enter Email address");
		String email=s.nextLine();
		System.out.println("Enter Branch");
		String branch=s.nextLine();
		Student st=new Student(usn,name,address,email,branch);
		System.out.println("Total Fees is  :"+st.calculate());

	}

}
