package Trees;
public class Node {
	public int EmpNo;
	public String name;
	public Node leftchild;
	public Node rightchild;
	
    public void displayNode() {
    	System.out.print("{");
    	System.out.print(EmpNo);
    	System.out.print(",");
    	System.out.print("name");
    	System.out.println("}");
    }
    
}
