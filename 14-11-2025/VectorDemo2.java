import java.util.Vector;
import java.util.Enumeration;
class VectorDemo2{
    public static void main(String[] args) {
        Vector vector = new Vector();
        vector.add("Apple");
        vector.add("Banana");
        vector.add("Cherry");
        vector.add("Date");
        vector.add("Elderberry");

        System.out.println("Elements in Vector without cursor: " + vector);

        System.out.println("Elements in Vector using Enumeration cursor:");
        Enumeration enumeration = vector.elements();

        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }

    }
    
}