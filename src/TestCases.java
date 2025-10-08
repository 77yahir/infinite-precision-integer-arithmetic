import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


/**
 *     All test cases for program will be written by me here.
 */

public class TestCases {

    @Test
    public void testBigInt01() {
        BigInt result = new BigInt("436");
        assertEquals("436", result.toString());
    }

    @Test
    public void testBigInt02() {
        BigInt result = new BigInt("00100");
        assertEquals("100", result.toString());
    }

    @Test
    public void testSize() {
        BigInt result = new BigInt("001");
        assertEquals(1, result.size());
    }

    @Test
    public void testAdd01() {
        BigInt num1 = new BigInt("900");
        BigInt num2 = new BigInt("001");
        String result = Calculations.Add(num1, num2).toString();
        assertEquals("901", result);
    }

    @Test
    public void testAdd02() {
        BigInt num1 = new BigInt("100003");
        BigInt num2 = new BigInt("0");
        String result = Calculations.Add(num1, num2).toString();
        assertEquals("100003", result);
    }

    @Test
    public void testMultiply01() {
        BigInt num1 = new BigInt("999");
        BigInt num2 = new BigInt("099");
        String result = Calculations.Multiply(num1, num2).toString();
        assertEquals("98901", result);
    }

    @Test
    public void testMultiply02() {
        BigInt num1 = new BigInt("0001234567");
        BigInt num2 = new BigInt("010");
        String result = Calculations.Multiply(num1, num2).toString();
        assertEquals("12345670", result);
    }

}
