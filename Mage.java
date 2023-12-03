// This is a child class which inherited from Product class

import java.text.DecimalFormat;

public class Mage extends PlayerEntity{
    private double mana;

    //constructor
    public Mage(){
        //first line must call parent's constructor to initialize parent's variable
        super();
        mana = 0;
    }
    //overloaded constructor
    public Mage(double health, String name, int stamina, int attack, String weapon, double mana){
        super(health, name, stamina, attack, weapon);
        this.mana = mana;
    }
    //override the abstract method inherited from parent's method
    public void computeCombatPower(){ 
        combatPoints = (int)((attack + health) * (1 + mana));
        if(weapon.equals("No Weapon") == false){  // we check, does mage have a weapon
            combatPoints += 0;
        }
    }

    //toString()
    public String toString(){
        DecimalFormat fmt = new DecimalFormat("#%");
        String result = "";
        result ="\nMage Hero:\n" + super.toString() +
             "Mana:\t\t\t" + fmt.format(mana) + "\n";

        return result;
    }
    //Misce
}
