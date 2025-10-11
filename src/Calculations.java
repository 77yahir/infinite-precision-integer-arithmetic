import java.net.CacheRequest;

public class Calculations {
    private Calculations() {}

    /**
     * Adds two BigInt classes returns the new resulting BigInt
     *
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
     *
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

            for (int i = 0; i < nZeros; i++) {
                minor.insert(0, 0);
            }
            nZeros++;

            BigInt temp = new BigInt(minor.reverse().toString());

            total = Calculations.Add(total, temp);
            curr2 = curr2.getNext();

        }
        return total;
    }

    /**
     * Raises a BigInt class to an int Exponent and returns the new resulting BigInt class
     * @param num_1
     * @param n
     * @return The resulting BigInt
     */
    
    public static BigInt Exponent(BigInt num_1, int n) {
        BigInt prod = new BigInt("1");
        if (n == 0) {
            return prod;
        }
        if (n == 1) {
            return num_1;
        }

        int check = n % 2;
        BigInt half = Exponent(num_1, n/2);
        BigInt multiply = Multiply(half, half);
        if (check == 0) return multiply;
        else return Multiply(multiply, num_1);

    }
}
