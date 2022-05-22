package kg.geektech.game.players;

import kg.geektech.game.general.RPG_Game;

public class Warrior extends Hero {
    public Warrior(String name, int health, int damage) {
        super(name, health, damage, SuperAbility.CRITICAL_DAMAGE);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        int coeff = RPG_Game.random.nextInt(3) + 2;
        boss.setHealth(boss.getHealth() - this.getDamage() * coeff);
        System.out.println(this.getName() + " hits critically: "
                + this.getDamage() * coeff);
    }
}
