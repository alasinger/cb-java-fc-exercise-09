package at.femaletrack.linkedlist;

public class TestBed {

	public static void main(String[] args) {
		LinkedList myList = new LinkedList();
		if(myList.size() != 0) {
			System.out.println("Oops, something went wrong in your implementation.");
			return;
		}
		
		if(myList.remove(5) || myList.remove("Not here")) {
			System.out.println("Oops, something went wrong in your implementation.");
			return;
		}
		
		myList.append("First");
		myList.append("Second");
		
		if(myList.size() != 2) {
			System.out.println("Oops, something went wrong in your implementation.");
			return;
		}
		
		myList.add(1, "Between First and Second");
		String element = myList.get(1);
		String tail = myList.get(2);
		if(element.compareTo("Between First and Second") != 0 || tail.compareTo("Second") != 0) {
			System.out.println("Oops, something went wrong in your implementation.");
			return;
		}
		
		myList.add(0, "New Head");
		String head = myList.get(0);
		if(head.compareTo("New Head") != 0) {
			System.out.println("Oops, something went wrong in your implementation.");
			return;
		}
		
		myList.append("Third");
		
		if(!myList.remove(0)) {
			System.out.println("Oops, something went wrong in your implementation.");
			return;
		}
		
		head = myList.get(0);
		if(head.compareTo("First") != 0) {
			System.out.println("Oops, something went wrong in your implementation.");
			return;
		}
		
		if(!myList.remove("Third") || !myList.remove(myList.size() - 1)) {
			System.out.println("Oops, something went wrong in your implementation.");
			return;
		}
		
		if(myList.size() != 2 || myList.get(1).compareTo("Between First and Second") != 0) {
			System.out.println("Oops, something went wrong in your implementation.");
			return;
		}
		
		myList.append("Duplicate");
		myList.append("Duplicate");
		int firstOccurence = myList.indexOf("Duplicate");
		if(firstOccurence != 2) {
			System.out.println("Oops, something went wrong in your implementation.");
			return;
		}
		
		myList.remove("Duplicate");
		if(myList.size() != 2) {
			System.out.println("Oops, something went wrong in your implementation.");
			return;
		}
		
		if(!myList.remove(1)) {
			System.out.println("Oops, something went wrong in your implementation.");
			return;
		}
		
		if(myList.get(0).compareTo("First") != 0 || myList.size() != 1) {
			System.out.println("Oops, something went wrong in your implementation.");
			return;
		}
		
		if(myList.get(100) != null || myList.indexOf("Not Part") != -1) {
			System.out.println("Oops, something went wrong in your implementation.");
			return;
		}
		
		myList.add(100, "I am at the very end");
		if(!myList.remove(myList.size() - 1)) {
			System.out.println("Oops, something went wrong in your implementation.");
			return;
		}
		
		if(myList.remove(100) || myList.remove("I do not exist")) {
			System.out.println("Oops, something went wrong in your implementation.");
			return;
		}
		System.out.print("Congratulations!!!! Your implementation is correct.");
		
	}

}
