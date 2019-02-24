/**
 * Novice II
 */
public class Thief extends Novice {
        

    public Thief(String name, String genfer){
        super(name,genfer);
        hp = 2000;
        mp = 1000;
    }

        public void showNovice() {
            super.showNovice();
            System.out.println("---------Now Your Job is Thife----------");
        }
        
        public void showSkill(){
            System.out.println("skill 1 Attack");
            System.out.println("skill 2 Jump");
            System.out.println("skill 3 Warp");
        }
   
        
    
}