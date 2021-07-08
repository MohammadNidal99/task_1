package jo.secondstep.list;

public class ArrayList implements List{
	private static final int DEFAULT_CAPACITY = 4;
	int[] elements = new int[DEFAULT_CAPACITY];
	int size;

	@Override
	public void add(int value) {
		int currentCapacity = elements.length;
		if(size == currentCapacity) {
			int[] newElements = elements;
			int[] elements = new int[currentCapacity*2];
			//DEFAULT_CAPACITY+=2;
			this.elements = elements;
			for(int i=0;i<size;i++) {
				this.elements[i] = newElements[i];
			}
			
		}
		elements[size] = value;
		size++;
		
	}

	@Override
	public void add(int value, int position) {
		int currentCapacity = elements.length;
		if(size == currentCapacity) {
			int[] newElements = elements;
			int[] elements = new int[currentCapacity*2];
			//DEFAULT_CAPACITY+=2;
			this.elements = elements;
			for(int i=0;i<size;i++) {
				this.elements[i] = newElements[i];
			}
			
		}
		
		if (position < 0 || position > size) {
			System.out.println("Out of index");
		}
		else {
			for(int i = size;i>position;i--) {
				elements[i] = elements[i-1];
			}
			elements[position] = value;
			size++;
		}
		
		
	}

	@Override
	public int remove(int position) {
		int currentCapacity = elements.length;
		if(position < 0 || position >= size) {
			System.out.println("Out of index");
			return -1;
		}
		else {
			int removedElement = elements[position];
			for(int i=position;i<size-1;i++) {
				elements[i] = elements[i+1];
			}
			size--;
			elements[size] = 0;
			
			if(size <= currentCapacity/2) {
				int[] newElements = elements;
				int[] elements = new int[size];
				currentCapacity = size;
				this.elements = elements;
				for(int i=0;i<size;i++) {
					this.elements[i] = newElements[i];
				}
			}
			return removedElement;
		}
		
	}

	@Override
	public int get(int position) {
		if(isEmpty()) {
			System.out.println("Array is Empty");
			return -1;
		}
		else if(position >= size || position < 0) {
			System.out.println("Out of Index");
			return -1;
		}
		else
			return elements[position];
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public void clear() {
		elements = new int[ArrayList.DEFAULT_CAPACITY];
		size = 0;
		
	}

	@Override
	public void set(int value, int position) {
		if (position < 0 || position >= size) {
			System.out.println("Out of Index");
		}
		else {
			elements[position] = value;
		}
		
		
	}

	@Override
	public boolean isEmpty() {
		if(size ==0)
			return true;
		else
			return false;
	}

}
