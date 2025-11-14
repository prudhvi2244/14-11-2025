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
        System.out.println("First Element: " + ll.getFirst());
        System.out.println("Last Element: " + ll.getLast());
        System.out.println("Removing First Element: " + ll.removeFirst());
        System.out.println("Removing Last Element: " + ll.removeLast());
        System.out.println("Elements in LinkedList after removals: " + ll);
        ll.addFirst("First");
        ll.addLast("Last");
        System.out.println("Elements in LinkedList after adding first and last: " + ll);    
    }

}