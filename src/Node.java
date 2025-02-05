public class Node<T extends Comparable<T>> {

    public Node leftChild;
    public Node rightChild;
    public T data;

    public Node(T data) {
        this.data = data;
        leftChild = null;
        rightChild = null;
        BinarySearchTree.hashmap.put("" + data, this);
    }

    public T getData() {
        return data;
    }


}
