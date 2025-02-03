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
        Node replacingNode = removedNode.leftChild;
        if(removedNode.leftChild == null && removedNode.rightChild != null) {
            replacingNode = removedNode.rightChild;
        }
        replacingNode = removedNode.leftChild;
        Node prevNode = removedNode;
        boolean nodeReached = false;

        if(replacingNode == null) {

        }
        while(!nodeReached){
            if(replacingNode.rightChild != null) {
                prevNode = replacingNode;
                replacingNode = replacingNode.rightChild;
            } else {
                nodeReached = true;
            }
        }

        removedNode.data = replacingNode.data;
        prevNode.rightChild = null;

    }

    /**
     * Search for a value in the BST
     * @param value The value to search for
     * @return true if value exists in the tree, false otherwise
     */
    public boolean contains(T value) {
        // Implement search logic
        if(rootNode == null) {
            return false;
        } else if(rootNode.data.compareTo(value) == 0) {
            return true;
        }
        Node currentNode = rootNode;
        boolean nodeExists  = true;

        while(nodeExists) {
            if(currentNode.data.compareTo(value) > 0) { //  if current data is greater than wanted data, go left
                if(currentNode.leftChild == null) { // not found if value is less than current
                    nodeExists = false;
                } else {
                    if(currentNode.leftChild.data.compareTo(value) == 0) {
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
                        return true;
                    } else {
                        currentNode = currentNode.rightChild;
                    }
                }
            }
        }

        return false;
    }

    /**
     * Get the minimum value in the BST
     * @return The minimum value, or null if tree is empty
     */
    public T getMin() {
        // Implement getMin logic
        if(rootNode == null) {
            return null;
        }
        Node currentNode = rootNode;
        while(currentNode.leftChild != null) {
            currentNode = currentNode.leftChild;
        }

        return (T) currentNode.data;
    }

    /**
     * Get the maximum value in the BST
     * @return The maximum value, or null if tree is empty
     */
    public T getMax() {
        // TODO: Implement getMax logic
        if(rootNode == null) {
            return null;
        }
        Node currentNode = rootNode;
        while(currentNode.rightChild != null) {
            currentNode = currentNode.rightChild;
        }

        return (T) currentNode.data;
    }

    /**
     * Perform an inorder traversal of the BST
     * @return A list containing the values in inorder
     */
    public List<T> inorderTraversal() { // LCR
        List<T> result = new ArrayList<>();
        // Implement inorder traversal

        if(rootNode == null) {
            return null;
        }

        inorderRecursion(rootNode, result);

        return result;
    }

    private void inorderRecursion(Node node, List<T> result) {
        // Check left node
        if(node.leftChild != null) {
            inorderRecursion(node.leftChild, result);
        }
        result.add((T)node.data); // Add current node

        //Check right node
        if(node.rightChild != null) {
            inorderRecursion(node.rightChild, result);
        }
    }

    /**
     * Perform a preorder traversal of the BST
     * @return A list containing the values in preorder
     */
    public List<T> preorderTraversal() { // CLR
        List<T> result = new ArrayList<>();
        // Implement preorder traversal

        if(rootNode == null) {
            return null;
        }
        preorderRecursion(rootNode, result);

        return result;
    }

    private void preorderRecursion(Node node, List<T> result) {

        result.add((T)node.data); // Add current node
        // Check left node
        if(node.leftChild != null) {
            preorderRecursion(node.leftChild, result);
        }
        //Check right node
        if(node.rightChild != null) {
            preorderRecursion(node.rightChild, result);
        }
    }


    /**
     * Perform a postorder traversal of the BST
     * @return A list containing the values in postorder
     */
    public List<T> postorderTraversal() { // LRC
        List<T> result = new ArrayList<>();
        // Implement postorder traversal
        if(rootNode == null) {
            return null;
        }
        postorderRecursion(rootNode, result);

        return result;
    }

    private void postorderRecursion(Node node, List<T> result) {

        // Check left node
        if(node.leftChild != null) {
            postorderRecursion(node.leftChild, result);
        }
        //Check right node
        if(node.rightChild != null) {
            postorderRecursion(node.rightChild, result);
        }

        result.add((T) node.data); // Add current node
    }

    /**
     * Get the height of the BST
     * @return The height of the tree (-1 for empty tree)
     */
    public int getHeight() {
        // TODO: Implement height calculation
        if(rootNode == null){
            return -1;
        }


        return heightRecursion(0, 1, rootNode);
    }

    private int heightRecursion(int count, int maxHeightFound, Node node) {
        int newMaxHeight = maxHeightFound;
        if(node.rightChild == null && node.leftChild == null) {
            if(count > maxHeightFound) {
                newMaxHeight = count;
            }
        }
        if(node.leftChild != null) {
            heightRecursion(count+1, maxHeightFound, node.leftChild);
        }
        if(node.rightChild != null){
            heightRecursion(count+1, maxHeightFound, node.rightChild);
        }

        return newMaxHeight;

    }

    /**
     * Get the size (number of nodes) in the BST
     * @return The total number of nodes
     */
    public int getSize() {
        // TODO: Implement size calculation

        return sizeRecursion(rootNode);
    }

    public int sizeRecursion(Node node){
        if(node.rightChild == null && node.leftChild == null){
            return 1;
        }
        int count = 1;

        if(node.leftChild != null) {
            count += sizeRecursion(node.leftChild);
        }
        if(node.rightChild != null) {
            count += sizeRecursion(node.rightChild);
        }

        return count;





    }

    /**
     * Check if the BST is empty
     * @return true if the tree has no nodes, false otherwise
     */
    public boolean isEmpty() {
      return rootNode == null;
    }

    /**
     * Clear all nodes from the BST
     */
    public void clear() {
        rootNode = null;

    }

    //Should return true if adheres to BST rules, false if otherwise
    public boolean isValidBST() {
        return false;

    }

}
