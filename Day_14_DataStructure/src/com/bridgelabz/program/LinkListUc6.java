package com.bridgelabz.program;

public class LinkListUc6 {
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
	public ListNode deleteLast() {
		if (head == null || head.next == null) {
			return head;
		}
		ListNode current = head;
		ListNode previous = null;
		while(current.next != null) {
			previous = current ;
			current = current.next;
		}
		previous.next = null;
		return current;
		
	}

	
	public static void main(String[] args) {
		LinkListUc6 singleLinkList  = new  LinkListUc6();
		 singleLinkList.insertLast(56);
		 singleLinkList.insertLast(30);
		 singleLinkList.insertLast(70);
		 singleLinkList. printLinkedList();
		 System.out.println();
		 System.out.println(singleLinkList.deleteLast().data );
		 singleLinkList. printLinkedList();
	
    }

}


