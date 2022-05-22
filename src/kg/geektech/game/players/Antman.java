package kg.geektech.game.players;

public class Antman extends Hero{
    public Antman(String name, int health, int damage, SuperAbility superAbility) {
        super(name, health, damage, superAbility);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {

    }
}
