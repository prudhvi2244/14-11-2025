import java.util.HashSet;
import java.util.LinkedHashSet;

class LinkedHashSetDemo1 {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        hashSet.add("A");
        hashSet.add("B");
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(null);

        System.out.println("Elements in HashSet: " + hashSet);

        LinkedHashSet hashSet1 = new LinkedHashSet();
        hashSet1.add("A");
        hashSet1.add("B");
        hashSet1.add(1);
        hashSet1.add(2);
        hashSet1.add(null);

        System.out.println("Elements in LinkedHashSet: " + hashSet1);


    }

}