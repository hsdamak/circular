package circular;

public class CircularLinkedLIst {
    public static class Node{
        private int data;
        private Node node;

        public Node(int data) {
            this.data = data;
        }

        public Node(int data, Node node) {
            this.data = data;
            this.node = node;
        }
    }
}
