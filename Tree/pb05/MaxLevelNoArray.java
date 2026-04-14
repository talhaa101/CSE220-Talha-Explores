package pb05;

public class MaxLevelNoArray {

    static class Node {
        int val;
        Node left, right;

        Node(int val) {
            this.val = val;
        }
    }

    // height function
    public static int height(Node root) {
        if (root == null) return 0;

        int left = height(root.left);
        int right = height(root.right);

        return Math.max(left, right) + 1;
    }

    // specific level এর max
    public static int getMax(Node root, int level) {
        if (root == null) return Integer.MIN_VALUE;

        if (level == 0) {
            return root.val;
        }

        int left = getMax(root.left, level - 1);
        int right = getMax(root.right, level - 1);

        return Math.max(left, right);
    }

    public static void main(String[] args) {

        Node root = new Node(4);
        root.left = new Node(9);
        root.right = new Node(2);
        root.left.left = new Node(3);
        root.left.right = new Node(5);
        root.right.right = new Node(7);

        int h = height(root);

        for (int i = 0; i < h; i++) {
            System.out.print(getMax(root, i) + " ");
        }
    }
}
