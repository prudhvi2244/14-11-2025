import java.util.Stack;
class StackDemo1 {
    public static void main(String[] args) {

        Stack stack = new Stack();

        for (int i = 1; i <= 5; i++) {
            System.out.println("Pushed Element: " + i);
            stack.push(i);
        }

        System.out.println("\nCurrent Stack: " + stack);
        System.out.println("\nPopping Elements from Stack:");
        System.out.println("Popped Element: " + stack.pop());

        System.out.println("Peeked Element: " + stack.peek());
        System.out.println("Is Stack Empty? " + stack.empty());
        System.out.println("Position of Element 3 from Top: " + stack.search(3));




    }
}