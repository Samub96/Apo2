package model;

public class Arbol {
private Node root;

    public void addNode(String[] array) {

        if(root == null){

            root = new Node((array.length/2)-1);
            addNode(array);

        }else {

            Node newnode = new Node(array.length);

            addNode(root, newnode);
        }

    }

    private void addNode(Node pointer, Node newNode){
       //desplazar izquierda
        if (newNode.getValue() < pointer.getValue()){
            if (pointer.getLeft() == null){
                pointer.setLeft(newNode);

            }else{
                addNode(pointer.getLeft(),newNode);

            }

        }else{
            //despalzar derecha
            if (pointer.getRight() == null){
                pointer.setRight(newNode);

            }else{

                addNode(pointer.getRight(),newNode);
            }
        }

    }
    private void printTreeOrder(Node pointer){
        if(pointer != null){
            printTreeOrder(pointer.getLeft());
            System.out.println(pointer.getValue());
            printTreeOrder(pointer.getRight());
        }

    }
    public void printTreeOrder(){
        printTreeOrder(root);
        System.out.println();

    }
    private void printTreeReverse(Node pointer){
        if(pointer != null){
            printTreeOrder(pointer.getRight());
            System.out.println(pointer.getValue());
            printTreeOrder(pointer.getLeft());
        }

    }
    public void printTreeReverse(){
        printTreeOrder(root);
        System.out.println();

    }

}
