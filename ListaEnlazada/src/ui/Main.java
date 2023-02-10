package ui;

public class Main {
	
	static private SimpleLinkedList simpleLinkedList ;

	public static void main(String[] args) {
		
		 simpleLinkedList = new SimpleLinkedList();
		 
		  Node root = simpleLinkedList.getRoot();

	        simpleLinkedList.getList(simpleLinkedList.getRoot());

	        simpleLinkedList.addNodeAtEnd(root, 1);
	        simpleLinkedList.addNodeAtEnd(root, 2);
	        simpleLinkedList.addNodeAtEnd(root, 2);
	        simpleLinkedList.addNodeAfter(root,15, 20);


	        simpleLinkedList.getList(simpleLinkedList.getRoot());

	}

}
