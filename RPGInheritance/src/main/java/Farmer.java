public class Farmer extends Player{
//variables
    private int strength;
    private int health;
    private int stamina;
    private int speed;
    private int attackPower;
//contructor
    public Farmer(int strength, int health, int stamina, int speed, int attackPower){
        this.strength = strength;
        this.health = health;
        this.stamina = stamina;
        this.speed = speed;
        this.attackPower = attackPower;
    }
    //getter and setters
    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    //methods
    public void run() {

        decreaseStamina();

    }
    public void plow(){

        setStrength(strength - 5);
        decreaseStamina();
        decreaseHealth();

    }
    public void harvest(){

        decreaseStamina();

    }
    public void attack(){

        decreaseStamina();
        decreaseHealth();
    }
    public void heal(){

        setSpeed(speed + 1);
        increaseStamina();
    }
    public int decreaseHealth(){

        setHealth(health - 5);
        return this.health;
    }
    public int increaseStamina(){

        setStamina(stamina + 10);
        return this.stamina;
    }
    public int decreaseStamina(){

        setStamina(stamina - 10);
        return this.stamina;
    }


}
