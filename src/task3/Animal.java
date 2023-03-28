package task3;
//Створіть кілька класів, один клас успадковує інший і використовує інструкцію Inherited.
// Крім цього, спробуйте ще в проекті використовувати 5 різних інструкцій.
@CustomAnnotation(value = "animal")
public class Animal {
    private final String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                '}';
    }
}
