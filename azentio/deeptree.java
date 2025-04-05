public class deeptree {
    static class Node {
        int val;
        Node left, right;

        Node(int val) {
            this.val = val;
        }
    }

    public int maxDeep(Node root) {
        return h(root);
    }

    private int h(Node n) {
        if (n == null) return 0;
        return 1 + Math.max(h(n.left), h(n.right));
    }

    public static void main(String[] args) {
        deeptree tree = new deeptree();
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        System.out.println("tree max depth: " + tree.maxDeep(root));
    }
}
