package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Boss boss = new Boss();
        boss.setHp(500);
        boss.setDamage(50);
        boss.setSuperAbility("Magic");
        System.out.println(boss.getDamage() + " " + boss.getHp() + " " + boss.getSuperAbility());
    }
}
