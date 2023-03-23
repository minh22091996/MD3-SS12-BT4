public class Main {
    public static void main(String[] args) {
        public void preorderTraversal(Node root) {
            if (root != null) {
                System.out.print(root.value + " "); // duyệt nút gốc
                preorderTraversal(root.left); // duyệt cây con trái
                preorderTraversal(root.right); // duyệt cây con phải
            }
        }
        BinarySearchTree bst = new BinarySearchTree();
// ... khởi tạo cây bst ...
        bst.preorderTraversal(bst.root);

    }
}