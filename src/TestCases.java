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
    public void testAdd03() {
        BigInt num1 = new BigInt("99999");
        BigInt num2 = new BigInt("0999");
        String result = Calculations.Add(num1, num2).toString();
        assertEquals("100998", result);

    }

    @Test
    public void testMultiply01() {
        BigInt num1 = new BigInt("10000");
        BigInt num2 = new BigInt("1");
        String result = Calculations.Multiply(num1, num2).toString();
        assertEquals("10000", result);
    }

    @Test
    public void testMultiply02() {
        BigInt num1 = new BigInt("0001234567");
        BigInt num2 = new BigInt("010");
        String result = Calculations.Multiply(num1, num2).toString();
        assertEquals("12345670", result);
    }

    @Test
    public void testMultiply03() {
        BigInt num1 = new BigInt("2");
        BigInt num2 = new BigInt("2");
        String result = Calculations.Multiply(num1, num2).toString();
        assertEquals("4", result);
    }

    @Test
    public void testMultiply04() {
        BigInt num1 = new BigInt("200");
        BigInt num2 = new BigInt("0");
        String result = Calculations.Multiply(num1, num2).toString();
        assertEquals("0", result);
    }

    @Test
    public void testExponent01() {
        BigInt num1 = new BigInt("0015");
        String result = Calculations.Exponent(num1, 3).toString();
        assertEquals("3375", result);
    }

    @Test
    public void testExponent02() {
        BigInt num1 = new BigInt("0505050");
        String result = Calculations.Exponent(num1, 4).toString();
        assertEquals("65063511975627506250000", result);
    }

    @Test
    public void testExponent03() {
        BigInt num1 = new BigInt("05");
        String result = Calculations.Exponent(num1,1).toString();
        assertEquals("5", result);
    }

    @Test
    public void testExponent04() {
        BigInt num1 = new BigInt("10");
        String result = Calculations.Exponent(num1, 0).toString();
        assertEquals("1", result);
    }

    @Test
    public void testExponent05() {
        BigInt num1 = new BigInt("2");
        String result = Calculations.Exponent(num1, 100).toString();
        assertEquals("1267650600228229401496703205376", result);
    }

    @Test
    public void testExponent06() {
        BigInt num1 = new BigInt("5");
        String result = Calculations.Exponent(num1, 2).toString();
        assertEquals("25", result);
    }

    @Test
    public void testExponent07() {
        BigInt num1 = new BigInt("5");
        String result = Calculations.Exponent(num1, 25).toString();
        assertEquals("298023223876953125", result);
    }

}
