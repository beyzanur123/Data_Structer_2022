import java.util.NoSuchElementException;

public class Queue {
    private int[] data;
    private int front;
    private int rear;

    public Queue(int size) {
        data = new int[size];
        front = -1;
        rear = -1;
    }

    public boolean isEmpty() {
        return front == -1 && rear == -1;
    }

    public boolean isFull() {
        return (rear + 1) % data.length == front;
    }

    public void enqueue(int value) {
        if (isFull()) {
            throw new IllegalStateException("Queue is full");
        }
        if (isEmpty()) {
            front = rear = 0;
        } else {
            rear = (rear + 1) % data.length;
        }
        data[rear] = value;
    }

    public int dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        int value = data[front];
        if (front == rear) {
            front = rear = -1;
        } else {
            front = (front + 1) % data.length;
        }
        return value;
    }

    public int peek() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        return data[front];
    }
}