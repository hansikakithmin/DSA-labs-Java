package StacksLab;

public class TestStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        StackX theStack=new StackX(5);
        theStack.push('A');
        theStack.push('B');
        theStack.push('C');
        theStack.push('D');
        
        while(!theStack.isEmpty())
        {
        	char val=theStack.pop();
        	System.out.println(val);
        	System.out.println("");
        }
	}

}
