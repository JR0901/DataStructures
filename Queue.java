import java.util.*;

class Queue {
	private static int front, end, capacity;
	private static int queue[];
	
	Queue(int size){
		front = end = 0;
		capacity = size;
		queue = new int[capacity];
	}
	// Enqueue item to list
	static void queueEnqueue (int item) {
		//check if the queue is full
		if (capacity == end) {
			System.out.println("Queue is full");
			return;
		}
		else {
			queue[end] = item;
			end++;
		}
		return;
	}
	
	//Dequeue item from list
	static void queueDequeue() {
		//check if queue is empty
		if (front == end) {
			System.out.println("Queue is empty");
			return;
		}
		else {
			for (int i=0; i < end -1; i++) {
				queue[i] = queue[i+1];
			}
			
			// set queue end to 0/null/empty
			if (end < capacity) {
				queue[end] = 0;
				end--;
			}
			return;
		}
					
	}
	
	static void queueDisplay() {
		//check if empty
		int i;
		if (front == end) {
			System.out.println("Queue is empty");
			return;
		}
		
		//traverse through the queue and output elements
		for (i = front; i < end; i++) {
			System.out.print(queue[i]);
			System.out.print(", ");
		}
		return;
	}

}
