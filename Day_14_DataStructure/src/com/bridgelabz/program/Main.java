package com.bridgelabz.program;



public class Main {
	public static void main(String[] args) {
		System.out.println("Welcome to  Queue Program");
		
		QueueUc2 queue = new QueueUc2();
		QueueUc3 queue1 = new QueueUc3();
		queue.enQueue(56);
		queue.enQueue(30);
		queue.enQueue(70);
		
		queue.print();
		
		queue1.deQueue();
		queue1.deQueue();
		queue1.deQueue();
		
		queue.print();
	}


}
