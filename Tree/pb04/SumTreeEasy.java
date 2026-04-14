package pb04;

public class SumTreeEasy {

    static class Node {
        int val;
        Node left, right;

        Node(int val) {
            this.val = val;
        }
    }

    public static boolean check(Node root) {

        // যদি empty বা leaf হয় → true
        if (root == null || (root.left == null && root.right == null)) {
            return true;
        }

        // left child value
        int left = 0;
        if (root.left != null) {
            left = root.left.val;
        }

        // right child value
        int right = 0;
        if (root.right != null) {
            right = root.right.val;
        }

        // condition check + recursive call
        return (root.val == left + right)
                && check(root.left)
                && check(root.right);
    }

    public static void main(String[] args) {

        Node root = new Node(10);
        root.left = new Node(10);

        if (check(root)) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}