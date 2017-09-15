
public interface Stack 
{
	/**
	 * Add an object to the stack
	 * @param x object to be added to the stack
	 */
	public void push(Object x);
	
	/**
	 * Remove and return the top object of the stack
	 * @return object removed from the stack
	 */
	public Object pop();
	
	/**
	 * Return the top object of the stack, but don't remove it
	 * @return object on top of the stack
	 */
	public Object peek();
	
	/**
	 * Check if there are no objects in the stack
	 * @return true if there are no objects in the stack, false otherwise
	 */
	public boolean isEmpty();
	
	/**
	 * Check if no more objects can be added to the stack
	 * @return true if no more objects can be added to the stack, false otherwise
	 */
	public boolean isFull();
	
	/**
	 * Number of objects in the stack
	 * @return number of objects in the stack
	 */
	public int size();
	
	/**
	 * Revert the stack to an empty state
	 */
	public void makeEmpty();
}
