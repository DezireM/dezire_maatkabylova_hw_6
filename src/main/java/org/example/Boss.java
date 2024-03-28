package org.example;

public class Boss extends GameEntity{
    private Weapon weapon;

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public String printInfo() {
        return "Boss: health:" + this.getHealth() + ", damage:" + this.getDamage() +
                ", weapon type:" + weapon.getType() + ", weapon name:" + weapon.getName();
    }
}
