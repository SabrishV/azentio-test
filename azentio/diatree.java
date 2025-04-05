public class diatree {
    static class Node {
        int val;
        Node left, right;

        Node(int val) {
            this.val = val;
        }
    }

    int dia = 0;
    public int dia(Node root) {
        h(root);
        return dia;
    }

    private int h(Node n) {
        if (n == null) return 0;
        int l = h(n.left);
        int r = h(n.right);
        dia = Math.max(dia, l + r);
        return 1 + Math.max(l, r);
    }

    public static void main(String[] args) {
        diatree tree = new diatree();
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        System.out.println("tree diameter:" + tree.dia(root));
    }
}
