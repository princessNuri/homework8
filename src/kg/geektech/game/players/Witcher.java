package kg.geektech.game.players;

import kg.geektech.game.general.RPG_Game;

public class Witcher extends Hero{
    public Witcher(String name, int health, int damage) {
        super(name, health, damage, SuperAbility.SACRIFICE);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        boolean witcherAttack = RPG_Game.random.nextBoolean();
        if(this.getHealth()>0 && witcherAttack==true){
            for (int i = 0; i < heroes.length; i++) {
                if(heroes[i].getHealth()<=0 ){
                    heroes[i].setHealth(this.getHealth()+heroes[i].getHealth());
                    this.setHealth(0);
                    System.out.println("Witcher saved");
                }

            }
        }
    }
}
