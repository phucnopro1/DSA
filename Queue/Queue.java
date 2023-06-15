package Queue;
public class Queue {
    private int maxSize;        // Maximum size of the queue
    private int front;          // Index of the front element
    private int rear;           // Index of the rear element
    private int[] queueArray;   // Array to store the queue elements
    private int currentSize;    // Current number of elements in the queue
    public Queue(int size) {
        maxSize = size;
        queueArray = new int[maxSize];
        front = 0;
        rear = -1;
        currentSize = 0;
    }
    public void enqueue(int value) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot enqueue element.");
            return;
        }
        rear = (rear + 1) % maxSize;   // Circularly increment rear index
        queueArray[rear] = value;
        currentSize++;
    }
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue element.");
            return -1;    // Return a default value or throw an exception to indicate an error
        }
        int dequeuedElement = queueArray[front];
        front = (front + 1) % maxSize;   // Circularly increment front index
        currentSize--;
        return dequeuedElement;
    }
    public int front() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot get front element.");
            return -1;    // Return a default value or throw an exception to indicate an error
        }
        return queueArray[front];
    }
    public int rear() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot get rear element.");
            return -1;    // Return a default value or throw an exception to indicate an error
        }
        return queueArray[rear];
    }
    public boolean isEmpty() {
        return (currentSize == 0);
    }
    public boolean isFull() {
        return (currentSize == maxSize);
    }
}
