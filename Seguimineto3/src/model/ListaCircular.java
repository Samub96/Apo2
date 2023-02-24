package model;



public class ListaCircular {
	 private Node head;
	    private Node turno;
	    private Node tail;

	    public void addNode(){
	        if (head == null){
	            addNode(new Node (1));
	        }
	        addNode(new Node(head.getPrevious().getName()+1));
	    }

	    private void addNode(Node pointer){

	        if(head == null){
	            head = pointer;
	            head.setNext(head);
	            head.setPrevious(head);
	            turno = head;
	        }else{
	            Node tail = head.getPrevious();
	            pointer.setNext(head);
	            head.setPrevious(pointer);
	            tail.setNext(pointer);
	            pointer.setPrevious(tail);
	        }
	    }

	    public String printActual(){ 
	        if (head == null){
	            return "No se han registrado turnos";
	        }
	        else{
	            if (turno == head){
	                return "Turno actual: " + head.getName();
	            }
	            else {
	                return printActual(head);
	            }
	        }
	    }

	    private String printActual(Node pointer){
	        String msg;
	        if(pointer == turno){
	            msg = "Turno actual: " + pointer.getName();
	            return msg;
	        }
	        return printActual(pointer.getNext());
	    }

	    public String pasarTurno(){
	        return pasarTurno(turno);
	    }

	    private String pasarTurno(Node current){
	        if(head == null) {
	            return "No se han registrado turnos";
	        }

	        turno.setPasar(turno.getPasar()+1);
	        if (turno.getPasar() == 3){
	            delete();
	        }
	        turno = current.getNext();
	        return "Paso a el siguiente turno";
	    }

	    public String delete(){
	        if(head == null){
	            return "Lista vacia";
	        }
	        else if(head == head.getNext()){
	            head = null;
	            return "Único elemento de la lista eliminado";
	        }
	        else if (turno == head){
	            head.getPrevious().setNext(head.getNext());
	            head.getNext().setPrevious(head.getPrevious());
	            turno = head.getNext();
	            head = head.getNext();
	            return "El turno ha sido eliminado";
	        }
	        else if (turno == tail){
	            Node temp = tail;
	            tail = tail.getPrevious();
	            head.setPrevious(tail);
	            tail.setNext(head);
	            temp.setNext(null);
	            temp.setPrevious(null);
	            return "El turno ha sido eliminado";
	        }
	        else {
	            turno.getNext().setPrevious(turno.getPrevious());
	            turno.getPrevious().setNext(turno.getNext());
	            turno = turno.getNext();
	            return "El turno ha sido eliminado";
	        }
	    }
}
