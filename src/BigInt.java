public class BigInt {
    private Node head;

    /**
     * Constructor: Builds a BigInt from the string
     */

    public BigInt(String number) {
        // 1. Remove leading zeros
        number = number.replaceFirst("^0+(?!$)", "");

        // 2. Loop through the string right to left
        // 3. For each character, convert to int and create a Node

        Node myNode = new Node();

        for (int i = number.length() - 1; i >= 0; i--) {
            char c = number.charAt(i);
            int x = (int) c;
            Node tempNode = new Node(x, );

        }



        // 4. Link nodes so that the first node is head
    }

}
