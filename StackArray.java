/**
 * Implementation of a stack using an array.
 * Note that as an array has a predefined size, so this stack implementation will have a predefined size.
 * @author Mr. Hoover and the class
 *
 */
public class StackArray implements Stack
{
	private Object [] data;
	private int top;
	
	/**
	 * Default constructor.
	 * @param maxSize maximum number of elements that can be in the stack
	 */
	public StackArray(int maxSize)
	{
		data = new Object[maxSize];
		top = -1;
	}
	
	/**
	 * If the stack is not full, add the element.  If it is full, print an error message.
	 * @param x object to be pushed to the stack
	 */
	public void push(Object x)
	{
		if(!isFull())
		{
			data[++top]=x;
		}
		else
		{
			System.out.println("Error: Stack full.");
		}
	}
	
	/**
	 * Remove an object from the stack and return that object.
	 * @return the object on the top of the stack, or null iff it is empty.
	 */
	public Object pop()
	{
		return (isEmpty())? null : data[top--];
	}
	
	/**
	 * Return the object on top of the stack, but do not remove it
	 * @return the object on top of the stack, or null iff it is empty.
	 */
	public Object peek()
	{
		return (isEmpty())? null : data[top];
	}
	
	/**
	 * Check if the stack is empty
	 * @return false if there are objects in the stack, or true otherwise.
	 */
	public boolean isEmpty()
	{
		return top<0;
	}
	
	/**
	 * Check if the stack is full
	 * @return true if no more objects can be pushed to the stack, or false otherwise
	 */
	public boolean isFull()
	{
		return top >= data.length - 1;
	}
	
	/**
	 * Number of objects in the stack
	 * @return number of objects in the stack
	 */
	public int size()
	{
		return top + 1;
	}
	
	/**
	 * Revert the stack to an empty state
	 */
	public void makeEmpty()
	{
		top = -1;
	}
	
	/**
	 * Maximum number of elements that can be in the stack at one time
	 * @return maximum number of objects that can be in the stack
	 */
	public int maxSize()
	{
		return data.length;
	}
}
