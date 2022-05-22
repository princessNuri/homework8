package kg.geektech.game.players;

public class Magic extends Hero {
    private int magicalIncrease=5;
    public Magic(String name, int health, int damage) {
        super(name, health, damage, SuperAbility.BOOST);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        for (int i = 0; i < heroes.length; i++) {
            heroes[i].setDamage(heroes[i].getDamage()+magicalIncrease);
        }
        System.out.println("Heroes' damage magically increased : "+magicalIncrease);


    }
}
