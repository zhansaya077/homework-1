public class Warrior extends Character {

    public Warrior(String name) {
        super(name, 200, 30, 40, 10);
    }

    @Override
    public void useSpecialAbility() {
        System.out.println("Special Ability: Berserker Rage!");
    }
}
