import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Wolf wolf = new Wolf("test", 10);
        Wolf wolf1 = new Wolf("test1", 15);
        Mage mage = new Mage("test2", 12);
        Tank tank = new Tank("valentine", 100);
        Player p = new Player("aa");
        while(wolf1.health >0  || wolf.health >= 0 || mage.health >=0) {
            Thread.sleep(1000);
            wolf.attack(wolf1);
            wolf1.attack(wolf);
            mage.attack(wolf);
            wolf.attack(mage);
            mage.attack(wolf1);
            wolf1.attack(mage);
            tank.attack(wolf);
            tank.attack(mage);
            tank.attack(wolf1);
            System.out.println(wolf1);
            System.out.println(wolf);
            System.out.println(mage);
            System.out.println(tank);
            if (wolf1.health == 0 || wolf.health == 0 || mage.health == 0) break;
        }


    }
}