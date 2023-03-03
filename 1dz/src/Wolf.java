import org.jetbrains.annotations.NotNull;

public class Wolf extends Player {
    String name;
    int damage;
    public Wolf(String name, int damage) {
        super(name);
        this.name = name;
        this.damage = damage;
    }

    public void attack( Player p){
        p.decreaseHealth(damage);
    }

    @Override
    public String toString() {
        return "wolf damaged player with power: "+ damage +","+" health: " + health;
    }

}
