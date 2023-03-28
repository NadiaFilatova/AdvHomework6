package task3;

import java.lang.annotation.ElementType;

public class Cat extends Animal {
    @CustomAnnotation(age =2)
    private int age;

    public Cat(String name, int age) {
        super(name);
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name=" + getName() +
                ", age=" + age +
                '}';
    }
}
