package Lecture34_Inheritance;

public class Student_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Student s=new Student("Ram Lal",14);
        // object b=new Object();
         System.out.println(s);
         Student s1=new Student("Ram Lali",14);
         System.out.println(s1);
         System.out.println(Student.count);
         Student.hello();
	}

}
