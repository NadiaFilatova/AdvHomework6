package task4;

import java.lang.reflect.Method;

public class Task4 {
    public static void main(String[] args) {
        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        Class<?> cl = AddTwoNumbers.class;
        try {
            Method method = cl.getMethod("mathSum", int.class, int.class);
            Math math = method.getDeclaredAnnotation(Math.class);
            addTwoNumbers.mathSum(math.num1(), math.num2());
        } catch (NoSuchMethodException e){
            e.printStackTrace();
        }
    }
}
