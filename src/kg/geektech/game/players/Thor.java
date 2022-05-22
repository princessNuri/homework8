package kg.geektech.game.players;

import kg.geektech.game.general.RPG_Game;

public class Thor extends Hero{
    public Thor(String name, int health, int damage) {
        super(name, health, damage, SuperAbility.DEAFEN);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        boolean thorAttack = RPG_Game.random.nextBoolean();
        if (this.getHealth() > 0 && thorAttack == true) {
            boss.setDamage(0);
            System.out.println("Thor deafened");

        } else {
            boss.setDamage(50);
        }
    }
}
