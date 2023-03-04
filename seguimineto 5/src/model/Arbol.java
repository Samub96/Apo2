package model;



public class Arbol {
    private Node root;


    public void  addNode(String[] array){
        if(root == null){

            root = new Node((array.length/2)-1);

        }else{

            Node newNode = new Node(array.length);
            addNode(root, newNode);

        }




    }
    private void addNode(Node pointer, Node newNode){

    //desplazar izquierda
        if(newNode.getValue() < pointer.getValue()){
            if(pointer.getLeft() == null){
                pointer.setLeft(newNode);
            }else {
                addNode(pointer.getLeft(),newNode);
            }
        }else{
            //desplazar a la derecha
            if(pointer.getRight() == null){
                pointer.setRight(newNode);
            }else{
                addNode(pointer, newNode);
            }
        }

    }

}
