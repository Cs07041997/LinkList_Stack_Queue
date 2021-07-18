package com.bridgelabz.program;

public class StackUc1 {
	private ListNode top;
	private int length;
	
	private class ListNode{
		private int data;
		private ListNode next;
		
		public ListNode(int data) {
			this.data = data;
		}
	}
	
	public StackUc1() {
		top = null;
		length = 0;
	}
	
	public int getLength() {
		return length;
	}
	
	public void push (int data) {
		ListNode tem = new ListNode(data);
		tem.next = top;
		top = tem;
		length++;
	}
	
	/*public int pop() {
		int result = top.data;
		top = top.next;
		length--;
		return result;
	}*/
	public int peek() {
		return top.data;
	}
	
	
	public int pop() {
		int result = top.data;
		top = top.next;
		length--;
		return result;
	}
	
	public boolean isEmpty() {
		return length == 0;
	}
	
	public void display(StackUc1 stackuc1) {
		while(!isEmpty()) {
			System.out.println(stackuc1.peek());
			stackuc1.pop();
		}
	}

	public static void main(String[] args) {
    StackUc1 stackuc1 = new StackUc1();
    stackuc1.push(70);
    stackuc1.push(30);
    stackuc1.push(56);
    stackuc1.display(stackuc1);
    //System.out.println(stackuc1);
   // System.out.println("stack" +stackuc1.peek());
    //System.out.println("stack"+stackuc1.pop());
    //System.out.println("stack"+stackuc1.pop());
    //System.out.println("stack"+stackuc1.pop());
    System.out.println(""+stackuc1);
	}
	
	@Override
	public String toString() {
		return "StackUc1 [top=" + top + ", length=" + length + "]";
	}

	

}
