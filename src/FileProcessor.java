import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileProcessor {

    /**
     * Processes arithmetic expressions line-by-line in the given file.
     *
     * @param filePath Path to a file containing arithmetic expressions.
     */
    public static void processFile(String filePath) {
        File infile = new File(filePath);
        try (Scanner scan = new Scanner(infile)) {
            while (scan.hasNext()) {
                String line = scan.nextLine().trim();

                if (line.isEmpty()) continue;
                String trimmedLine = line.replaceAll("\\s+", "");
                StringBuilder num1 = new StringBuilder();
                StringBuilder num2 = new StringBuilder();
                StringBuilder operand = new StringBuilder();

                for (int i = 0; i < trimmedLine.length(); i++) {
                    char c = trimmedLine.charAt(i);
                    if (Character.isDigit(c) && operand.isEmpty()) {
                        num1.append(c);
                    } else if (!Character.isDigit(c) && operand.isEmpty()){
                        operand.append(c);
                    } else {
                        num2.append(c);
                    }
                }

                String operand1 = new String(operand);
                BigInt num_1 = new BigInt(num1.toString());
                BigInt num_2 = new BigInt(num2.toString());
                BigInt result;
                if (operand1.equals("+")) {
                    result = Calculations.Add(num_1, num_2);
                    System.out.println(num1 + " " + operand + " " + num2 + " = " + result);
                }
                    else if (operand1.equals("*")) {
                    result = Calculations.Multiply(num_1, num_2);
                    System.out.println(num1 + " " + operand + " " + num2 + " = " + result);
                }
                    else if (operand1.equals("^")) {
                    try {
                        int exponent = Integer.parseInt(num_2.toString());
                        result = Calculations.Exponent(num_1,exponent);
                        System.out.println(num1 + " " + operand + " " + num2 + " = " + result);
                    } catch (NumberFormatException e) {
                        System.out.println("Error: Invalid exponent format");
                    }
                }
                    else {
                    System.out.println("Invalid input");
                }
                // TODO: Process each line of the input file, handling blank
                // lines and spacing differences as appropriate
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + infile.getPath());
        }
    }
}
