import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();

        tree.insert(3);
        tree.insert(10);
        tree.insert(4);
        tree.insert(5);
        tree.insert(0);
        tree.insert(1);

    //    BinarySearchTree.hashmap.get("3").data = 11;



        System.out.println(tree.isEmpty());

        System.out.println(tree);

    }

}