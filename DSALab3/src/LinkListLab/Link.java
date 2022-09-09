package LinkListLab;

public class Link {
	public String name;
	public double average;
	public Link next;
	
	public Link(String nm,double avg)
	{
		name = nm;
		average = avg;
	}
	
	public void displayLink() {
		System.out.println("name");
		System.out.println("average");
		
	}

}
