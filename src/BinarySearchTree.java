import java.util.ArrayList;
import java.util.List;

public class BinarySearchTree<T extends Comparable<T>> {


    /**
     * Insert a new value into the BST
     * @param value The value to insert
     */
    public void insert(T value) {
        // TODO: Implement insertion logic
    }

    /**
     * Remove a value from the BST
     * @param value The value to remove
     * @return true if value was found and removed, false otherwise
     */
    public boolean remove(T value) {
        // TODO: Implement removal logic
        return false;
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
