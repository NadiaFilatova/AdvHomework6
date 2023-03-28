package task3;

public class Task3 {
    public static void main(String args[]) {
        Animal animal = new Animal("Some animal");
        Cat cat = new Cat("Some cat", 3);
        System.out.println("Animal: " + animal.getClass().getAnnotation(CustomAnnotation.class));
        System.out.println("Cat: " + cat.getClass().getAnnotation(CustomAnnotation.class));
    }
}
