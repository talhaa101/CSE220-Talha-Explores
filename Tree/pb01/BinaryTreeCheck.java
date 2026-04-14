class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
        left = right = null;
    }
}

public class BinaryTreeCheck {

    public static boolean isIdentical(TreeNode t1, TreeNode t2) {

        // Step 1: both null
        if (t1 == null && t2 == null) {
            return true;
        }

        // Step 2: one null
        if (t1 == null || t2 == null) {
            return false;
        }

        // Step 3: value check
        if (t1.val != t2.val) {
            return false;
        }

        // Step 4: recursive check
        return isIdentical(t1.left, t2.left) &&
               isIdentical(t1.right, t2.right);
    }

    public static void main(String[] args) {

        // Tree 1
        TreeNode t1 = new TreeNode(1);
        t1.left = new TreeNode(2);
        t1.right = new TreeNode(3);

        // Tree 2
        TreeNode t2 = new TreeNode(1);
        t2.left = new TreeNode(3);
        t2.right = new TreeNode(3);

        if (isIdentical(t1, t2)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}