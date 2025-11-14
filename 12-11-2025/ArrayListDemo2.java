import java.util.ArrayList;

class ArrayListDemo2 {

    public static void main(String[] args) {

        ArrayList al = new ArrayList();
        al.add("A");
        al.add("B");
        al.add("C");
        al.add("A");

        System.out.println("Index of first occurrence of A: " + al.indexOf("A"));

        System.out.println("Index of last occurrence of A: " + al.lastIndexOf("A"));

    }
}