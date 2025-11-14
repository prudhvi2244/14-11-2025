import java.util.HashSet;
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
    }

}