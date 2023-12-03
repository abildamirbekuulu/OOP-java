
// this is Fighter class which inherites from PlayerEntity

import java.text.DecimalFormat;

public class Fighter extends PlayerEntity{
    //instance variable
    private double armor;
    private int maxAttack;
    private boolean isRanged;

    //overloaded constructor
    public Fighter(double health, String name, int stamina, int attack, String weapon, boolean isRanged){
        
        super(health, name, stamina, attack, weapon);
        
        this.isRanged = isRanged;
        if(this.isRanged == true){
            armor = 0.25;
            maxAttack = 125;
        }
        else{
            armor = 0.5;
            maxAttack = 100;
        }
    }

    //override the abstract method inherited from parent's method
    public void computeCombatPower(){ 
        if(maxAttack <= attack){
            combatPoints = (int)((maxAttack + health) * (1 - armor));
        }
        else{
            combatPoints = (int)((attack + health) * (1 - armor));
        }
        if(weapon.equals("Rock") && isRanged){
            combatPoints += 50;
        }
        if(weapon.equals("Sword") && !isRanged){
            combatPoints *= 2;
        }
    }

    //toString()
    public String toString(){
        String result = "";
        if(isRanged == true){
            result = "\nFighter Hero:\t\tRanged Type\n";
        }
        else{
            result = "\nFighter Hero:\t\tMelee Type\n";
        }
        DecimalFormat fmt = new DecimalFormat("#%");
        result = result + super.toString() + 
                 "Armor:\t\t\t" + fmt.format(armor) + "\n";
        return result;
    }

}
