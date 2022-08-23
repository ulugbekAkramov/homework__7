package com.company;

public abstract class  Hero implements HavingSuperAbility {
    private int health;
    private int damage;
    private String fireball;


    public abstract String applySuperAbility();

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getFireball() {
        return fireball;
    }

    public void setFireball(String fireball) {
        this.fireball = fireball;
    }
}
