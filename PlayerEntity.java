public abstract class PlayerEntity{
    // instance variable 
    protected double health;
    protected String entityName;
    protected int stamina;
    protected int attack;
    protected int combatPoints;
    protected String weapon;
    //constructor
    public PlayerEntity(){
        health = 0.0;
        entityName = "?";
        stamina = 0;
        attack = 0;
        combatPoints = 0;
        weapon = "No Weapon";
    }
    // overloaded constructor
    public PlayerEntity(double health, String name, int stamina, int attack, String weapon){
        this.health = health;
        entityName = name;
        this.stamina = stamina;
        this.attack = attack;
        this.weapon = weapon;
        combatPoints = 0;
    }
    //the only abstract method
    public abstract void computeCombatPower();
    //accessor
    public int getCombatPoints(){
        return combatPoints;
    }
    //toString()
    public String toString(){
    String result = "";
    result += "Hero name:\t\t" + entityName + 
              "\nCurrent Health:\t\t" + health + 
              "\nStamina:\t\t" + stamina +  
              "\nAttack Damage:\t\t" + attack +  
              "\nWeapon:\t\t\t" + weapon +  
              "\nCurrent Combat Points:\t" + combatPoints + "\n";
    return result;
}

}
