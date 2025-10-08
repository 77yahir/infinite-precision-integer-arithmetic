public class Node {
    private int digit;
    private Node next;

    /**
     * Constructor: Creates a Node
     * @param digit
     */

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
