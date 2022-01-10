// Stack implementation
public class Stack
{
	private int arr[];
	private int top;
	private int capacity;
	
	//	Creating stack
	Stack(int size)
	{
		arr=new int[size];
		capacity=size;
		top=-1;
	}
	// Add element into stack
	public void push(int x)
	{
		if(isFull())
		{
			System.out.println("Overflow \n Program teminate");
			System.exit(1);
		}
		System.out.println("insert "+x);
		arr[++top]=x;
	}
	// Remove the element from Stack
	public void pop()
	{
		if(isEmpty())
		{
			System.out.println("Overflow \n Program teminate");
			System.exit(1);
		}
		return arr[top--];
	}
	// Utility function to return the size of the stack
  public int size() {
    return top + 1;
  }

  // Check if the stack is empty
  public Boolean isEmpty() {
    return top == -1;
  }

  // Check if the stack is full
  public Boolean isFull() {
    return top == capacity - 1;
  }

  public void printStack() {
    for (int i = 0; i <= top; i++) {
      System.out.println(arr[i]);
    }
  }
  public static void main(String[] args) 
  {
    Stack stack = new Stack(5);

    stack.push(1);
    stack.push(2);
    stack.push(3);
    stack.push(4);

    stack.pop();
    System.out.println("\nAfter popping out");

    stack.printStack();

  }
}
