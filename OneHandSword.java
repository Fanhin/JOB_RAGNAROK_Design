/**
 * Weapons
 */
public class OneHandSword extends Item{

        private int attackDamage;
   
        
        public OneHandSword(){
                super(1,"OneHandSword",1);
                this.attackDamage = 20;
        }

        public void detail(){
                System.out.println("The damage attack from Sword = "+attackDamage);
        }
        

    
    
}