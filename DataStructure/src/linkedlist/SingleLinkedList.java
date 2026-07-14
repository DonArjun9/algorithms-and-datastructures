package linkedlist;

public class SingleLinkedList {
	
	private Node head;
	private Node tail;
	
	private int size;
	
	
	public void insertFirst(int val) {
			
		Node node = new Node(val);
		if(size==0) {
			node.next = null;
		}
		else node.next = head;	
		head = node;
		
		if(tail == null) {
			tail=head;
		}
		size = size+1;
		
	}
	
	public void insertLast(int val) {
		
		if(tail == null) {
			insertFirst(val);
		}
		
		Node node = new Node(val);
		node.next = null;
		tail.next = node;
		tail=node;
		
		size = size+1;
	}
	
	public void deleteFirst() {
		
		head = head.next;
		
		size--;
		
	}
	
	public void deleteLast() {
		
		Node temp = head;
		for(int i=1; i<size-1; i++) {
			temp = temp.next;
		}
		
		temp.next = null;
		tail=temp;
		
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
		
		Node node = new Node(val, temp.next);
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
				
		public Node(int val) {
			super();
			this.val = val;
		}

		public Node(int val, Node next) {
			super();
			this.val = val;
			this.next = next;
		}	
		
	}

}
