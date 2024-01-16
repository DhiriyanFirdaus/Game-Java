package game;

public class Player {

    String name;
    int speed, healthPoint, damage, armor , ability;

    void run() {
        System.out.println(name + " is running...");
        System.out.println("Speed: " + speed);
        System.out.println("");

    }

    void attack(String a) {
        if (damage >= 70) {
            System.out.println(name + " has heavy attacked " + a);
        } else {
            System.out.println(name + " has lightly attacked " + a);
        }
        System.out.println(name + " damage is " + damage + "\n");
    }

    void defend(String a) {
        int hited = 130;
        System.out.println(name + " has been attack by " + a);
        System.out.println(a + " has attack " + hited + " attacks\n");
        if (armor <= hited) {
            int remain = hited - armor;
            armor = 0;

            if (remain >= healthPoint) {
                healthPoint = 0;
                System.out.println("Remaining armor "+ name + " is : " + armor);
                System.out.println("Remaining HP "+ name + " is : " + healthPoint);

            } else {
                healthPoint = healthPoint - remain;
                System.out.println("Remaining armor "+ name + " is : " + armor);
                System.out.println("Remaining HP "+ name +" is : " + healthPoint);
            }

        } else if (armor >= 0) {
            armor = armor - hited;
            System.out.println("Remaining armor "+ name +"is : " + armor);
            System.out.println("Remaining HP"+ name +" is : " + healthPoint);
        }

    }

    boolean isDead() {
        if (healthPoint <= 0) {
            return true;
        }
        return false;
    }

}
