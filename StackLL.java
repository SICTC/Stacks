/**
 * @author Mr. Hoover and the AM Class
 * This class implements a stack interface.  The stack is a First-In, Last-Out data structure (FILO).  We implement this stack using linked lists.
 */
public class StackLL implements Stack
{
	//nodes hold our data and a pointer to the next node
	/**
	 * Nodes hold our data in the stack.
	 */
	private class node
	{
		public Object data;
		public node next;
	}
	
	private node top;
	private int count;
	
	//stack constructor
	//first in last out
	/**
	 * Default constructor.  Initializes an empty stack.
	 */
	public StackLL()
	{
		top = null;
		count = 0;
	}
	
	//add an object to the stack
	/* Add an object to the stack.
	 * @param x the object to be pushed to the stack.
	 */
	public void push(Object x)
	{
		node newnode = new node();
		newnode.data = x;
		newnode.next = top;
		top = newnode;
		count++;
	}
	
	//remove an object from the stack
	/**
	 * Remove the top object from the stack and return it.
	 * @return the object popped from the stack, or null if the stack is empty.
	 */
	public Object pop()
	{
		if(isEmpty())
		{
			return null;
		}
		else
		{
			Object dataToReturn = top.data;
			top = top.next;
			count--;
			return dataToReturn;
		}
	}
	
	//return the top object, but don't remove it
	/**
	 * Return the top object of the stack, but don't remove it.
	 * @return the top object in the stack, or null if empty.
	 */
	public Object peek()
	{
		//ternary operator: (condition)? trueBranch : falseBranch;
		//String isTrue = (isConditionTrue)? "True" : "False";
		return (isEmpty())? null : top.data;
	}
	
	//checks if the stack is empty by checking the top node
	/**
	 * Checks if the top node is null
	 * @return a boolean representing if the stack is empty
	 */
	public boolean isEmpty()
	{
		return top==null;
	}
	
	//our stack will never be full!
	/**
	 * Our stack is never full.
	 * @return false, always.
	 */
	public boolean isFull()
	{
		return false;
	}
	
	//returns the size of our stack
	/**
	 * @return the number of objects in the stack
	 */
	public int size()
	{
		return count;
	}
	
	//reverts the stack to an empty state
	//as if it had just been initialized
	/**
	 * Reset the stack to an empty state, as if it had just been initialized.
	 */
	public void makeEmpty()
	{
		top = null;
		count = 0;
	}
}
