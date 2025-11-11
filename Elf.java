

/**
 * The Elf class implements a wrapper for the base Creature class with the following additions
 * Implements a maximum/minimum strength for the creature type [20/5]
 * Implements a maximum/minimum hitpoint total for the creature type [25/5]
 * 
 * @author Bill Crosbie
 * @version 2025-04 v1.1
 */
public class Elf extends Creature
{
    // instance variables - replace the example below with your own
    private static final int MAX_ELF_HP = 25;
    private static final int MIN_ELF_HP = 8;
    private static final int MAX_ELF_STR = 18;
    private static final int MIN_ELF_STR = 5;

    /**
     * Constructor for objects of class Elf -
     * Note that the calling class does not need to know anything about the 
     * requirements of elf minimum and maximum values
     * 
     * The instantiating class asks for a Elf and the elf class is responsible for
     * return a Elf object with values in the appropriate range
     * 
     */
    public Elf()//this is a 0 parameter constructor, as the Elf class knows how to communicate with the creature class.
    {
        // note how the class uses the static randomizer class to
        // generate the values. This localizes the need to know 
        // max and min values to this class only
        // max-min is range of values
        // range + min ensures that the values don't start at one.
        super(
            Randomizer.nextInt(MAX_ELF_STR-MIN_ELF_STR)+MIN_ELF_STR,
            Randomizer.nextInt(MAX_ELF_HP-MIN_ELF_HP)+MIN_ELF_HP        
        );
          
    }
    
    
    public int attack(){
        int totalDamage;
        
        totalDamage = super.attack(); //ask the superclass (creature) to compute the damage due to strength
        
        //roll the die, and if in range, double the damage done
        if (Randomizer.nextInt(10) == 10){
            totalDamage = totalDamage * 2;
        }
        
        return totalDamage;
    }
    
    // takeDamage(int) - not overridden, because Humans take all damage assigned to them

}
