
public class StackCreate {
	public static void main(String[] args) {
		 
        Stack stack = new Stack(6);
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        
        //Size of stack after push operation
        System.out.println(stack.size());
        
        //Pop elements from stack
        while (!stack.isEmpty()) {
        	System.out.printf(" %d \n",  stack.pop());
        }
        
        //Size of stack after pop
        System.out.println(stack.size());
        
        }
}
