package Stack;
public class Stack {
    private int maxSize;        // Maximum size of the stack
    private int top;            // Index of the top element
    private int[] stackArray;   // Array to store the stack elements
    public Stack(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;               // Initialize the top index to -1 (empty stack)
    }
    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack is full. Cannot push element.");
            return;
        }
        top++;
        stackArray[top] = value;
    }
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop element.");
            return -1;    // Return a default value or throw an exception to indicate an error
        }
        int poppedElement = stackArray[top];
        top--;
        return poppedElement;
    }
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot peek element.");
            return -1;    // Return a default value or throw an exception to indicate an error
        }
        return stackArray[top];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == maxSize - 1);
    }
}
