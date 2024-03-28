package org.example;

public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(700);
        boss.setDamage(100);
        boss.setWeapon(new Weapon(WeaponType.SWORD, "Arming sword"));
        System.out.println(boss.printInfo());

        Skeleton skeleton1 = new Skeleton();
        skeleton1.setHealth(300);
        skeleton1.setDamage(30);
        skeleton1.setWeapon(new Weapon(WeaponType.HANDGUN, "Revolver"));
        skeleton1.setArrows(20);

        Skeleton skeleton2 = new Skeleton();
        skeleton2.setHealth(200);
        skeleton2.setDamage(20);
        skeleton2.setWeapon(new Weapon(WeaponType.GRENADE, "F1 grenade"));
        skeleton2.setArrows(10);

        System.out.println(skeleton1.printInfo());
        System.out.println(skeleton2.printInfo());
    }

}