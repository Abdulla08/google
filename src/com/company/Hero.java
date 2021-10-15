package com.company;

public class Hero {
    private int hp;
    private int damage;
    private String superAbility;

    public int getHp() {
        return hp;
    }

    public int getDamage() {
        return damage;
    }

    public String getSuperAbility() {
        return superAbility;
    }

    public Hero(int hp, int damage) {
        this.hp = hp;
        this.damage = damage;
    }

    public Hero(int hp, int damage, String superAbility) {
        this.hp = hp;
        this.damage = damage;
        this.superAbility = superAbility;
    }
}
