import java.util.Stack;
public class Peek {

        public static void main(String[] args) {
            // Create a new Stack
            Stack<String> stack = new Stack<>();

            // Populate the stack with elements using push()
            stack.push("Do");
            stack.push("Khanh");
            stack.push("Toan");

            // Retrieve the top element using peek()
            String topElement = stack.peek();

            // Print the top element
            System.out.println("Top element: " + topElement);

            // Print the stack
            System.out.println("Stack: " + stack);
        }
    }

