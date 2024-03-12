package qa.guru_2.practice;

import java.util.LinkedList;
import java.util.Queue;

public class QueuePractice {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        queue.add("One");
        queue.add("Two");
        queue.add("Three");
        queue.add("Four");
        queue.add("Five");
        System.out.println(queue);

        addMethod(queue, "Sixth through method");
        addMethod(queue, "Seventh through method");
        getQueue(queue);

        removeMethod(queue, "Sixth through method");
        getQueue(queue);

        findMethod(queue, "Four");
    }

    public static void addMethod(Queue<String> queue, String element) {
        queue.add(element);
    }

    public static void removeMethod(Queue<String> queue, String element) {
        queue.remove(element);
    }

    public static void findMethod(Queue<String> queue, String value) {
        for (String element : queue) {
            if (element.equals(value)) {
                System.out.println(value);
            }
        }
    }

    private static void getQueue(Queue<String> queue) {
        System.out.println(queue);
    }
}
