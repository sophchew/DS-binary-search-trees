public class Main {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();

        tree.insert(3);
        tree.insert(10);
        tree.insert(4);
        tree.insert(6);
        tree.insert(9);
        tree.insert(0);
        tree.insert(1);



        System.out.println(tree.getSize());

        System.out.println(tree);

    }

}