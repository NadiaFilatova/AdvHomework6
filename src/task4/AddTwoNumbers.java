package task4;
//Створити свою інструкцію, яка міститиме параметри для методу, виконати додавання 2-х чисел.
//@Math(num1 = 100, num2 = 200)
//public void mathSum(int num1, int num2)
public class AddTwoNumbers {
    @Math(num1 = 100, num2 = 200)
    public void mathSum(int num1, int num2){
        System.out.println(num1 + num2);
    }
}

