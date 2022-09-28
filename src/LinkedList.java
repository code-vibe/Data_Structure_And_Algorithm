import java.util.NoSuchElementException;

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

    /**
     * Always check for edge case, here we checked if the linked list is emppty,
     * if empty, it throws aa exception.
     *  we accounted for the list having only one item.
     *
     *  We should always review our code, test it with various input
     *  and think of various edge cases.
     */
    public void removeFirst() {
        if (isEmpty())
            throw new NoSuchElementException();
        if (first == last){
            first = last = null;
            return;
        }
        var second = first.next;
        first.next = null;
        first = second;

    }

    //deleteLast
    public void removeLast(){
    var previous = getPrevious(last);
    last = previous;
    last.next = null;
    }
    private Node getPrevious(Node node) {
        var current = first;
        while (current != null) {
            if(current.next == node)
                return current;
            current = current.next;
        }
        return null;
    }
    // containsLast
    public boolean contains(int item) {
        return indexOf(item) != -1;
    }
    // indexOf
    public int indexOf(int item) {
        int index = 0;
        var current = first;
        while (current != null){
            if (current.value == item)
                return index;
            current = current.next;
            index ++;
        }
        return (-1);
    }
    private boolean isEmpty() {
        return first == null;
    }
}
