import java.util.Arrays;
import java.util.List;

public class BigInt {
    private Node head;

    /**
     * Constructor: Builds a BigInt from the string by using a linked list
     * @param number
     */

    public BigInt(String number) {

        number = number.replaceFirst("^0+(?!$)", "");

        head = null;

        for (int i = 0; i < number.length(); i++) {

            char c = number.charAt(i);
            int digit = c - '0';
            Node tempNode = new Node(digit);
            tempNode.setNext(head);
            head = tempNode;
        }
    }

    /**
     * Copy Constructor
     */

    public BigInt(BigInt other) {
        this.head = other.front();
    }

    /**
     * Converts BigInt into its numerical value
     * @return String form of BigInt number
     */

    public String toString() {
        StringBuilder result = new StringBuilder();

        Node curr = head;
        while (curr != null) {
            result.append(curr.getDigit());
            curr = curr.getNext();
        }

        result.reverse();
        return result.toString();
    }

    /**
     * Finds the size of a BigInt
     * @return The int value of the size of the BigInt
     */

    public int size() {
        int count = 0;

        Node curr = head;
        while (curr != null) {
            count++;
            curr = curr.getNext();
        }
        return count;
    }

    /**
     * Returns the first Node of the BigInt
     */

    public Node front() {
        return this.head;
    }

}
