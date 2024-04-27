

public class HeightOrBt {

    public static void main(String[] args) {

        Node n = new Node(1);
        n.right = new Node(2);
        n.left = new Node(3);

        n.right.left = new Node(4);
        n.right.right = new Node(5);
        n.right.left.right = new Node(6);

        System.out.println(heightOfBT(n));
    }

    public static int heightOfBT(Node node) {
        if (node == null) {
            return 0;
        }
        return Math.max(heightOfBT(node.right), heightOfBT(node.left)) + 1;
    }

}
