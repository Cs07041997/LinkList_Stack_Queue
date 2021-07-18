package com.bridgelabz.program;

public class LinkList10 {
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
	

	public void sortedList() {
		ListNode current = head , index  = null;
		int temp; 
		if(head == null) {
			return;
		}
		else {
			while(current != null) {
				index = current.next;
			
			while (index != null) {
				if(current.data > index.data) {
					temp =  current.data;
					current.data = index.data;
					index.data = temp;
				}
				index = index.next;
			}
			current = current.next;
			}
		}
		
	}
	public static void main(String[] args) {
		LinkList10  singlyLinkList = new LinkList10 ();
		 singlyLinkList.insertData(56);
		 singlyLinkList.insertData(30);
		 singlyLinkList.insertData(40);
		 singlyLinkList.insertData(70);
		 System.out.println("Original data");
		 singlyLinkList.printLinkList();
		 System.out.println();
		 singlyLinkList.sortedList();
		 System.out.println("sorted data");
		 singlyLinkList.printLinkList();
		 		 
       }

}
