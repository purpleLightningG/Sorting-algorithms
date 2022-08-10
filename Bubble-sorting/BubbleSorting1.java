package bubbleSorting;

public class BubbleSorting1 {

	public Node head;

	public BubbleSorting1(int[] b) {

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

		int n = 0, i = 0, j = 0;
		for (Node h = head.next; h != head; h = h.next) {
			n++;
		}
		for (i = 0; i < n - 1; i++) {
			Node current = head;
			for (j = 0; j < n - i - 1; j++, current = current.next) {
				if (current.next.element < current.element) {
					int tmp = current.element;
					current.element = current.next.element;
					current.next.element = tmp;
				}
			}
		}
	}

}
