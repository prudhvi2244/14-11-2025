import java.util.ArrayList;

class ArrayListDemo1 {

    public static void main(String[] args) {

        ArrayList al = new ArrayList();
        al.add("A");
        al.add(10); // 10 is autoboxed to Integer object
        al.add('A'); // 'A' is autoboxed to Character object
        al.add(10.4);
        al.add(null);
        al.add("A"); // duplicate element

        System.out.println("Elements in ArrayList: " + al);
        System.out.println("Size of ArrayList: " + al.size());

        System.out.println("Does ArrayList contains 10.4? " + al.contains(10.4));

        System.out.println("Is ArrayList empty? " + al.isEmpty());

        System.out.println("Removing element null: " + al.remove(null));

        System.out.println("Elements in ArrayList after removal: " + al);

        System.out.println("Element at index 2: " + al.get(2));


        al.set(2,"SRM");
        System.out.println("After setting element at index 2: " + al.get(2));

        System.out.println("Elelemnts of ArrayList "+ al);

        al.add(1,"Hello");

        System.out.println("After adding element at index 1: " + al);

        al.clear();
        System.out.println("After Removing all elements: " + al);

    }

}