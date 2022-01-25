import java.util.Scanner;

/**
 * @author Aleksei Nagorskii
 * Implementation of basic calculator
 */
public class Task1_Calculator {

    public static void main(String[] args) {
        final int OP_ADD = 0;
        final int OP_SUBTRACT = 1;
        final int OP_DIVIDE = 2;
        final int OP_MULTIPLY = 3;

        Scanner scan = new Scanner(System.in);
        float[] values = new float[2];
        int operation;
        float result;

        System.out.println("Available operations is:\nAdd=0\nSubtract=1\nDivide=2\nMultiply=3");
        System.out.println("Please specify first value:");
        values[0] = scan.nextFloat();

        System.out.println("Please specify second value:");
        values[1] = scan.nextFloat();

        System.out.println("Please select operation:");
        operation = scan.nextInt();
        if (operation == OP_ADD)
            result = Add(values);
        else if (operation == OP_SUBTRACT)
            result = Subtract(values);
        else if (operation == OP_DIVIDE && values[1] != 0)
            result = Divide(values);
        else if (operation == OP_DIVIDE){
            System.err.println("Division by zero!");
            return;
        }
        else if (operation == OP_MULTIPLY)
            result = Multiply(values);
        else {
            System.err.println("Unsupported operation selected!");
            return;
        }
        System.out.printf("%.4f", result);

    }

    /**
     * @param values array of specified numbers
     * @return sum of the numbers
     */
    public static float Add(float[] values) {
        return values[0] + values[1];
    }

    /**
     * @param values array of specified numbers
     * @return difference of two numbers
     */
    public static float Subtract(float[] values) {
        return values[0] - values[1];
    }

    /**
     * @param values array of specified numbers
     * @return quotient of two numbers
     */
    public static float Divide(float[] values) {
        return values[0] / values[1];
    }

    /**
     * @param values array of specified numbers
     * @return product of two numbers
     */
    public static float Multiply(float[] values) {
        return values[0] * values[1];
    }

}