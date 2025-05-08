package org.example;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Point first = new Point(6, 5);

        Point second = new Point(3, 1);

        System.out.println("distance(0,0)= " + first.distance());

        System.out.println("distance(second)= " + first.distance(second));

        System.out.println("distance(2,2)= " + first.distance(2, 2));

        Point point = new Point(0,0);

        System.out.println("distance()= " + point.distance());


        Player p1 = new Player("John",100,Weapon.SWORD);
        p1.loseHealth(Weapon.SWORD.getDamage());
        System.out.println(Weapon.SWORD.getAttackSpeed());
        System.out.println(p1.healthRemaining());

        p1.loseHealth(Weapon.AXE.getDamage());
        System.out.println(Weapon.AXE.getAttackSpeed());
        System.out.println(p1.healthRemaining());






    }
}