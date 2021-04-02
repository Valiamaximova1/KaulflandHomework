package StarWarsDesign;

public class MillenniumFalcon extends Sheep{
    int dodgeproperty = 0;

    public MillenniumFalcon(int id, String name, String color, int attackDamage, int life, int shield, int capacity, int dodgeproperty) {
        super(id, name, color, attackDamage, life, shield, capacity);
        this.dodgeproperty = dodgeproperty;
    }

    @Override
    void attack(Sheep battleship){
        battleship.takeDamage(attackDamage);
        this.attackDamage *= 2;
    }

    @Override
    void takeDamage(int damage){
        this.life -= damage + 50;
    }

    public int getDodgeproperty() {
        return dodgeproperty;
    }

    public void setDodgeproperty(int dodgeproperty) {
        this.dodgeproperty = dodgeproperty;
    }
}
