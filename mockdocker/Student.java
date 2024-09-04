import java.io.*;
import java.util.*;
class Student
{
int roll_no;
String name;
public Student(int roll_no,String name)
{
	this.roll_no=roll_no;
	this.name=name;
}
public void display()
{
	System.out.println("Roll no: "+roll_no+"   Name: "+name);
}
public static void main(String args[])throws IOException
{
	Scanner sc=new Scanner(System.in);
	int r;
	String n;
	System.out.println("Enter your roll no: ");
	r=sc.nextInt();
	System.out.println("Enter your name: ");
	n=sc.next();
	Student s1=new Student(r,n);
	s1.display();
}
}