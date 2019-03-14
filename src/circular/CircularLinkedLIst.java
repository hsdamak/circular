package circular;

public class CircularLinkedLIst {
    private int size = 0;
    private Node head = null;
    private Node tail = null;

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

    public void print(){
        if(size == 0){

            System.out.println("List is empty!");
        }else{
            Node temp = head;
            do{
                System.out.println(" " + temp.data);
                temp = temp.next;
            }
            while (temp != head);
                System.out.println("");

        }
    }

    public void addNodeToHead(int data){
        Node n = new Node(data);
        if(size == 0){
            head = n;
            tail = n;
            n.next = head;
        } else {
            Node temp = head;
            n.next = head;
            head =n;
            tail.next = head;
        }
        size++;
    }

    public  void addNodeToTail(int data){
        if(size == 0){
            addNodeToHead(data);
        }else {
            Node node = new Node(data);
            tail.next = node;
            tail = node;
            tail.next = head;
        }
        size++;
    }


    public static void main(String[] args) {
        CircularLinkedLIst circular = new CircularLinkedLIst();
        circular.print();
        circular.addNodeToHead(1);
        circular.print();

    }

}
