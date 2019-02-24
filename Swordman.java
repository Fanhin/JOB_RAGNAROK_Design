/**
 * Swordman
 */
public class Swordman extends Novice {
   
    public Swordman(String name, String genfer){
        super(name,genfer);
        hp = 3000;
        mp = 1500;
    }
        @Override
        public void showNovice() {
            super.showNovice();
            System.out.println("---------Now Your Job is Swordman----------");
        }
        public void showSkill(){
            System.out.println("skill 1 Heavy Attack");
            System.out.println("skill 2 Jump Attack");
            System.out.println("skill 3 Spin Attack");
        }


    
}