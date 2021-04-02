package StarWarsDesign;

public class EbonHawk extends Sheep{
    public EbonHawk(int id, String name, String color, int attackDamage, int life, int shield, int capacity) {
        super(id, name, color, attackDamage, life, shield, capacity);
    }

    @Override
    void attack(Sheep battleship) {
        battleship.takeDamage(attackDamage);
    }

    @Override
    void takeDamage(int damage) {
        this.life -= damage;
    }

    public void heal(int bonusLife){
        this.life += bonusLife;
    }
}
