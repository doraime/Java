
public class challenge1 {
    public static void main(String[] args){
        BST <Integer> tree = new BST<>();
        tree.insert(50);
        tree.insert(30);
        tree.insert(70);
        tree.insert(20);
        tree.insert(40);
        tree.insert(60);
        tree.insert(80);
        System.out.print("Size of the tree: ");
        System.out.println(tree.size());
        System.out.println(tree.search(60));
        System.out.println(tree.search(25));
        System.out.print("inorder: ");
        tree.inorder();
        System.out.print("\n");
        System.out.print("postorder: ");
        tree.postorder();
        System.out.print("\n");
        System.out.print("preorder: ");
        tree.preorder();
        System.out.print("\n");
        tree.path(60);
        tree.insert(65);
        System.out.print("Size of the tree after inserting 65: ");
        System.out.println(tree.size());
    }
}
