package com.bridgelabz.program;

public class LinkListUc2 {
private ListNode head;
	
	public static class ListNode{
		private int data;
		private ListNode next;
		public ListNode(int data) {
		this.data = data;
		this.next = null;
		}
		
	}
	public void printLinkedList() {
		ListNode pointer = head;
		while ( pointer != null) {   //while my pointer becomes null till check
			System.out.print(pointer.data+ "==>");
			pointer = pointer.next;
		}
		System.out.print("null");
		
	}
	public void insertData(int value) {
		ListNode newNode =  new ListNode(value);
		newNode.next = head;
		head = newNode;
	}
	public static void main(String[] args) {
		LinkListUc2  singleLinkList  = new LinkListUc2 ();
		singleLinkList.insertData(70);
		singleLinkList.insertData(30);
		singleLinkList.insertData(56);
		singleLinkList.printLinkedList();
		
	 }

}



