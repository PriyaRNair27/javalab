public class Stringmanipulation
{
public static void main(String[] args)
{
System.out.println("******Creating of strings******");
char arrSample[]={'R','O','S','E'};
String strSample1=new String(arrSample);
System.out.println("Created from char[] using new string:"+strSample1);
byte ascii[]={65,66,67,68,69,70};
String strSample2=new String (ascii);
System.out.println("Created from byte[]:"+strSample2);

System.out.println("\n ******Getting string length*****");
System.out.println("Length of "+strSample1+"is"+strSample1.length());

System.out.println("String concatenation...........");
String  strSample3=strSample1.concat(strSample2);
System.out.println("using concat():"+strSample3);
String  strSample4=strSample1+strSample2;
System.out.println("using + operator:"+strSample4);

System.out.println("\n *******String comparison ******");
System.out.println("*** using compareTo()");
String strSample="Rockstar";
System.out.println("compare 'Rockstar' To'ROCKSTAR':"+strSample.compareTo("ROCKSTAR"));
System.out.println("compare 'Rockstar' To'ROCKSTAR'case ignored:"+strSample.compareToIgnoreCase("ROCKSTAR"));

System.out.println("\n******using equals*****");
System.out.println("'Rockstar' equals('ROCKSTAR') is :"+strSample.equals("ROCKSTAR"));
System.out.println("'Rockstar' equals('ROCKSTAR') is if case ignored :"+strSample.equalsIgnoreCase("ROCKSTAR"));

System.out.println("\n*******using indexof()*******");
System.out.println("indexof t in 'Rockstar' is :"+strSample.indexOf("t"));
System.out.println("indexof 'star'  in 'Rockstar' is :"+strSample.indexOf("star"));

System.out.println(" \n******modifying a string****** ");
System.out.println("changing case of characters in the string");
System.out.println("all caps 'Rockstar':"+strSample.toUpperCase());
System.out.println("all small 'Rockstar':"+strSample.toLowerCase());

System.out.println("\n******using replace******");
System.out.println("in 'Rockstar' replace 'star' with 'et' " +strSample.replace("star","et"));
}
}
