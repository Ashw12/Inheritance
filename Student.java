package Lecture34_Inheritance;

public class Student {
	String name;
	int age;
	static int count=0;
public Student() {
	count++;
   }
public Student(String name,int age) {
	this.name=name;
	this.age=age;
	count++;
	
}
@Override
public String toString() {
	return this.name+" "+this.age;
}
public static void hello() {
	System.out.println("hey");
}
static{
	System.out.println("In static block");
}
}
