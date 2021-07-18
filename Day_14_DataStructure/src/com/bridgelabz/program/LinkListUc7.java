package com.bridgelabz.program;

public class LinkListUc7{
public static   ListNode head;
	
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

	public void insertLast(int value ) {
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
	public boolean  find(ListNode head ,int searchKey) {
		if (head == null) {
			return false;
		}
		ListNode current = head;
		while(current != null) {
			if(current.data == searchKey) {
				return true;
			}
			current = current.next;
		}
		return false;
		
	}
	

	
	public static void main(String[] args) {
		LinkListUc7 singleLinkList  = new LinkListUc7 ();
		 singleLinkList.insertLast(56);
		 singleLinkList.insertLast(30);
		 singleLinkList.insertLast(70);
		 singleLinkList. printLinkedList();
		 System.out.println();
		 if( singleLinkList.find(head, 30)) {
			 System.out.println("found");
		 }
		 else {
			 System.out.println("not found");
		 }
				
	}

}
