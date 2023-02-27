import java.util.*;

class Cat {
    private String name;
    private int appetite;
    private int satiety;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public void eat(Plate p) {
        if (p.getFood() >= appetite) {
            p.decreaseFood(appetite);
            satiety += appetite;
            System.out.println(name + " ate " + appetite + " units of food");
        } else {
            System.out.println(name + " is hungry and can't eat");
        }
    }

    public int getSatiety() {
        return satiety;
    }

    public void setSatiety(int satiety) {
        this.satiety = satiety;
    }

    public void decreaseSatiety() {
        satiety--;
    }

    public boolean isHungry() {
        return satiety < appetite;
    }

    public String getName() {
        return name;
    }

    public int getAppetite() {
        return appetite;
    }
}

class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public void decreaseFood(int amount) {
        if (food >= amount) {
            food -= amount;
        }
    }

    public void increaseFood(int amount) {
        food += amount;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the amount of food in the plate:");
        int initialFood = scanner.nextInt();
        Plate plate = new Plate(initialFood);
        Cat[] cats = {new Cat("Barsik", 5), new Cat("Murzik", 7), new Cat("Vaska", 10)};
        int totalAppetite = 0;
        for (Cat cat : cats) {
            totalAppetite += cat.getAppetite();
        }
        while (totalAppetite > 0) {
            for (Cat cat : cats) {
                if (cat.isHungry()) {
                    cat.eat(plate);
                    totalAppetite -= cat.getAppetite();
                    if (totalAppetite <= 0) {
                        break;
                    }
                }
            }
            System.out.println("Enter the amount of food to add to the plate:");
            int foodToAdd = scanner.nextInt();
            plate.increaseFood(foodToAdd);
        }
        for (Cat cat : cats) {
            System.out.println(cat.getName() + " satiety: " + cat.getSatiety());
        }
        while (true) {
            for (Cat cat : cats) {
                if (cat.getSatiety() > 0) {
                    cat.decreaseSatiety();
                } else {
                    System.out.println(cat.getName() + " is hungry again");
                    cat.setSatiety(cat.getAppetite());
                }
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
