package Lecture34_Inheritance;

public class Client_Parent_and_Child {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Case:1
		Parent obj=new Parent();
		System.out.println(obj.d);
		System.out.println(obj.d2);
		obj.fun();
		obj.fun1();*/
		
		/*Case:2 Important for Development point of view.
		Parent obj=new Child();
		System.out.println(obj.d);//1
		System.out.println(obj.d1);//10
		System.out.println(((Child)(obj)).d2);//20
		System.out.println(((Child)(obj)).d);//2
		obj.fun();//ye pahle check karega jo new class(new child hai isame) kiye usme jake ki fun naam ka fun hai ya nhi ager hoga to use print kar dega.
		obj.fun1();//ager nhi hoga to ji bhi class me hoga usaka fun print kardega.
		((Child)(obj)).fun2();//ye parent class me hai to compiler ko sirf parent hi dikhega aur fun2 naam ka function
		//parent me to hai hi nhi to isliye ham typecast kiye hai compiler ka vision change karne ke liye.
		*/
		/*case:3
		Child obj=new Parent();//ye inheritance java me allow nhi hai.
		System.out.println(obj.d);
		System.out.println(obj.d1);
		System.out.println(obj.d2);
		obj.fun();*/
		
		//case:4
		Child obj=new Child();
		System.out.println(obj.d);
		System.out.println(obj.d1);
		System.out.println(obj.d2);
		System.out.println(((Parent)(obj)).d);
		obj.fun();
		obj.fun1();
		obj.fun2();
	}

}
