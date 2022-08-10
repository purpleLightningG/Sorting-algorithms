package selectionSort;

import bubbleSorting.Node;

public class SelectionSort1 {

	public Node head;

	public SelectionSort1(int[] b) {

		head = new Node(0, null, null);
		Node tail = head;

		for (int i = 0; i < b.length; i++) {

			Node x = new Node(b[i], null, null);
			tail.next = x;
			x.prev = tail;
			tail = tail.next;
		}

		tail.next = head; // making it circular
		head.prev = tail;

	}

	public void forwardprint() {
		Node cur = head.next;
		while (cur != head) {
			System.out.print(cur.element + " ");
			cur = cur.next;
		}
		System.out.println("");
	}

	public void sort() {
		for (Node i = head.next; i.next != head; i = i.next) {

			for (Node j = i.next; j != head; j = j.next) {
				int x = j.element;
				int y = i.element;

				if (x < y) {

					int temp = i.element;
					i.element = j.element;
					j.element = temp;
				}
			}
		}

	}

}
