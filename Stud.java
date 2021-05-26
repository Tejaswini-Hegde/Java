import java.io.*;
import java.util.Scanner;
public class Stud {
	  String name;
	  String rno;
	  String address;
	  String phno;
	  String email;
	  String br;
	  double admsn_fee = 20000;
	  double tution_fee = 15000;
	  double branch_fee;
	  double total_fee;
	  void stud_details(String name,String rno, String address, String phno, String email, String br)
	  {
	    this.name = name;
	    this.rno = rno;
	    this.address = address;
	    this.phno = phno;
	    this.email = email;
	    this.br = br;
	  }
	  
	  double payments() 
	  {
	    switch(this.br) 
	    {
	    case "MCA":
	      this.branch_fee = 50000;
	      break;
	    case "MTECH":
	      this.branch_fee = 51000;
	      break;
	    case "CS":
	      this.branch_fee = 45000;
	      break;
	    case "ISE":
	      this.branch_fee = 42000;
	      break;
	    case "CIVIL":
	      this.branch_fee = 39000;
	      break;
	    default:
	      System.out.println("Invalid Choice");
	    }
	    
	   this.total_fee = this.admsn_fee+this.tution_fee+this.branch_fee;
	   return total_fee;
	  }
	  
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter student name: ");
	    String name = sc.nextLine();
	    System.out.println("Enter Roll Number: ");
	    String rno = sc.nextLine();
	    System.out.println("Enter address: ");
	    String addr = sc.nextLine();
	    System.out.println("Enter phone number: ");
	    String phno = sc.nextLine();
	    System.out.println("Enter mail-id: ");
	    String email = sc.nextLine();
	    System.out.println("Enter your branch\n1.MCA\n2.Mtech\n3.CS\n4.ISE\n5.Civil");
	    System.out.println("Enter branch : ");
	    String branch = sc.nextLine();
	   // String branch=branch1;
	 //System.out.println("Your branch is : "+branch.toUpperCase());
	 String br=branch.toUpperCase();
	    Stud s = new Stud();
	    s.stud_details(name,rno,addr,phno,email,br);
	    System.out.println("The Total Fees is "+s.payments());
	}

}
