    public void eat(Plate plate) {
        if (plate.getFood() >= appetite && satiety < appetite) {
            plate.decreaseFood(appetite);
            satiety += appetite;
            System.out.println(name + " ate " + appetite + " units of food.");
        } else {
            System.out.println(name + " is hungry and cannot eat.");
        }
    }

    public int getSatiety() {
        return satiety;
    }
}

int foodNeeded = cat.getAppetite() - cat.getSatiety();