public class Mage extends Player {
    int damage;
    public Mage(String name, int damage) {
        super(name);
        this.damage = damage;
    }

    public void attack( Player p) throws InterruptedException {
        p.decreaseHealth(damage);
//        if (health < 50) {
//            while (health <= maxHealth)
//            Thread.sleep(1000);
//            health = health + 10;
//            if (health > maxHealth) {
//                System.out.println("full healed");
//            }
//        }
    }

    @Override
    public String toString() {
        return "mage has cast the spell  with power: "+ damage +","+" health: " + health;
    }
}
