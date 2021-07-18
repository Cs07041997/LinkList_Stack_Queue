package com.bridgelabz.program;

public class LinkListUc5 {
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
	public ListNode deleteFirst() {
		if(head == null) {
			return null;
		}
		ListNode temp = head;
		head = head.next;
		temp.next = null;
		return temp;
		
	}

	
	public static void main(String[] args) {
		LinkListUc5 singleLinkList  = new  LinkListUc5();
		 singleLinkList.insertLast(56);
		 singleLinkList.insertLast(30);
		 singleLinkList.insertLast(70);
		 singleLinkList. printLinkedList();
		 System.out.println();
		 System.out.println(singleLinkList.deleteFirst().data);
		 singleLinkList. printLinkedList();
		
      }

}


