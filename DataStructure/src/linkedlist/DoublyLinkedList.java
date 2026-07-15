package linkedlist;

public class DoublyLinkedList {
	
	private Node head;
	private Node tail;
	
	private int size;
	
	
	public void insertFirst(int val) {
			
		Node node = new Node(val);
		node.next = head;
		node.previous=null;
		if(head !=null) {
			head.previous=node;
		}
		head = node;
			
		size = size+1;		
	}
	
	public void insertLast(int val) {
		
		if(tail == null) {
			insertFirst(val);
		}
		
		Node node = new Node(val);
		node.next = null;
		node.previous = tail;
		
		tail.next = node;
		tail=node;
		
		size = size+1;
	}
	
	public void deleteFirst() {
		
		head = head.next;
		
		size--;
		
	}
	
	public void deleteLast() {

		tail = tail.previous;
		tail.next=null;
		
		size--;
		
	}
	
	public void insert(int val, int index) {
		
		if(index == 0) {
			insertFirst(val);
		}
		
		if(index == size) {
			insertLast(val);
		}
		
		
		Node temp = head;
		for(int i=1; i<index; i++) {
			temp = temp.next;		
		}
		
		Node node = new Node(val, temp.next, temp);
		temp.next.previous = node;
		temp.next = node;
		
		size = size+1;
		
	}
	
	public void delete(int index) {
		
		if(index == 0) {
			deleteFirst();
		}
		
		if(index == size) {
			deleteLast();
		}
		
		Node temp = head;
		
		for(int i=1; i < index; i++) {
			temp = temp.next;			
		}
	
		temp.next = temp.next.next;
		
		
		size =size-1;
		
	}
	
	public void display(){
		
		Node temp = head;
		while(temp!=null) {
			System.out.print(temp.val+"-->");
			temp = temp.next;
		}
		System.out.println("null");
	}	
	
	





	private class Node{
		private int val;
		private Node next;
		private Node previous;
				
		public Node(int val) {
			super();
			this.val = val;
		}

		public Node(int val, Node next, Node previous) {
			super();
			this.val = val;
			this.next = next;
			this.previous = previous;
		}	
		
	}

}
