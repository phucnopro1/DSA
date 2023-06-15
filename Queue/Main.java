package Queue;

public class Main {
    public static void main(String[] args) {
        Queue myQueue = new Queue(5);

        myQueue.enqueue(10);
        myQueue.enqueue(20);
        myQueue.enqueue(30);

        System.out.println("Front element: " + myQueue.front());
        System.out.println("Rear element: " + myQueue.rear());

        System.out.println("Dequeued element: " + myQueue.dequeue());
        System.out.println("Dequeued element: " + myQueue.dequeue());

        System.out.println("Is queue empty? " + myQueue.isEmpty());
    }
}
