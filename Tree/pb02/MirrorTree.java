package pb02;

public class MirrorTree {

    // Node class (same file এর ভিতরে)
    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
            left = right = null;
        }
    }

    // Mirror function
    public static void mirror(TreeNode root) {
        if (root == null) return;

        // swap
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        mirror(root.left);
        mirror(root.right);
    }

    // Inorder traversal
    public static void inorder(TreeNode root) {
        if (root == null) return;

        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {

        // Tree create
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(20);
        root.right = new TreeNode(30);
        root.left.left = new TreeNode(40);
        root.left.right = new TreeNode(60);

        // Mirror convert
        mirror(root);

        // Output
        inorder(root);   // Expected: 30 10 60 20 40
    }
}