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
    }
    
    public void showItem(){
        System.out.println(items.get(0).getName() +" "+ items.get(0).getAmount());
        System.out.println(items.get(1).getName() +" "+ items.get(1).getAmount());
        System.out.println(items.get(2).getName() +" "+ items.get(2).getAmount());
    }
    

}