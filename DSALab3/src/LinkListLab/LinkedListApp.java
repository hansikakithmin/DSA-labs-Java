package LinkListLab;

public class LinkedListApp {

	public static void main(String[] args) {
       LinkedList studentList=new LinkedList();
       studentList.insertFirst("Prashani",69.5);
       studentList.insertFirst("Aravinda",78.0);
       studentList.insertFirst("Nipuna",53.5);

       studentList.displayList();
       
       studentList.deleteLink("Aravinda");
       System.out.println("Deleted");
	}

}
