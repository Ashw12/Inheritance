package Lecture34_Inheritance;

import Lecture33_Stack_And_Queue.Circular_Queue;

public class DynamicQueue extends Circular_Queue {

	@Override
	public void Enqueue(int item) throws Exception {
	if(super.isFull()) {
		int []arr=new int[2*this.data.length];
		for (int i = 0; i < this.size(); i++) {
			int idx=(this.front+i)%this.data.length;
			arr[i]=data[idx];
		}
		this.data=arr;
		this.front=0;
	}
	super.Enqueue(item);
}
}
