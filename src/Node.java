public class Node<T extends Comparable<T>> {

    public Node leftChild;
    public Node rightChild;
    public T data;

    public Node(T data) {
        this.data = data;
        leftChild = null;
        rightChild = null;
    }

    public T getData() {
        return data;
    }


}
