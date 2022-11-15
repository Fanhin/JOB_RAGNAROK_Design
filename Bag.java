import java.util.ArrayList;

/**
 * Bag
 */
public class Bag {

       private ArrayList<Item> items;
   

    public Bag() {
        items = new ArrayList<Item>();
    }

    public void addItem(){
        items.add(new Item(0,"HP Potion",5));
        items.add(new Item(1,"1-Hand Sword",1));
        items.add(new Item(2,"Monster Egg",1));
        items.add(new Item(2," Egg",1));
    }
    
    public void showItem(){
        System.out.println(items.get(0).getName() +" "+ items.get(0).getAmount());
        System.out.println(items.get(1).getName() +" "+ items.get(1).getAmount());
        System.out.println(items.get(2).getName() +" "+ items.get(2).getAmount());
    }
    

}