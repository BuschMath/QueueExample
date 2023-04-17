/*In this example, we use a LinkedList, which is an implementation 
    of the List interface from the Java Collections Framework, to 
    implement a simple queue data structure. We use the offer() 
    method to enqueue elements to the end of the queue, and the 
    poll() method to dequeue elements from the front of the queue. 
    We also demonstrate how to check if the queue is empty using the 
    isEmpty() method. Note that LinkedList is a double-ended queue 
    (deque), which allows elements to be added and removed from both 
    ends efficiently, making it suitable for implementing both stacks 
    and queues. */

import java.util.LinkedList;

public class QueueExample {
    public static void main(String[] args) {
        // Create a new LinkedList instance
        LinkedList<String> queue = new LinkedList<>();

        // Enqueue elements to the end of the queue
        queue.offer("Alice");
        queue.offer("Bob");
        queue.offer("Charlie");

        // Print the initial queue
        System.out.println("Initial Queue: " + queue);

        // Dequeue elements from the front of the queue
        String first = queue.poll();
        String second = queue.poll();
        String third = queue.poll();

        // Print the dequeued elements
        System.out.println("Dequeued Elements: " + first + ", " + second + ", " + third);

        // Check if the queue is empty
        boolean isEmpty = queue.isEmpty();
        System.out.println("Is the Queue empty? " + isEmpty);
    }
}
