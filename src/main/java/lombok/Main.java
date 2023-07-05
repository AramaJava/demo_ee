package lombok;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Cat cat1 = new Cat("Marusya", 10, "Боря");
        cat.setAge(10);
        cat.setName("Barsik");
        cat.setParentName("Snezhok");

        System.out.println(cat.getName());
        System.out.println(cat1.getName());
    }
}
