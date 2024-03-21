public class Character {
    String name;
    String enemy;
    int health;
    Weapon weapon;

    public Character (String name, int health, Weapon weapon){
        this.name = name;
        this.health = health;
        this.weapon = weapon;
    }

    public void fight(Character enemy) {
        System.out.println (name + " (" + health +"hp)" + " wants to fight with " + enemy.name + " (" + enemy.health + "hp)");
        if (weapon == null) {
            System.out.println(name + " has no weapon and running away..." + "\n");
        }
        else {
            System.out.print(name + " uses special skill and increases health in 10 points." + "\n");
            health +=10;
            System.out.print(name + " health point is " + health + ".\n");
            System.out.print(name + " makes hit with " + weapon.weaponName + ".\n");
            enemy.health -= weapon.hitPoints;
            System.out.print(enemy.name + " loses " + weapon.hitPoints + " health points." + "\n");
            System.out.print(enemy.name + " remaining health is " + enemy.health + ".\n");
        }

    }

}
