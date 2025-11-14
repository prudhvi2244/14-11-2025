import java.util.Comparator;
import java.util.TreeSet;

class MyComparator implements Comparator {

    @Override
    public int compare(Object obj1,Object obj2){
        Student student1=(Student)obj1;
        Student student2=(Student)obj2;
       return -student1.sid.compareTo(student2.sid);
    }

}

class TreeSetDemo2 {
    public static void main(String[] args) {
        TreeSet treeset = new TreeSet(new MyComparator());
        Student student1 = new Student(1, "Prudhvi", "prudhvi@gmail.com");
        Student student2 = new Student(2, "Praveen", "praveen@gmail.com");
        Student student3 = new Student(3, "Bindu", "bindu@gmail.com");
        Student student4 = new Student(4, "Arya", "arya@gmail.com");

        treeset.add(student1);
        treeset.add(student2);
        treeset.add(student3);
        treeset.add(student4);

        System.out.println(treeset);

    }

}