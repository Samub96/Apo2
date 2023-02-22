package model;

public class Node {
	
	 private int name;
	    private Node next;
	    private Node previous;
	    private Node turno;
	    private int pasar;

	    public Node(int name) {
	        this.name = name;
	        this.pasar = 0;
	    }

	    public int getName() {
	        return name;
	    }

	    public void setName(int name) {
	        this.name = name;
	    }

	    public Node getNext() {
	        return next;
	    }

	    public void setNext(Node next) {
	        this.next = next;
	    }

	    public Node getPrevious() {
	        return previous;
	    }

	    public void setPrevious(Node previous) {
	        this.previous = previous;
	    }

	    public Node getTurno() {
	        return turno;
	    }

	    public void setTurno(Node turno){
	        this.turno = turno;
	    }

	    public int getPasar() {
	        return pasar;
	    }

	    public void setPasar(int pasar) {
	        this.pasar = pasar;
	    }
	    
	   
}
