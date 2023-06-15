import java.util.Stack;
public class Pop {

        public static void main(String[] args) {
            // Create a new Stack
            Stack<String> stack = new Stack<>();

            // Push elements to the stack
            stack.push("Phong");
            stack.push("Hung");
            stack.push("Cat");
            stack.push("Quyen");


            // Pop elements from the stack
            String poppedElement1 = stack.pop();
            String poppedElement2 = stack.pop();

            // Print the popped elements
            System.out.println("Popped element 1: " + poppedElement1);
            System.out.println("Popped element 2: " + poppedElement2);

            // Print the updated stack
            System.out.println("Stack after popping: " + stack);
        }
    }

