package com.bridgelabz.program;

public class LinkListUc9 {
private static ListNode head;
	
	public static class ListNode{
		private int data;
		private ListNode next;
		
		public ListNode(int data) {
			this.data = data;
			this.next = null;
		}

	}
	public void printLinkList() {
		ListNode pointer = head;
		while(pointer != null) {
			System.out.print(pointer.data + "==>");
			pointer = pointer.next;
		}
		System.out.print("null");
	}
	public void insertData(int value) {
		ListNode newNode =  new ListNode(value);
		if (head == null) {
			head  = newNode;
			return;
		}
		ListNode current = head ;
		while( current.next  !=  null  ) {
			current = current.next;
			
		}
		current.next = newNode;
	}
	
	public void insert(int position , int value ) {
		ListNode node = new ListNode(value);
		if(position == 1 ) {
			node.next = head;
			head = node;
		}else {
			ListNode previous = head;
			int count = 1;
			while(count < position -1 ) {
				previous = previous.next;
				count++;
			}
			ListNode current = previous.next;
			previous.next = node;
			node.next = current;
		}		
	}
	public boolean find(ListNode head , int searchKey) {
		if (head == null) {
			return false;
		}
		ListNode current = head;
		while(current != null) {
			if(current.data == searchKey) {
				return true ;
			}
			current = current.next;
		}
		return false;
			
	}
	public void delete(int position) {
		if(position == 1 ) {
			head = head.next;
		}
		else {
			ListNode previous = head;
			int count = 1;
			while(count < position - 1) {
				previous  = previous.next;
				count++;
			}
			ListNode current = previous.next;
			previous.next  =current.next;
			
			
		}
	}
	public int length() {
		if(head == null) {
			return 0;
		}
	
			int count = 0 ;
			ListNode pointer = head;
			while(pointer != null) {
				count++;	
				pointer = pointer.next;
			}
			return count;
		
	}
	
	public static void main(String[] args) {
		LinkListUc9 singlyLinkList = new LinkListUc9();
		 singlyLinkList.insertData(56);
		 singlyLinkList.insertData(30);
		 singlyLinkList.insertData(40);
		 singlyLinkList.insertData(70);
		 singlyLinkList.printLinkList();
		 System.out.println();
		 if( singlyLinkList.find(head,40)) {
			 System.out.println("found");
			 singlyLinkList.delete(3);
			 singlyLinkList.printLinkList();
			 System.out.println();
			 System.out.println("Size of list is " +singlyLinkList.length());

		 }
		 else {
			 System.out.println("not found");
		 }
	}
}





