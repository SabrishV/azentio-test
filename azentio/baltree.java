public class baltree {
    static class Node {
        int val;
        Node left, right;

        Node(int val) {
            this.val = val;
        }
    }

    public boolean isBalanced(Node root) {
        return h(root) != -1;
    }

    private int h(Node n) {
        if (n == null) return 0;
        int l = h(n.left);
        int r = h(n.right);
        if (l == -1 || r == -1 || Math.abs(l - r) > 1) return -1;
        return 1 + Math.max(l, r);
    }

    public static void main(String[] args) {
        baltree tree = new baltree();
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.left.left = new Node(6); // Unbalanced tree

        System.out.println("tree balanced?: " + tree.isBalanced(root));
    }
}