import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.addFirst(500);
        list.add(3,30);
        System.out.println(list.size());
        list.removeLast();
        System.out.println(list.contains(500));
        System.out.println(list);
    }
    }