class publisher
{
String publisher;
publisher(String publi)
{
this . publisher=publi;
}
}
class Book
{
String name;
publisher publisher;
Book(){}
public Book(String name,publisher publisher)
{
this.name=name;
this.publisher=publisher;
}
}
class Literature extends Book
{
String Littype="literature";
Literature(String name,publisher publisher)
{
super(name,publisher);
}
void display()
{
System.out.println("Name:"+super.name);
System.out.println("Type:"+this.Littype);
System.out.println("publisher:"+this.publisher.publisher);
}
}
class fiction extends Book
{
String Littype="fiction";
fiction(String name,publisher publisher)
{
super(name,publisher);
}
void display()
{
System.out.println("Name:"+super.name);
System.out.println("Type:"+this.Littype);
System.out.println("Publisher:"+this.publisher.publisher);
}
}
public class Inheritancebookexample
{
public static void main(String[] args)
{
publisher ip=new publisher("s chand");
Literature l=new Literature("As you like it..",ip);
l.display();
publisher fp=new publisher("Tata Mc GrawHill");
fiction f=new fiction("tempest",fp);
f.display();
}
}
