package com.bridgelabz.program;

public class QueueUc3 {
	Node front;
	Node rear;
	int length;
	
	class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	// method to add the data in queue
	public void enQueue(int data) {
		if (front == null) {
			rear = new Node(data);
			front = rear;
		}
		else {
			rear.next = new Node(data);
			rear = rear.next;
		}
		length ++;
	}
	// method to print the data from queue
	public void print() {
		Node temp = front;
		while(temp != null) {
			System.out.print(temp.data + "->");
			temp = temp.next;
		}
	}
	// method to remove data from queue
	public void deQueue() {
		int temp;
		if (front != null) {
			temp = front.data;
			front = front.next;
			length--;
			return;
		}
		System.out.println("Data Removed");
		
	}

}


