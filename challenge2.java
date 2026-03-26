public class challenge2{
    public static void main(String[] args){
        BST<Integer> tree = new BST<>();
        tree.insert(50);
        tree.insert(30);
        tree.insert(70);
        tree.insert(20);
        tree.insert(40);
        tree.insert(60);
        tree.insert(80);
        tree.insert(25);
        tree.insert(65);
        tree.delete(20);
        tree.delete(70);
        tree.search(60);
        tree.search(90);
        System.out.println("Size of the tree: " + tree.size());
        System.out.print("Inorder traversal: ");
        tree.inorder();
        System.out.print("\nPreorder traversal: ");
        tree.preorder();
        System.out.print("\nPostorder traversal: ");
        tree.postorder();
    }
}