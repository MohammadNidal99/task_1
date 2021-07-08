package jo.secondstep.list;

public class LinkedList implements List {
	
	Node head;

	@Override
	public void add(int value) {
		Node newNode = new Node();
		newNode.value = value;
		newNode.next = null;
		
		if(head == null) {
			head = newNode;
		}
		else {
			Node temp = head;
			while(temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
		}
		
		
	}

	@Override
	public void add(int value, int position) {
		if (position  > size() || position < 0) {
			System.out.println("Out of Size");
		}
		else if(position == 0) { 
			Node newNode = new Node();
			newNode.value = value;
			newNode.next = head;
			head = newNode;
		} else if(position ==size()+1) {
			add(value);
		}
		else {
			Node newNode = new Node();
			newNode.value = value;
			Node temp = head;
			for(int i=0;i<position-1;i++) {
				temp = temp.next;
			}
			newNode.next = temp.next;
			temp.next = newNode;
		}
		
	}

	@Override
	public int remove(int position) {
		int removedElement = -1;
		if(position < 1 || position > size()) {
			System.out.println("Out of Size");
		}else if(position == 1) {
			removedElement = head.value;
			head = head.next;
		}
		else {
			Node current = head;
			Node previous = null;
			int marker = 0;
			while(marker < position-1 ) {
				previous = current;
				current = current.next;
				marker++;
			}
			previous.next = current.next;
			removedElement = current.value;
			
		}
		return removedElement;
	}

	@Override
	public int get(int position) {
		if(isEmpty()) {
			System.out.println("List is Empty");
			return -1;
		}
		else if (position < 0 || position >= size()) {
			System.out.println("Out of Size");
			return -1;
		}
		else {
			int marker = 0;
			Node temp = head;
			while(marker < position) {
				temp = temp.next;
				marker++;
				
			}
			return temp.value;
		}
		
		
	}

	@Override
	public int size() {
		int counter = 0;
		Node temp = head;
		while (temp != null) {
			counter++;
			temp = temp.next;
		}
		return counter;
	}

	@Override
	public void clear() {
		head = null;
		
	}

	@Override
	public void set(int value, int position) {
		if (position < 0 || position >= size()) {
			System.out.println("Out of Size");
		}
		else {
			int marker = 0;
			Node temp = head;
			while(marker < position) {
				temp = temp.next;
				marker++;
				
			}
			temp.value = value;
			
		}
		
	}

	@Override
	public boolean isEmpty() {
		if(head == null)
			return true;
		else
			return false;
	}

}
