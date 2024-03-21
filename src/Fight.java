import java.util.Scanner;

public class Fight {
    static Weapon Sword = new Weapon("Sword", 15);
    static Weapon Knife = new Weapon("Knife", 5);
    static Weapon BowAndArrows = new Weapon("Bow and Arrows", 10);
    static Character Elf = new Character("Elf", 50, BowAndArrows);
    static Character Knight = new Character("Knight", 70, Sword);
    static Character Villain = new Character("Villain", 20, Knife);
    static Character Hobo = new Character("Hobo", 5, null);

    public static void main(String[] args){
        System.out.println("\n Elf vs Villain");
        Elf.fight(Villain);
        System.out.println("\n Hobo vs Knight");
        Hobo.fight(Knight);
        System.out.println("\n Villain vs Hobo");
        Villain.fight(Hobo);
        System.out.println("\n Knight vs Elf");
        Knight.fight(Elf);
    }
}
