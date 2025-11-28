

/**
 * The Cyberdemon class implements a wrapper for the base Creature class with the following additions
 * Implements a maximum/minimum strength for the creature type [20/5]
 * Implements a maximum/minimum hitpoint total for the creature type [25/5]
 * 
 * @author Bill Crosbie
 * @version 2025-04 v1.1
 */
public class Cyberdemon extends Demon

{
    // instance variables - replace the example below with your own
    private static final int MAX_CYBERDEMON_HP = 100;
    private static final int MIN_CYBERDEMON_HP = 25;
    private static final int MAX_CYBERDEMON_STR = 40;
    private static final int MIN_CYBERDEMON_STR = 20;

    /**
     * Constructor for objects of class Cyberdemon -
     * Note that the calling class does not need to know anything about the 
     * requirements of elf minimum and maximum values
     * 
     * The instantiating class asks for a Cyberdemon and the elf class is responsible for
     * return a Cyberdemon object with values in the appropriate range
     * 
     */
    public Cyberdemon()//this is a 0 parameter constructor, as the Cyberdemon class knows how to communicate with the creature class.
    {
        // note how the class uses the static randomizer class to
        // generate the values. This localizes the need to know 
        // max and min values to this class only
        // max-min is range of values
        // range + min ensures that the values don't start at one.
        super(
            Randomizer.nextInt(MAX_CYBERDEMON_STR-MIN_CYBERDEMON_STR)+MIN_CYBERDEMON_STR,
            Randomizer.nextInt(MAX_CYBERDEMON_HP-MIN_CYBERDEMON_HP)+MIN_CYBERDEMON_HP        
        );
          
    }
    
    
    public int attack(){
        int totalDamage;
        
        totalDamage = super.attack(); //ask the superclass (creature) to compute the damage due to strength
        
        //roll the die, and if in range, double the damage done
        if (Randomizer.nextInt(10) <= 2){
            totalDamage = totalDamage + 50;
        }
        
        return totalDamage;
    }
    
    // takeDamage(int) - not overridden, because Humans take all damage assigned to them

}
