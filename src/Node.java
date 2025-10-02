public class Node {
    private int digit;
    private Node next;

    public Node(int digit) {
        this.digit = digit;
        this.next = null;
    }

    public int getDigit() {
        return this.digit;
    }

    public Node getNext() {
        return this.next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
