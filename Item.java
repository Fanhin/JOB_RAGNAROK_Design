import java.util.ArrayList;

/**
 * Item
 */
public class Item {
        
    private int itemId;
    private String name; 
    String detail;
    private int amount;

    public Item(){

    }

    public int hpHeal(){
        return 10;
    }

    public Item(int itemId,String itemName,int amountItemFound) {
            this.itemId = itemId;
            this.name = itemName;
            this.amount=amountItemFound;
    }
    public int getAmount(){
        return amount;
    }
    public String getName(){
        return name;
    }
    public void Detail(){
        detail =("The potion will heal your "+name);
    }
    


    


}
