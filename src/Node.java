public class Node<E extends Comparable<E>> {

    public Node leftChild;
    public Node rightChild;
    public E data;

    public Node(E data) {
        this.data = data;
        leftChild = null;
        rightChild = null;
    }


}
