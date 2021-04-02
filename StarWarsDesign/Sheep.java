package StarWarsDesign;

enum Color {
    BLACK, WHITE
}

abstract public class Sheep {
    public int id;
    public String name;
    public Color color;
    public int attackDamage;
    public int life;
    public int shield;
    public int capacity;

    public Sheep(int id, String name, Color color, int attackDamage, int life, int shield, int capacity) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.attackDamage = attackDamage;
        this.life = life;
        this.shield = shield;
        this.capacity = capacity;
    }

    abstract void attack(Sheep battleship);

    abstract void takeDamage(int damage);


    //    	Attack(battleship) - attacksa ship. The attacked ship should take damage and has a reduced Shieldand/or Life.
    public void Attack(String battleship) {
        attackDamage++;
        shield--;
        if (shield == 0) {
            life--;
        }
    }

    public void TakeDamage(int damage) {
        if (shield < 0) {
            life -= damage;
        } else {
            shield -= damage;
        }
    }

    public boolean IsDestroyed() {
        if (life <= 0) {
            return true;
        } else {
            return false;
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getAttackDamage() {
        return attackDamage;
    }

    public void setAttackDamage(int attackDamage) {
        this.attackDamage = attackDamage;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public int getShield() {
        return shield;
    }

    public void setShield(int shield) {
        this.shield = shield;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}

