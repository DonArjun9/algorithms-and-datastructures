package linkedlist;

public class Main {
	
	public static void main(String[] args) {
		
//		SingleLinkedList l = new SingleLinkedList();
//		l.insertFirst(4);
//		l.insertFirst(16);
//		l.insertFirst(7);
//		
//		
//		l.insertLast(9);
//		
//		l.insert(5, 3);
//		
//     	l.deleteFirst();
//		l.deleteLast();
//		
//		l.display();
//		
//		l.delete(0);
//		l.display();
		
		
		DoublyLinkedList dll = new DoublyLinkedList();
		dll.insertFirst(4);
		dll.insertFirst(15);
		dll.insertFirst(6);
		dll.insertLast(9);
		
		dll.display();
		
		dll.insert(5, 3);
		dll.display();
		
		
//		dll.deleteFirst();
//		dll.display();
//		dll.deleteLast();
//		dll.display();
		
		
		
		
		
	}

}
