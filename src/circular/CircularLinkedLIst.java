package circular;

public class CircularLinkedLIst {
    public static class Node{
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
        }

        public Node(int data, Node node) {
            this.data = data;
            this.next = node;
        }

        public int getData() {
            return data;
        }

        public Node getNext() {
            return next;
        }

        public void setData(int data) {
            this.data = data;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }
}
