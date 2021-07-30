class BinaryTree {
    Node root;

    BinaryTree() {
        root = null;
    }

    // In-order
    void printInorder(Node node) {
        if (node == null)
            return;

        /* first recur on left child */
        printInorder(node.left);

        /* then print the data of node */
        System.out.print(node.key + " ");

        /* now recur on right child */
        printInorder(node.right);
    }

    // Pre-order
    void printPreorder(Node node) {
        if (node == null)
            return;

        /* first print data of node */
        System.out.print(node.key + " ");

        /* then recur on left subtree */
        printPreorder(node.left);

        /* now recur on right subtree */
        printPreorder(node.right);
    }

    // Post-order
    void printPostorder(Node node) {
        if (node == null)
            return;

        // first recur on left subtree
        printPostorder(node.left);

        // then recur on right subtree
        printPostorder(node.right);

        // now deal with the node
        System.out.print(node.key + " ");
    }

    // Wrappers over above recursive functions
    void printPostorder() {
        printPostorder(root);
        System.out.println("\n");
    }

    void printInorder() {
        printInorder(root);
        System.out.println("\n");
    }

    void printPreorder() {
        printPreorder(root);
        System.out.println("\n");
    }

    public static void main(String[] args)
    {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("In-order traversal:" );
        tree.printInorder();

        System.out.println("Preorder traversal: ");
        tree.printPreorder();

        System.out.println("Postorder traversal: ");
        tree.printPostorder();
    }
}