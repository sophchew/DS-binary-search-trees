import java.util.ArrayList;
import java.util.List;

public class BinarySearchTree<T extends Comparable<T>> {

    private Node<T> rootNode;

    public BinarySearchTree() {
        rootNode = null;
    }


    /**
     * Insert a new value into the BST
     * @param value The value to insert
     */
    public void insert(T value) {
        // Implement insertion logic
        if(rootNode == null) {
            rootNode = new Node(value);
        } else {
            boolean nodeReached = false;
            Node currentNode = rootNode;
            while(!nodeReached) {
                if(value.compareTo((T) currentNode.data) > 0) { // if value is greater than node value
                    if(currentNode.rightChild == null) {
                        currentNode.rightChild = new Node(value);
                        nodeReached = true;
                    } else {
                        currentNode = currentNode.rightChild;
                    }

                } else if(value.compareTo((T) currentNode.data) < 0) { // if value is less than node value
                    if(currentNode.leftChild == null) {
                        currentNode.leftChild = new Node(value);
                        nodeReached = true;
                    } else {
                        currentNode = currentNode.leftChild;
                    }
                }
            }
            // Ignore if values are equal
        }
    }

    /**
     * Remove a value from the BST
     * @param value The value to remove
     * @return true if value was found and removed, false otherwise
     */
    public boolean remove(T value) {
        // TODO: Implement removal logic
        if(rootNode == null) {
            return false;
        } else if(rootNode.data.compareTo(value) == 0) {
            rootNode = null;
            return true;
        }
        Node currentNode = rootNode;
        boolean nodeExists  = true;

        while(nodeExists) {
            if(currentNode.data.compareTo(value) > 0) { //  if current data is greater than want to remove data, go left
                if(currentNode.leftChild == null) { // not found if value is less than current
                    nodeExists = false;
                } else {
                    if(currentNode.leftChild.data.compareTo(value) == 0) {
                       // remove logic
                        reorder(currentNode.leftChild);
                        return true;
                    } else {
                        currentNode = currentNode.leftChild;
                    }
                }
            } else {
                if(currentNode.rightChild == null) { // not found if value is greater than current
                    nodeExists = false;
                } else {
                    if(currentNode.rightChild.data.compareTo(value) == 0){
                       //remove logic
                        reorder(currentNode.rightChild);
                        return true;
                    } else {
                        currentNode = currentNode.rightChild;
                    }
                }
            }
        }

        return false;
    }

    private void reorder(Node removedNode) {
        Node replacingNode = null;
        // go right and find next smallest value


    }

    /**
     * Search for a value in the BST
     * @param value The value to search for
     * @return true if value exists in the tree, false otherwise
     */
    public boolean contains(T value) {
        // TODO: Implement search logic

        return false;
    }

    /**
     * Get the minimum value in the BST
     * @return The minimum value, or null if tree is empty
     */
    public T getMin() {
        // TODO: Implement getMin logic
        return null;
    }

    /**
     * Get the maximum value in the BST
     * @return The maximum value, or null if tree is empty
     */
    public T getMax() {
        // TODO: Implement getMax logic
        return null;
    }

    /**
     * Perform an inorder traversal of the BST
     * @return A list containing the values in inorder
     */
    public List<T> inorderTraversal() {
        List<T> result = new ArrayList<>();
        // TODO: Implement inorder traversal
        return result;
    }

    /**
     * Perform a preorder traversal of the BST
     * @return A list containing the values in preorder
     */
    public List<T> preorderTraversal() {
        List<T> result = new ArrayList<>();
        // TODO: Implement preorder traversal
        return result;
    }

    /**
     * Perform a postorder traversal of the BST
     * @return A list containing the values in postorder
     */
    public List<T> postorderTraversal() {
        List<T> result = new ArrayList<>();
        // TODO: Implement postorder traversal
        return result;
    }

    /**
     * Get the height of the BST
     * @return The height of the tree (-1 for empty tree)
     */
    public int getHeight() {
        // TODO: Implement height calculation
        return -1;
    }

    /**
     * Get the size (number of nodes) in the BST
     * @return The total number of nodes
     */
    public int getSize() {
        // TODO: Implement size calculation
        return 0;
    }

    /**
     * Check if the BST is empty
     * @return true if the tree has no nodes, false otherwise
     */
    public boolean isEmpty() {
      return false;
    }

    /**
     * Clear all nodes from the BST
     */
    public void clear() {

    }

    //Should return true if adheres to BST rules, false if otherwise
    public boolean isValidBST() {
        return false;
    }

}
