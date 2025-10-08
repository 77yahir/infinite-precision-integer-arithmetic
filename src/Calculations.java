public class Calculations {
    private BigInt num1;
    private BigInt num2;

    /**
     * Constructor: Creates a Calculation class that holds 2 BigInt classes
     */

    public Calculations(BigInt num_1, BigInt num_2) {
        this.num1 = num_1;
        this.num2 = num_2;
    }

    /**
     * Adds two BigInt classes returns the new resulting BigInt
     * @param num_1
     * @param num_2
     * @return The combined BigInt values
     */

    public static BigInt Add(BigInt num_1, BigInt num_2) {
        BigInt top = num_1;
        BigInt bottom = num_2;

        if (num_1.size() < num_2.size()) {
            top = num_2;
            bottom = num_1;
        }

        Node curr1 = top.front();
        Node curr2 = bottom.front();
        int carry = 0;
        StringBuilder total = new StringBuilder();

        while (curr1 != null || curr2 != null) {
            int sum = 0;
            int d1 = 0;
            int d2 = 0;

            if (curr1 != null) d1 = curr1.getDigit();
            if (curr2 != null) d2 = curr2.getDigit();

            sum = d1 + d2 + carry;

            if (sum >= 10) {
                carry = 1;
                sum -= 10;
            } else {
                carry = 0;
            }

            total.append(sum);

            if (curr1 != null) curr1 = curr1.getNext();
            if (curr2 != null) curr2 = curr2.getNext();
        }

        if (carry > 0) {
            total.append(carry);
        }

        total.reverse();
        return new BigInt(total.toString());
    }

    /**
     * Multiplies two BigInt classes and returns the new resulting BigInt
     * @param num_1
     * @param num_2
     * @return The combined BigInt values
     */

    public static BigInt Multiply(BigInt num_1, BigInt num_2) {
        BigInt top = num_1;
        BigInt bottom = num_2;

        if (num_1.size() < num_2.size()) {
            top = num_2;
            bottom = num_1;
        }

        Node curr2 = bottom.front();
        BigInt total = new BigInt("0");
        int nZeros = 0;

        while (curr2 != null) {
            Node curr1 = top.front();
            int carry = 0;
            StringBuilder minor = new StringBuilder();

            while (curr1 != null) {
                int sum = curr1.getDigit() * curr2.getDigit() + carry;
                carry = sum / 10;
                minor.append(sum % 10);
                curr1 = curr1.getNext();
            }

            if (carry > 0) {
                minor.append(carry);
            }

            while (nZeros != 0){
                minor.insert(0,0);
                nZeros--;
            }
            nZeros++;

            BigInt temp = new BigInt(minor.reverse().toString());

            total = Calculations.Add(total, temp);
            curr2 = curr2.getNext();

        }
        return total;
    }
}
