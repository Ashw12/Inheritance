package Lecture34_Inheritance;

import Lecture33_Stack_And_Queue.Stack;

public class DynamicStack extends Stack {
	@Override
	public void push(int item) throws Exception {
		if(this.isFull()) {
			int []arr=new int[2*this.data.length];
//hamne variable ko protected kar diya hai dynamic banane ke liye.Ager hame siple stack banana hai to use ham
//private kar denge.dyanamic isliye quiki hame stack ka size grow karna tha.
			for (int i = 0; i < this.data.length; i++) {
				arr[i]=this.data[i];
			}
			super.data=arr;
		}
		super.push(item);
	}
}
