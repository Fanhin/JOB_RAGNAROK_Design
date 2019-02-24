
import java.util.Scanner;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        String name, gender;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        name = sc.next();
        System.out.print("Enter your gender: ");
        gender = sc.next();

        
        Novice n1 = new Novice(name, gender);
        n1.bag.addItem();
            int ac0=0 ;
        
          //--------------------------------------------------
          
          while (ac0 == 0) {

            System.out.println("ooooooooooooooooooooooooooooo");
            System.out.println("-----Welcome To Ragnarok-----");
            System.out.println("ooooooooooooooooooooooooooooo");
            System.out.println("1.MyNovice");
            System.out.println("2.Bag");
            System.out.println("3.Up Level");
            Scanner ac1 = new Scanner(System.in);
              int r1= ac1.nextInt();
              if (r1 == 1) {
                n1.showNovice();
              }
              else if (r1 == 2) {
                n1.bag.showItem();
                  Item i1 = new Item();
                  MonsterEgg m1 = new MonsterEgg();
                  OneHandSword s1 = new OneHandSword();
                  i1.Detail();
                  m1.addEggLists();
                  m1.showMonsterLists();
                  s1.detail();
                
              } 
              else if (r1 == 3){
                n1.upLevel();
              }
                
              }
          }
      





              }
        
        

    

