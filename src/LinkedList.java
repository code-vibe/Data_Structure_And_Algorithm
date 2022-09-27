public class LinkedList {
    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
    }
    private Node first;
    private Node last;

    // addFirst
    public void addFirst(int item) {
        var node = new Node(item);
        if (isEmpty()) {
            first = last = node;
        } else {
            node.next = first;
            first = node;
        }
    }
    // addLast
    public void addLast(int item) {
        var node = new Node(item);
        if (first == null) {
            first = last = node;
        }else {
            last.next = node;
            last = node;
        }

    }
    // deleteFirst
    public void deleteFirst(int item) {

    }
    // deleteLast
    // containsLast
    // indexOf
    public int indexOf(int item) {
        int index = 0;
        var current = first;
        while (current != null){

        }
    return 0;
    }
    private boolean isEmpty() {
        return first == null;
    }
}
