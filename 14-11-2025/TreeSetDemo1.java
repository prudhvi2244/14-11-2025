import java.util.TreeSet;
class TreeSetDemo1{
    public static void main(String[] args) {
        TreeSet treeSet = new TreeSet();
        treeSet.add(1);
        treeSet.add(9);
        treeSet.add(5);
        treeSet.add(3);
        treeSet.add(2);
        treeSet.add(7);
        treeSet.add(8);
        treeSet.add(6);
        treeSet.add(4);
        System.out.println("Elements in TreeSet: " + treeSet);

        System.out.println("subSet(3,7) : " + treeSet.subSet(3,7));
        System.out.println("headSet(5) : " + treeSet.headSet(5));
        System.out.println("tailSet(5) : " + treeSet.tailSet(5));
        System.out.println("first() : " + treeSet.first());
        System.out.println("last() : " + treeSet.last());
        System.out.println("comparator() : " + treeSet.comparator());


    }
}