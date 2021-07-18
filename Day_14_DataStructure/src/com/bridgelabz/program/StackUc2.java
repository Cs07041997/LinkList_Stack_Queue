package com.bridgelabz.program;

public class StackUc2 {
	private ListNode top;
	private int length;
	
	private class ListNode{
		private int data;
		private ListNode next;
		public ListNode(int data) {
			this.data = data;
			this.next = null;			
		}
	}
	public StackUc2 () {
		top = null;
		length = 0;
	}
	public int getLength() {
		return length;
	}
	public boolean isEmpty() {
		return length ==0;
	}
	public void push(int data) {
		ListNode tem = new ListNode(data);
		tem.next = top;
		top = tem;
		length++;
	}
	public static void main(String[] args) {
		StackUc2 stack = new StackUc2();
		stack.push(56);
		stack.push(30);
		stack.push(70);
		stack.display(stack);
		System.out.println("Stack"+ stack.peek());
		System.out.println("Stack"+ stack.pop());
		System.out.println("Stack"+ stack.pop());
		System.out.println("Stack"+ stack.pop());
		System.out.println("Stack"+ stack.pop());
		System.out.println("Stack"+ stack.isEmpty());
		System.out.println("  "+ stack);
		

  }
	private int peek() {
		return top.data;
	}
	public int pop() {
		int result = top.data;
		top = top.next;
		length--;
		return result;
	}
	
	public void display(StackUc2 stack) {
		//System.out.println(stack.peek());
		while(!isEmpty()) {
			System.out.println(stack.peek());
			stack.pop();
		}
	}
	@Override
	public String toString() {
		return "Stack [top=" + top + ", length=" + length + "]";
	}

}
