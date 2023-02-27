public class Main {
    public static void main(String[] args) {
        Plate plate = new Plate(20);
        Cat[] cats = {
                new Cat("Barsik", 5),
                new Cat("Murzik", 8),
                new Cat("Vasya", 15)
        };

        for (Cat cat : cats) {
            cat.eat(plate);
            System.out.println(cat);
        }

        plate.increaseFood(10);
        System.out.println("Added 10 units of food to the plate");

        for (Cat cat : cats) {
            cat.eat(plate);
            System.out.println(cat);
        }
    }
}
