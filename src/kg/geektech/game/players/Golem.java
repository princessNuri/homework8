package kg.geektech.game.players;

public class Golem extends Hero{
    public Golem(String name, int health, int damage) {
        super(name, health, damage, SuperAbility.TAKE_DAMAGE);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        int takeDamage = boss.getDamage()/5;
        for (int i = 0; i < heroes.length; i++) {
            if (this.getHealth() > 0 && heroes[i].getHealth() > 0 && this != heroes[i]) {
                heroes[i].setHealth(heroes[i].getHealth() + boss.getDamage());
                this.setHealth(this.getHealth() - takeDamage);
            }
        }
        System.out.println("Golem took damage");
    }
}
