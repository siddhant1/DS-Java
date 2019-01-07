

class Node {
	int value;
	Node next;
	public Node(int value){
		this.value=value;
		this.next=null;
	}
}

class LinkedList{
	Node head;
	Node tail;
	int length;
	public LinkedList() {
		this.head=null;
		this.tail=null;
		this.length=0;
	}
	
	public void push(int value){
		Node node = new Node(value);
		if(this.head==null) {
			this.head=node;
			this.tail=node;
			return;
		}else {
			this.tail.next=node;
			this.tail=node;
			return;
		}
	}	
	
	public void pop() {
		if(this.head == this.tail) {
			this.head=null;
			this.tail=null;
			return;
		}
		Node pre = this.head;
		Node current = pre.next;
		while(current.next != null) {
			current=current.next;
			pre=pre.next;
		}
		pre.next=null;
		this.tail=pre;
		return;
	}
}

public class LinkedListRun {

	public static void main(String[] args) {
		LinkedList linked = new LinkedList();
		linked.push(3);
		linked.push(4);
		linked.push(5);
		linked.pop();
		System.out.println(linked);

 }
}
