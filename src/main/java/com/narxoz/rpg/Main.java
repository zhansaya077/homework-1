
package com.narxoz.rpg;

import com.narxoz.rpg.character.*;
import com.narxoz.rpg.factory.*;

public class Main {

    public static void main(String[] args) {

    
        CharacterFactory warriorFactory = new WarriorFactory();
        CharacterFactory mageFactory = new MageFactory();
        CharacterFactory archerFactory = new ArcherFactory();

        Character warrior = warriorFactory.createCharacter("Thor");
        Character mage = mageFactory.createCharacter("Merlin");
        Character archer = archerFactory.createCharacter("Legolas");

      
        EquipmentFactory medievalFactory = new MedievalFactory();
        EquipmentFactory magicFactory = new MagicFactory();
        EquipmentFactory rangerFactory = new RangerFactory();

        warrior.equip(medievalFactory);
        mage.equip(magicFactory);
        archer.equip(rangerFactory);

    
        warrior.getStats();
        warrior.showEquipment();
        warrior.useSpecialAbility();

        System.out.println();

        mage.getStats();
        mage.showEquipment();
        mage.useSpecialAbility();

        System.out.println();

        archer.getStats();
        archer.showEquipment();
        archer.useSpecialAbility();
    }
}

