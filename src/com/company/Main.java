package com.company;

public class Main {

    public static void main(String[] args) {
        Warrior warrior = new Warrior();
        Magic magic = new Magic();
        Medic medic = new Medic();
        medic.setHealPoints(50);
        Hero[] heroes = {warrior, magic, medic};
        for (int i = 0; i < heroes.length; i++) {
            heroes[i].applySuperAbility();
            medic.increaseExperience();
            System.out.println(medic.getHealPoints());
        }
    }
}
