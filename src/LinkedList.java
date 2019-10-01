public class LinkedList {

    private Node head;
    private Node tail;
    private int size;

    public void addLast(int elemento) {
        Node node = new Node(elemento);
        if (isEmpty()) {
            this.head = node;
            this.tail = this.head;
        } else {
            this.tail.next = node;
            node.previous = this.tail;
            this.tail = node;
        }
        this.size++;
    }

    public int size() {
        return this.size;
    }

    public int soma() {
        if (isEmpty()) return 0;
        return head.soma();
    }

    public boolean isSorted() {
        if (isEmpty())
            return true;
        return head.isSorted();
    }

    private boolean isEmpty() {
        return this.size == 0;
    }

    public void add(int index, int elemento) {
        if (index >= 0 && index <= this.size) {
            if (index == 0 || index == this.size)
                addLast(elemento);
            else{
                Node node = new Node(elemento);
                Node aux = this.head;
                while (index >= 0) {
                    aux = aux.next;
                    index--;
                }
                node.next = aux;
                node.previous = aux.previous;
                aux.previous.next = node;
                aux.previous = node;
                this.size++;
            }
        }
    }

    public void remove(int index) {
        if (index >= 0 && index < this.size) {
            Node aux = this.head;
            while (index > 0) {
                aux = aux.next;
                index--;
            }
            if (aux == this.head) {
                if (aux.next == null) {
                    this.head = null;
                    this.tail = null;
                } else {
                    this.head = this.head.next;
                    this.head.previous = null;
                }
            } else if (aux == this.tail) {
                this.tail = this.tail.previous;
                this.tail.next = null;
            } else {
                aux.previous.next = aux.next;
                aux.next.previous = aux.previous;
            }
            this.size--;
        }
    }
}

