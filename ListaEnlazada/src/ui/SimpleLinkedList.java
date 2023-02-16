package ui;

public class SimpleLinkedList {
	private Node root;

    public SimpleLinkedList() {
        this.root = null;
    }

    public void addNodeAtEnd(Node pointer, int value){
        Node node = new Node( value);
        if(root==null){ // caso base, lista vacía
            root=node;
        }
        else if(pointer.getNext()==null){ // caso base, se encontro el ultimo
            pointer.setNext(node);
        } else { // se sigue buscando el ultimo recursivamente
            addNodeAtEnd(pointer.getNext(), value);
        }
    }

    public void addNodeAfterTarget(Node pointer, int value, int targetValue) {
        if(pointer!=null) { // caso base, lista vacía o no se encontro el target
        	
            if(pointer.getValue()==targetValue){ // se encontro el target
                Node node = new Node( value);
                node.setNext(pointer.getNext());
                pointer.setNext(node);
                
            } else { // se sigue buscando el target recursivamente
                addNodeAfterTarget(pointer.getNext(), value, targetValue);
                
            }
        }
    }

    public void deleteNode(Node pointer, int value){
    	
        if(pointer!=null) { // caso base, lista vacía o no se encontro el target
            if (root.getValue() == value) { // caso en el que el target es el root
            	
            	
                root = pointer.getNext();
                
            } else if (pointer.getNext() != null) {
            	
                if (pointer.getNext().getValue() == value) { // se encontro el target en el siguiente
                	System.out.println("nodo borrado = " + value);
                    pointer.setNext(pointer.getNext().getNext());
                    
                } else { // se sigue buscando el target recursivamente
                    deleteNode(pointer.getNext(), value);
                }
            }
        }

    }


    public void getList(Node pointer){
        if(pointer!=null){
            if(pointer.getNext()==null){ // caso base: es el ultimo nodo
                System.out.println("nodo = " +pointer.getValue());
            } else {
                System.out.println("nodo = " + pointer.getValue());
                getList(pointer.getNext());
            }
        }

    }

    public Node getRoot() {
        return root;
    }

}
