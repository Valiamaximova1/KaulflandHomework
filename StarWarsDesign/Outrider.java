package StarWarsDesign;

public class Outrider extends Sheep {
    int plasmaDefense = 0;

    public Outrider(int id, String name, String color, int attackDamage, int life,
                    int shield, int capacity, int plasmaDefenseproperty) {
        super(id, name, color, attackDamage, life, shield, capacity);
        this.plasmaDefense = plasmaDefenseproperty;
        super.life += 100;
    }

    @Override
    void attack(Sheep battleship) {
        battleship.takeDamage(attackDamage);
    }

    @Override
    void takeDamage(int damage) {
        this.life -= damage - 50;
    }

    public int getPlasmaDefense() {
        return plasmaDefense;
    }

    public void setPlasmaDefense(int plasmaDefense) {
        this.plasmaDefense = plasmaDefense;
    }
}
