import java.util.ArrayList;
/**
 * Potions
 */
public class MonsterEgg extends Item{
    
    
    private ArrayList<String> monsterLists;

    public MonsterEgg(){
        super(2,"MonsterEgg",1);
        monsterLists = new ArrayList<String>();
    }

    public void addEggLists(){
        monsterLists.add("Dragon Egg");
        monsterLists.add("Golem Egg");
        monsterLists.add("Poring Egg");
    }

    public void getEggAmont(){
        getAmount();
    }

    public void showMonsterLists(){
        System.out.println("The is lists of Monster<RANDOM>");
        for (String monsterList : monsterLists) {
            System.out.println(monsterList);
        }
    }
  
}