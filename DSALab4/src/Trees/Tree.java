package Trees;

public class Tree {
	private Node root;
	
	public Tree() {
		root=null;
	}
	
    public Node find(int emp) {
    	Node current=root;
    	while(current.EmpNo!=0) {
    		if(emp<current.EmpNo)
    			current=current.leftchild;
    		else
    			current=current.rightchild;
    		
    		if(current == null)
    			return null;
    	}
    	return current;
    }
    public void insert(int empNo,String Name) {
    	Node newNode=new Node();
    	newNode.EmpNo=empNo;
    	newNode.name=Name;
    	if(root==null)
    		root=newNode;
    	else {
    		Node current=root;
    		Node parent;
    		while(true) {
    			parent=current;
    			if(empNo<current.EmpNo)
    			{
    				current=current.leftchild;
    				if(current==null) {
    					parent.leftchild=newNode;
    					return;
    				}
    			}
    			else
    			{
    				current=current.rightchild;
    				if(current==null)
    				{
    					parent.rightchild=newNode;
    					return;
    				}
    			}
    		}
    	}
    }
    
    private void inOrder(Node localRoot) {
    	if(localRoot!=null)
    	{
    		inOrder(localRoot.leftchild);
    		localRoot.displayNode();
    		inOrder(localRoot.rightchild);
    	}
    }
    void inOrder() {
    	inOrder(root);
    }
    
    private void preOrder(Node localRoot) {
    	if(localRoot!=null)
    	{
    		localRoot.displayNode();
    		inOrder(localRoot.leftchild);
    		inOrder(localRoot.rightchild);
    	}
    }
    void preOrder() {
    	preOrder(root);
    }
    
    private void postOrder(Node localRoot) {
    	if(localRoot!=null)
    	{
    		inOrder(localRoot.leftchild);
    		inOrder(localRoot.rightchild);
    		localRoot.displayNode();
    	}
    }
    void postOrder() {
    	postOrder(root);
    }
    
    public Node findRecursive(int key,Node cur) {
    	if(cur==null)
    		return cur;
    	else if(key==cur.EmpNo)
    		return cur;
    	else if(key<cur.EmpNo)
    		return findRecursive(key,cur.leftchild);
    	else
    		return findRecursive(key,cur.rightchild);
    }
    
    private void deleteAll(Node localroot)
    {
    	root=null;
    }
    public void deleteAll() {
    	deleteAll(root);
    }

}
