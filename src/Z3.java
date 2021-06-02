import Node.Node;

    public class Z3 {

        public static Node CreateHead(int i) {
            Node head = null;
            for (; i >= 0; i--) {
                head = new Node(i, head);
            }
            return head;
        }

        public static Node CreateTail(int g) {
            Node head = new Node(0, null);
            Node tail = head;
            for (int i = 0; i < g; i++) {
                tail.next = new Node(i + 1, null);
                tail = tail.next;
            }
            return head;
        }

        public static Node AddFirst(Node oldHead, Node newHead) {
            newHead.next = oldHead;
            return newHead;
        }

        public static Node AddLast(Node head, Node newTail) {
            Node ref = head;
            while (ref.next != null) {
                ref = ref.next;
            }
            newTail.next = ref.next;
            ref.next = newTail;
            return head;
        }

        public static Node Insert(Node head, Node newNode, int i) {
            Node ref = head;
            int k = 1;
            while (ref.next != null && (k < i)) {
                ref = ref.next;
                k++;
            }
            newNode.next = ref.next.next;
            ref.next = newNode;
            return head;
        }

        public static Node RemoveFirst(Node head) {
            return (head = head.next);
        }

        public static Node RemoveLast(Node head) {
            Node ref = head;
            while (ref.next.next != null) {
                ref = ref.next;
            }
            ref.next = null;
            return head;
        }

        public static Node Remove(Node head, int i) {
            Node ref = head;
            int k = 1;
            while (ref.next != null && (k < i)) {
                ref = ref.next;
                k++;
            }
            ref.next = ref.next.next;
            return head;
        }

        public static void main(String[] args) {
            Node node1 = new Node(0, new Node(1, new Node(2, null)));
            System.out.println(node1);
            Node head = CreateHead(5);
            System.out.println(head);
            Node tail = CreateTail(5);
            System.out.println(tail);
            head = AddFirst(head, new Node(111, null));
            System.out.println(head);
            head = AddLast(head, new Node(222, null));
            System.out.println(head);
            System.out.println(Insert(head, new Node(333, null), 4));
            head = RemoveFirst(head);
            System.out.println(head);
            head = RemoveLast(head);
            System.out.println(head);
            head = Remove(head, 2);
            System.out.println(head);
        }
    }
