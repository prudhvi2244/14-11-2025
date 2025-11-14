import java.util.HashSet;
import java.util.Iterator;
class HashSetDemo1 {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();

        System.out.println("HashSet created: " + hashSet);
        hashSet.add("A");
        hashSet.add("B");
        hashSet.add(null);
        hashSet.add("A"); // Duplicate element
        hashSet.add(10.5);
        System.out.println("Elements in HashSet: " + hashSet);

        Iterator iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            if(iterator.next() == null) {
                iterator.remove(); // Removing null element
            } 
                System.out.println("Element: " + iterator.next());
            
        }

        System.out.println("HashSet after removing null element: " + hashSet);

    }

}