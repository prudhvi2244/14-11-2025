import java.util.ArrayList;
import java.util.ListIterator;

class ArrayListDemo3 {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Cherry");
        arrayList.add("Date");
        arrayList.add("Elderberry");

        System.out.println("Elements in ArrayList without cursor: " + arrayList);

        ListIterator listIterator = arrayList.listIterator();
        System.out.println("Traversing in forward direction:");
        while (listIterator.hasNext()) {
            if (listIterator.next().equals("Cherry")) {
                listIterator.set("Citrus");
            }

        }

        System.out.println("Retraversing in backward direction:");
        while (listIterator.hasPrevious()) {
            if (listIterator.previous().equals("Date")) {
                listIterator.add("Dragonfruit");
            }
        }

        System.out.println("Elements in ArrayList after modification: " + arrayList);
    }
}