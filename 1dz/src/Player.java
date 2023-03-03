 public  class Player {
     private long id;
     public String name;

     public int health = 100;
     int maxHealth = 100;

     static int idCounter = 0;
     public boolean isAlive = true;



     public Player(String name) {
        this.name = name;
        this.id = idCounter += 1;

    }


    public boolean decreaseHealth(int damage) {
         if (health >= 0) {
             health = health - damage;
             if (health< 0) {
                 health = 0;
                 System.out.println("player has died");
             }
             return  true;
         } else {
             return false;
         }
    }
     @Override
     public String toString() {
         return "heroes health: " + health;
     }
 }
