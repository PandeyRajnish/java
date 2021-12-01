package ds;

public class LinkedList {
	
	Node head;
	
	public void create(int[] a, int n) {
		Node node,last;
		head = new Node();
		head.data=a[0];
		head.next = null;
		last = head;
		
		for(int i =1;i<n;i++) {
			node = new Node();
			node.data = a[i];
			node.next = null;
			last.next = node;
			last = node;
			
		}
	}
	
	public int count(Node n) {
		int c=0;
		while(n != null) {
			c++;
			n=n.next;
		}
		return (c);
	}
	
	public void insertAT(int pos, int data) {
		
		Node nd = new Node();
		Node nodenew;
		
		if(pos == 0) {
			nodenew = new Node();
			nodenew.data = data;
			nodenew.next = head;
			head = nodenew;
		}
		else if(pos > 0) {
			nd = head;
			for(int i = 0;i<pos-1 && head != null;i++)
				nd = nd.next;
			if(nd != null) {
				nodenew = new Node();
				nodenew.data = data;
				nodenew.next = nd.next;
				nd.next = nodenew;
			}
		}
		
	}
	
	public void show() {
		
		Node node = head;
		
		while(node.next != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
		System.out.println(node.data);
	}

}
