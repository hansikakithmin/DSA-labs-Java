package QueuesLab;

public class QueueX {
private int[] queueArray;
private int maxSize;
private int rear;
private int front;
private int noItems;

public QueueX(int s) {
	maxSize=s;
	queueArray=new int[maxSize];
	rear=-1;
	front=0;
	noItems=0;
}

public void insert(int j) {
	if(rear==(maxSize-1))
		System.out.println("Queue is full");
	else {
		queueArray[++rear]=j;
		noItems++;
	}
}
public int remove(){
	if(noItems==0){
		System.out.println("Queue is Empty");
		return -99;
	}
	else {
		noItems--;
		return queueArray[front++];
		
	}
}

public int peekFront() {
	if(noItems==0) {
		System.out.println("Queue is empty");
		return -99;
	}
	else {
		return queueArray[front];
	}
}

public boolean isEmpty() {
	if(noItems==0)
		return true;
	else
		return false;
}

public boolean isFull() {
	if(rear==maxSize-1)
		return true;
	else
		return false;
}
}

