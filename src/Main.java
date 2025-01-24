public class Main {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();

        tree.insert(3);
        tree.insert(5);
        tree.insert(4);
        tree.insert(6);

        System.out.println(tree.remove(6));

        System.out.println(tree);

    }

}