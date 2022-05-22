package kg.geektech.game.players;

public class Boss extends GameEntity {
    public Boss(String name, int health, int damage) {
        super(name, health, damage);
    }

    public void hit(Hero[] heroes) {
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHealth() > 0) {
                heroes[i].setHealth(heroes[i].getHealth() - this.getDamage());
            }
        }
    }
}
