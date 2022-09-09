package LinkListLab;

public class DemoLink {

	public static void main(String[] args) {
        Link Nipuna=new Link("Nipuna",53.5);
        Link Aravinda=new Link("Aravinda",78);
        Link Prashani=new Link("Prashani",69.5);

		Nipuna.next=Aravinda;
		Aravinda.next=Prashani;
		Prashani.next=null;

        Nipuna.displayLink();
        Aravinda.displayLink();
        Prashani.displayLink();

	}

}
