public class Tank extends Player{
    String name;
    int damage;
    public Tank(String name, int damage) {
        super(name);
        this.name = name;
        this.damage = damage;
    }

    public void attack( Player p){
        p.decreaseHealth(damage);
    }

    @Override
    public String toString() {
        return "the tank drove through all players "+" health: " + health;
    }

}
