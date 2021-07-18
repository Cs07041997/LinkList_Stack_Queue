package com.bridgelabz.program;

public class LinkListUc4 {
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


	public void insert (int position , int value) {
		ListNode node = new ListNode(value);
		if (position == 1) {
			node.next = head;
			head = node;
			
		}else {
			ListNode previous = head;
			int count = 1;
			while (count < position - 1) {
				previous = previous.next;
				count++;
				
			}
			ListNode current = previous.next;
			previous.next = node;
			node.next = current;
			
		}
	}

	
	public static void main(String[] args) {
		LinkListUc4 singleLinkList  = new  LinkListUc4 ();
		singleLinkList.insert(1,56);
		singleLinkList.insert(2,30);	
		singleLinkList.insert(3,70);
		
	
		 singleLinkList. printLinkedList();

	}	
}

