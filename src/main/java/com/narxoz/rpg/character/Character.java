 package com.narxoz.rpg.character;

import com.narxoz.rpg.equipment.*;

public abstract class Character {

    protected String name;
    protected int health;
    protected int mana;
    protected int strength;
    protected int intelligence;

    protected Weapon weapon;
    protected Armor armor;

    public Character(String name, int health, int mana, int strength, int intelligence) {
        this.name = name;
        this.health = health;
        this.mana = mana;
        this.strength = strength;
        this.intelligence = intelligence;
    }

    public void equip(EquipmentFactory factory) {
        this.weapon = factory.createWeapon();
        this.armor = factory.createArmor();
    }

    public void getStats() {
        System.out.println("Name: " + name);
        System.out.println("Health: " + health);
        System.out.println("Mana: " + mana);
        System.out.println("Strength: " + strength);
        System.out.println("Intelligence: " + intelligence);
    }

    public void showEquipment() {
        if (weapon != null) System.out.println(weapon.getWeaponInfo());
        if (armor != null) System.out.println(armor.getArmorInfo());
    }

    public abstract void useSpecialAbility();
}
