import java.util.LinkedList;

class LinkedListDemo1 {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.add("A");
        ll.add(10); // 10 is autoboxed to Integer object
        ll.add('A'); // 'A' is autoboxed to Character object
        ll.add(10.4); 
        ll.add(null);
        ll.add("A"); // duplicate element

        System.out.println("Elements in LinkedList: " + ll);
    }

}