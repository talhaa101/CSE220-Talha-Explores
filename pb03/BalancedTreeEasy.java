package pb03;

public class BalancedTreeEasy {

    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
            left = right = null;
        }
    }

    // height বের করার function
    public static int height(TreeNode root) {
        if (root == null) return 0;

        int left = height(root.left);
        int right = height(root.right);

        return Math.max(left, right) + 1;
    }

    // balanced check
    public static boolean isBalanced(TreeNode root) {
        if (root == null) return true;

        int left = height(root.left);
        int right = height(root.right);

        // difference check
        if (Math.abs(left - right) > 1) {
            return false;
        }

        // recursive check
        return isBalanced(root.left) && isBalanced(root.right);
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);

        if (isBalanced(root)) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}