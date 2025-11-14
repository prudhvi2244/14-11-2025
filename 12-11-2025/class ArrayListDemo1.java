import java.util.ArrayList;
class ArrayListDemo1{

    public static void main(String[] args) {
        
        ArrayList al=new ArrayList();
        al.add("A");
        al.add(10);  // 10 is autoboxed to Integer object
        al.add('A'); // 'A' is autoboxed to Character object
        al.add(10.4);
        al.add(null);
        al.add("A"); // duplicate element

            
    }

}