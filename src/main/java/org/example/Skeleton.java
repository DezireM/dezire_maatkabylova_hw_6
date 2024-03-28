package org.example;

public class Skeleton  extends Boss{
    private int arrows;

    public int getArrows() {
        return arrows;
    }

    public void setArrows(int arrows) {
        this.arrows = arrows;
    }

    @Override
    public String printInfo() {
        return "Skeleton: health:" + this.getHealth() + ", damage:" + this.getDamage() +
                ", weapon type:" + this.getWeapon().getType() + ", weapon name:" + this.getWeapon().getName() +
                ", arrows:" + arrows;
    }
}
