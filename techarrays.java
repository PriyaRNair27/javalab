import java.util.Scanner;
class employeet
{
int empid;
String name;
float salary;
String address;
employeet()
{}
employeet(int empid,String name,float salary,String address)
{
this.empid=empid;
this.name=name;
this.salary=salary;
this.address=address;
}}
class Teacher extends employeet
{
String dept,sub;
Teacher (int empid,String name,float salary,String address,String dept,String sub)
{
super (empid,name,salary,address);
this.dept=dept;
this.sub=sub;
}
public void display()
{
System.out.println("teacher id="+empid);
System.out.println("name="+name);
System.out.println("salary="+salary);
System.out.println("department="+dept);
System.out.println("subject="+sub);
}
}
public class techarrays
{
public static void main(String[] args)
{
System.out.println("enter no of teachers:");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
System.out.println("enter teachers details one by one.........");
Teacher teacher[]=new Teacher[n];
Scanner sc1=new Scanner(System.in);
int tid;
String name;
float salary;
String add;
String dept,sub;
for(int i=0;i<n;i++)
{
System.out.println("enter teacher id:");
tid=sc1.nextInt();
System.out.println("teacher name:");
name=sc1.next();
System.out.println("enter teacher salary:");
salary=sc1.nextFloat();
System.out.println("enter teacher  address:");
add=sc1.next();
System.out.println("enter teacher department:");
dept=sc1.next();
System.out.println("enter teacher subject:");
sub=sc1.next();
Teacher t=new Teacher(tid,name,salary,add,dept,sub);
teacher[i]=t;
}
for(Teacher x: teacher)
{
x.display();
System.out.println("\n");
}
}
}