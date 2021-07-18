package com.bridgelabz.program;

public class LinkListUc3 {
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

	public void  append(int value ) {
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

	
	public static void main(String[] args) {
		LinkListUc3 singleLinkList  = new  LinkListUc3 ();
		 singleLinkList.append(56);
		 singleLinkList.append(30);
		 singleLinkList.append(70);
		 singleLinkList. printLinkedList();
		

}


}
