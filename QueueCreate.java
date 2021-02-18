import java.util.*;
public class QueueCreate {
	public static void main(String[] args) {
		//create a queue of chosen capacity e.g. 5
		Queue q = new Queue(5);
		
		//Enqueue items
		q.queueEnqueue(10);
		q.queueEnqueue(30);
		q.queueEnqueue(50);
		q.queueEnqueue(40);
		q.queueEnqueue(20);
		
		//Output queue elements
		q.queueDisplay();
		
		//Enqueue item at max capacity
		q.queueEnqueue(60);
		
		//dequeue 3 items
		q.queueDequeue();
		q.queueDequeue();
		q.queueDequeue();
		
		//Output queue elements
		q.queueDisplay();

	}

}
