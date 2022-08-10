package insertionSort;

public class InsertionSorting1 {

	public Node head;

	public InsertionSorting1(int[] b) {

		head = new Node(0, null, null);
		Node tail = head;

		for (int i = 0; i < b.length; i++) {
			Node x = new Node(b[i], null, null);
			tail.next = x;
			x.prev = tail;
			tail = tail.next;
		}
		tail.next = head; // making the linked list circular
		head.prev = tail;
	}

	public void forwardprint() {
		for (Node h = head.next; h != head; h = h.next) {
			System.out.print(h.element + " ");
		}
		System.out.println();

	}

	public void sort() {

		for (Node i = head.next.next; i != head; i = i.next) {
			int key = i.element; // unsorted
			Node j = i.prev; // sorted

			while (j != head && j.element > key) {
				j.next.element = j.element;
				j = j.prev;

			}
			j.next.element = key;

		}

	}

}
