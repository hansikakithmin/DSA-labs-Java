package Trees;

import java.util.Scanner;

public class TreeTest {

	public static void main(String[] args) {
           Tree tree=new Tree();
           tree.insert(149,"Anusha");
           tree.insert(167,"Kosala");
           tree.insert(47,"Dinusha");
           tree.insert(66,"Mihiri");
           tree.insert(159,"Jayani");
           tree.insert(118,"Nimal");
           tree.insert(195,"Nishantha");
           tree.insert(34,"Avodya");
           tree.insert(105,"Bimali");
           tree.insert(133,"Sampath");

           tree.inOrder();
           System.out.println("--------------------------");
           tree.preOrder();
           System.out.println("--------------------------");
           tree.postOrder();
           System.out.println("--------------------------");
           
           System.out.println("Enter employee details");
           Scanner sc = new Scanner(System.in);
           int empID=sc.nextInt();
           String nameOfEmployee=tree.find(empID).name;
           System.out.println("Name of Employee is:");
           System.out.println(nameOfEmployee);
           
           tree.deleteAll();
           System.out.println("Tree is Deleted");
           tree.inOrder();
	}

}
