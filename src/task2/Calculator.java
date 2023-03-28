package task2;


//Написати калькулятор з використанням анотацій, анотація передає 2 параметри.
//Зробити повну документацію всіх полів, методів,
// конструкторів класу використовуючи інструкцію Documented, або документаційні коментарі.

public class Calculator {
    /**
     * Summarize two numbers
     *
     * @param num1 number 1
     * @param num2 number 2
     * @return sum of two numbers
     */
    @CalculatorOperation(num1 = 14, num2 = 45)
    public static float add(double num1, double num2) {
        return (float) (num1 + num2);
    }

    /**
     * Subtract one number from another.
     *
     * @param num1 number 1
     * @param num2 number 2
     * @return subtraction result
     */
    @CalculatorOperation(num1 = 14, num2 = 45)
    public static float subtract(double num1, double num2) {
        return (float) (num1 - num2);
    }

    /**
     * Multiply two numbers
     *
     * @param num1 number 1
     * @param num2 number 2
     * @return multiplication result
     */
    @CalculatorOperation(num1 = 14, num2 = 45)
    public static float multiply(double num1, double num2) {
        return (float) (num1 * num2);
    }

    /**
     * Divide one number by another
     *
     * @param num1 number 1
     * @param num2 number 2
     * @return division result
     * @throws ArithmeticException in case of division by zero
     */
    @CalculatorOperation(num1 = 14, num2 = 45)
    public static Object divide(double num1, double num2) throws ArithmeticException {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            throw new ArithmeticException("Error. Division by zero is impossible.");
        }
    }
}