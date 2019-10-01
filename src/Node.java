public class Node {

    private int elemento;
    Node next;
    Node previous;

    public Node(int elemento) {
        this.elemento = elemento;
    }

    public int soma() {
        if (this.next == null)
            return this.elemento;
        else {
            return this.elemento + this.next.soma();
        }
    }

    public boolean isSorted() {
        if (this.next == null)
            return true;
        if (this.next.elemento < this.elemento)
            return false;
        else
            return this.next.isSorted();
    }
}
