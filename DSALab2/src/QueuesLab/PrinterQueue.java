package QueuesLab;
import java.util.Scanner;
public class PrinterQueue {
    
	private static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		QueueX mainQueue=new QueueX(5);
		
		
		int transID;
		int id;
		for(int i=0;i<5;i++) {
			System.out.println("Enter Transaction ID:");
			transID=sc.nextInt();
			mainQueue.insert( transID);
		}
		
		QueueX evenQueue=new QueueX(5);
		QueueX oddQueue=new QueueX(5);
		
		while(!mainQueue.isEmpty())
		{
			id=mainQueue.remove();
			if(id%2==0) {
				evenQueue.insert(id);
			}
			else {
				oddQueue.insert(id);
			}
		}
		System.out.println("Transaction sent to PC1");
		while(!evenQueue.isEmpty())
		{
			System.out.println(evenQueue.remove());
		}
		
		System.out.println("Transaction sent to PC2");
		while(!oddQueue.isEmpty())
		{
			System.out.println(oddQueue.remove());
		}
		
	}

}
