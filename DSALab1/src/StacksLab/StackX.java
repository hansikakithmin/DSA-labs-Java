package StacksLab;

public class StackX {
private int maxSize;
private char[] stackArray;
private int top;

public StackX(int s)//constructor
{
	maxSize=s;
	stackArray=new char[maxSize];
	top=-1;
}

public void push(char j)//to insert item to the stack
{
	if(top==(maxSize-1))
		System.out.println("Stack is full");
	else
	{
		stackArray[++top]=j;
	}
		
}
public char pop()//to remove items from stack
{
		return stackArray[top--];
}
public char peek()//to access top items in the stack
{
	return stackArray[top];
}
public boolean isEmpty()//check whether stack is empty
{
	if(top==-1)
		return true;
	else
		return false;
}
public boolean isFull()//check whether stack is full
{
	if(top==maxSize-1)
		return true;
	else
		return false;
}
}
