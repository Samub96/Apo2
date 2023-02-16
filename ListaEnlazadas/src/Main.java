public class Main {
    static private SimpleLinkedList simpleLinkedList ;
    public static void main(String[] args) {

        simpleLinkedList = new SimpleLinkedList();

        simpleLinkedList.addNodeAtEnd(simpleLinkedList.getRoot(), 1);
        simpleLinkedList.addNodeAtEnd(simpleLinkedList.getRoot(), 2);
        simpleLinkedList.addNodeAtEnd(simpleLinkedList.getRoot(), 3);
        simpleLinkedList.addNodeAtEnd(simpleLinkedList.getRoot(), 4);
        simpleLinkedList.deleteNode(simpleLinkedList.getRoot(), 4);
        simpleLinkedList.getList(simpleLinkedList.getRoot());
    }
}