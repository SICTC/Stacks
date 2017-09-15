//implementation of a stack, using an array
//note: an array has a defined size, so the stack will have a max size
public class StackArray implements Stack
{
	private Object [] data;
	private int top;
	
	public StackArray(int maxSize)
	{
		data = new Object[maxSize];
		top = -1;
	}
	
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
	
	public Object pop()
	{
		return (isEmpty())? null : data[top--];
	}
	
	public Object peek()
	{
		return (isEmpty())? null : data[top];
	}
	
	public boolean isEmpty()
	{
		return top<0;
	}
	
	public boolean isFull()
	{
		return top >= data.length - 1;
	}
	
	public int size()
	{
		return top + 1;
	}
	
	public void makeEmpty()
	{
		top = -1;
	}
	
	public int maxSize()
	{
		return data.length;
	}
}
