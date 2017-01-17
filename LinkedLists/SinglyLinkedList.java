package LinkedLists;
import java.util.NoSuchElementException;

public class SinglyLinkedList {
	
	private int size;
	public Node first;
	public Node last;
	
	public SinglyLinkedList(){
		this.first = null;
		this.size = 0;
	}
	
	// add stuff in front 
	
	public void addFront(Object o){
		if (this.first == null){
			this.first = new Node(o);
			this.last = this.first;
		}else{
			Node oldFirst = this.first;
			this.first = new Node(o);
			this.first.next = oldFirst;
		}
		size++;
	}
	
	// remove item from the front or Right  
	
	public Object removeFront(){
		if (this.isNull()){
			throw new NoSuchElementException("The list is empty");
		}
		Object ret = this.first.item;
		this.first = this.first.next;
		size--;
		return ret;
	}
	
	// add item to the end or Left  
	
	public void addBack(Object o){
		if (first == null){
			this.last = new Node(o);
			this.first = this.last;
		}else{
			Node oldLast = this.last;
			this.last = new Node(o);
			oldLast.next = this.last;
		}
		size ++;
	}
	
	
	// return the size of the List
	
	public int length(){
		return this.size;
	}
	
	public boolean isNull(){
		return this.first == null;
	}
	
	// remove duplicates 
	
	public void removedups(){
		Node current = this.first;
		this.first = null;
		this.last = null;
		
		while(current != null){
			Node runner = current;
			while(runner.next != null){
				if(current.item.toString().equals(runner.next.item.toString())){
					runner.next = runner.next.next;
				}else{
					runner = runner.next;
				}
			}
			if(this.first == null){
				this.first = current;
			}
			this.last = current;
			current = current.next;
		}
	}
	
	// main method 
	public static void main(String args[]){
		SinglyLinkedList k = new SinglyLinkedList();
		k.addFront("shadid");
		k.addFront("Julia");
		k.addFront("SehMing");
		k.addFront("shadid");
		
		k.removedups();
		// iterate
		Node it = k.first;
		while(it != null){
			System.out.println(it.item.toString());
			it = it.next;
		}
	}
	
	/*
	 * Creating a Node class
	 */
	
	public class Node {
		Object item;
		Node next;
		
		public Node(Object o){
			this.item = o;
		}
	}

}