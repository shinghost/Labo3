import Node.Node;

    public class Z3b {


        public static Node CreateHeadRec(Node head, int i) {
            if(i>0) {
                head = new Node(i, head);
                return CreateHeadRec(head, i-1);
            }
            return head;
        }

        public static Node CreateTailRec(Node tail, int g, int i) {
            if(i<g) {
                tail.next = new Node(i+1, null);
                tail = tail.next;
                return CreateTailRec(tail, g, i+1);
            }
            return tail;
        }

        public static void main(String[] args) {
            Node node1 = new Node(1, new Node( 2,new Node(3, new Node(4,null))));
            System.out.println(node1);

            Node head = CreateHeadRec(null, 6);
            System.out.println(head);

            Node tail = CreateTailRec(new Node(0,null), 6, 0);
            System.out.println(tail);
    }
}

