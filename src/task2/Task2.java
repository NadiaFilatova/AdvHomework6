package task2;

import java.lang.reflect.Method;
import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an operator (+, -, *, /): ");
        Operator operator = readOperator(scanner);
        Class<?> cl = Calculator.class;
        Method m;
        CalculatorOperation calculator;
        try {
            switch (operator) {
                case PLUS:
                    m = cl.getDeclaredMethod("add", double.class, double.class);
                    calculator = m.getAnnotation(CalculatorOperation.class);
                    System.out.println(calculator.num1() + Operator.PLUS.toString() + calculator.num2()
                            + Operator.EQUAL + Calculator.add(calculator.num1(), calculator.num2()));
                    break;
                case MINUS:
                    m = cl.getDeclaredMethod("subtract", double.class, double.class);
                    calculator = m.getAnnotation(CalculatorOperation.class);
                    System.out.println(calculator.num1() + Operator.MINUS.toString() + calculator.num2()
                            + Operator.EQUAL + Calculator.subtract(calculator.num1(), calculator.num2()));
                    break;
                case MULTIPLY:
                    m = cl.getDeclaredMethod("multiply", double.class, double.class);
                    CalculatorOperation calculator3 = m.getAnnotation(CalculatorOperation.class);
                    System.out.println(calculator3.num1() + Operator.MULTIPLY.toString() + calculator3.num2()
                            + Operator.EQUAL + Calculator.multiply(calculator3.num1(), calculator3.num2()));
                    break;
                case DIVIDE:
                    m = cl.getDeclaredMethod("divide", double.class, double.class);
                    calculator = m.getAnnotation(CalculatorOperation.class);
                    System.out.println(calculator.num1() + Operator.DIVIDE.toString() + calculator.num2()
                            + Operator.EQUAL + Calculator.divide(calculator.num1(), calculator.num2()));
                    break;
                default:
                    System.out.println("Error! Enter correct operator ");
            }

        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }

    }

    /**
     * Reads input from console and returns corresponding operator.
     * @param scanner scanner object to read from console
     * @return operator
     * @throws UnsupportedOperationException if no operator matched
     */
    private static Operator readOperator(Scanner scanner) {
        String input = scanner.next();
        switch (input) {
            case "+":
                return Operator.PLUS;
            case "-":
                return Operator.MINUS;
            case "*":
                return Operator.MULTIPLY;
            case "/":
                return Operator.DIVIDE;
            default:
                throw new UnsupportedOperationException("Unsupported operation: " + input);
        }
    }
}


