package com.bridgelabz;

public class MyQueueNode {
	private int data;
	private MyQueueNode next;
	
	public void setData(int data) {
		this.data = data;
	}

	public void setNext(MyQueueNode next) {
		 this.next = next;
	}

	public int getData() {
		return data;
	}

	public MyQueueNode getNext() {
		return next;
	}

	public MyQueueNode() {
		
	}
}
