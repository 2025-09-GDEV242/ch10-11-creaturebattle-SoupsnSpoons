
/**
 * Abstract class Creature - 
 * The creature is the main class from which all other battling creatures derive.
 * It is the creature's job to maintain current health values in response to 
 * requests to takeDamage. It also must report if
 * the creature is alive or knocked out. The creature is also responsible for calculating
 * damage delivered based on the creature's strength (1 to str) 
 * 
 * @author Crosbie
 * @version 2025-04 v1.0
 */
// we will learn what the abstract keyword does in a later chapter
public abstract class Creature
{
    private int str;        // The strength of this creature
    private int max_hp;     // The maximum hit points the creature can have (used if healing enabled)
    private int hp;         // the current numberof hit points the creature has
    
  
    
    /**
     * Create a creature with a given strength and hit point level. 
     * Store max hitpoints to allow for healing to be implemented later
     * Heals must never allow for more hit points than the creature started
     * with
     * @param str the strength of the creature, used to calculate damage
     * @param hp the health of the creature at the start of the simulation, and the current health levels during battle
     */
    public Creature (int str, int hp) {
       this.str = str;
       this.hp = hp;
       max_hp = hp;
    }
    
    
    /**
     * Allows a creature to determine how much damage it is causing in this round of battle
     * @return a value between 1 and str to be used to cause damage to another creature
     */
    public int attack(){ //as it currently stands, you attack, but will only do 0 points of damage... which is bad.
        // TODO: implement a damage method
        int damageToReturn; //local variable
        damageToReturn = Randomizer.nextInt(str); //I summon you, randomizer! Give me a value for my character's attack based on their strength!
        
        return damageToReturn;//be sure we know what value that is though. We gotta remember how much damage we do. It's a key component.
    }
    
    
    /**
     * Is this creature still capable of fighting?
     * @return true when current hit point level is greater than zero
     */
    public boolean isAlive() {
        // TODO: implement a method to report if the creature yet lives
        return (hp > 0); 
    }
    
    /**
     * Is this creature knockedOut?
     * @return true when current hit point level is less than or equal to zero
     */
    public boolean isKnockedOut() {
        //TODO: implement a method to report if the creature has been killed
        boolean unConcious;
        if(hp <=0){
        unConcious = true;
    }
        else{
            unConcious = false;
        }
        return unConcious;
    }
    
    
    /**
     * takeDamage receives a value for the amount of damage to subtract from 
     * the current total of hit points
     * @param damage value to remove from hit point count
     */
    public void takeDamage(int damage) {
        // TODO: implement this
        hp = hp - damage;
    }
    
}
