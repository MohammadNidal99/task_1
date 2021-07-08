package jo.secondstep.list;


public class Main {

	public static void main(String[] args) {

		// LinkedList list = new LinkedList();
		
		ArrayList numbers = new ArrayList();
		
		System.out.println(numbers.elements.length);
		numbers.add(20);
		numbers.add(20);
		numbers.add(20);
		numbers.add(20);
		numbers.add(20);
		numbers.add(20);
		numbers.add(20);
		numbers.add(20);
		numbers.add(20);
		System.out.println(numbers.elements.length);
		for(int i : numbers.elements) {
			System.out.print(i);
			System.out.print(" ");
		}
	}

}
