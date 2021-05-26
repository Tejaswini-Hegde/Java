import java.util.Scanner;
public class Occurance {

	public Occurance() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n,x,count=0,i=0;
Scanner s=new Scanner(System.in);
System.out.println("Enter number of elements for array\n");
n=s.nextInt();
int a[]=new int[n];
System.out.println("Enter the elements\n");
for(i=0;i<n;i++)
{
a[i]=s.nextInt();
}
System.out.print("Enter the element which you want to count number of occurences");
x=s.nextInt();
for(i=0;i<n;i++)
{
	if(a[i]==x)
{
	count++;
}
}
System.out.println("Number of occurences of the element is :"+count);

	}

}
