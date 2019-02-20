import java.awt.Menu;
import java.util.Scanner;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        String name, gender;
        int Menu=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        name = sc.next();
        System.out.println("Enter your gender");
        gender = sc.next();

        Novice p1 = new Novice(name, gender);
        Scanner read1 = new Scanner(System.in);
        int action1;
        p1.bag.i1.addPostion();
        while (Menu == 0) {
        
          System.out.println("-----------------------------");
          System.out.println("-----Welcome To Ragnarok-----");
          System.out.println("1.MyNovice");
          System.out.println("2.Bag");
          
          action1 = read1.nextInt();
        

        if (action1 == 1) {
                p1.showNovice();
        } else if(action1 == 2){
                 p1.showBag();
                 int action2 = 0;
                 Scanner read2 = new Scanner(System.in);
                 
                     while(action1==2){
                 action2 = read2.nextInt();
                    if (action2 == 1) {
                 p1.useHpPotion();
                 } 
                    else if(action2 == 2){
                 p1.useMpPotion();
                 } 
                    else if(action2 == 3){
                     p1.useExpPotion();
                 }
                    else if(action2 == 0){
                            break;
                 }
                    
               }

            }
               }
        }
        }

    

