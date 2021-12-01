package ds;

public class Runner {
	
	static Node head;
	public static void main(String[] args) {
		Node d=null;
		int A[] = {1,2,3,4,5,6,7,8};
		int l = A.length;
		LinkedList ll = new LinkedList();
//		ll.insert(1,6);
//		ll.insert(0,5);
		
		ll.create(A, l);
		ll.show();
		System.out.println("After inserting at given position");
//		ll.insertAT(0, 2);
//		ll.insertAT(5, 123);
		ll.insertAT(8, 2);
		ll.insertAT(9, 2);
		ll.insertAT(10, 2);
//		ll.insertAT(9, 9);
		ll.show();
		int a = ll.count(head);
		System.out.println("Total node of linked list is : "+a);

	}

}
