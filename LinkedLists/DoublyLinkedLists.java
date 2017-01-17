package LinkedLists;

public class DoublyLinkedLists {
	
	
	public class Node{
		int data;
        Node next, prev;
 
        Node(int d) {
            data = d;
            next = prev = null;
        }
	}
	
	Node head;

	public DoublyLinkedLists(){
	}
	
	public void push(int val){
		Node new_node = new Node(val);
		new_node.prev = null;
		new_node.next = this.head;
		if (this.head != null) {
	        this.head.prev = new_node;
	    }
		this.head = new_node;
	}
	
	public void print(){
		Node cur = head;
		while(cur != null){
			System.out.println(cur.data);
			cur = cur.next;
		}
	}
	
	public static void main(String args[]){
		DoublyLinkedLists list = new DoublyLinkedLists();
		list.push(8);
		list.push(6);
		list.push(10);
		
		list.print();
	}
	
}
