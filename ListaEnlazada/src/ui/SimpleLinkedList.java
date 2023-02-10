package ui;

public class SimpleLinkedList {
	private Node root;

	public SimpleLinkedList() {
		
		this.root = null;
	}
	
	public Node addNodeAtEnd(Node pointer, int value) {
		
		Node node = new Node( value); //parametro null = next , value = valor
		
		if (pointer == null) {
			
			if(root == null) { 
				
				root = node;
			}
			return node;
			
		} else {
			
			pointer.setNext(addNodeAtEnd(pointer.getNext(),value) );
		}
		return pointer;
	}

	public Node getRoot() {
		return root;
		
	}
	
	public  void addNodeAfter(Node pointer, int value, int targetValue) {
		
		if(pointer != null) {
			
			if (pointer.getValue() == targetValue){
				
				Node node = new Node( value);
				
				node.setNext(pointer.getNext());
				pointer.setNext(node);
				
				
			}else {
				addNodeAfter(pointer.getNext(), value, targetValue);
			} 
			
		}
		
		
	}
	public void deleteNode (Node pointer,int value, int target) {
		
		if (pointer != null) {
			
			if (pointer.getNext().getValue() == target) {
				
				
			}
			
		}
	}
	
	
	public void getList(Node pointer){
        if(pointer!=null){
            if(pointer.getNext()==null){ // caso base: es el ultimo nodo
                System.out.println(pointer.getValue());
            } else {
                System.out.println(pointer.getValue());
                getList(pointer.getNext());
            }
        }

    }
	
}
