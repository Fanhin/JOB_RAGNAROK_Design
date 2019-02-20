import java.util.ArrayList;



/**
 * Item
 */
public class Item {
    private ArrayList<String> items1 = new ArrayList<String>();
    private ArrayList<String> items2 = new ArrayList<String>();
    private int defaultHpPotion=5;
    private int defaultMpPotion=5;
    private int defaultExpPotion=3;

    public void addPostion() {
        items1.add("Hp potion");
        items1.add("Mp potion");
        items1.add("Exp potion");
        //items1.add("Uplevel potion");
    }

    public int HpAmount(){
        return defaultHpPotion=defaultHpPotion-1;
    }
    public int MpAmount(){
        return defaultMpPotion=defaultMpPotion-1;
    }
    public int ExpAmount(){
        return defaultExpPotion=defaultExpPotion-1;
    }

    public int upHp() {
        return 10;
    }

    public int upMp() {
        return 5;
    }
    public int upExp() {
        return 2;
    }

    public void garbageList() {
        items2.add("leaf");
        items2.add("Stone");
        items2.add("Iron");
        items2.add("Meat");
        items2.add("Empty Bottle");

    }

    public void showpotionList() {
        System.out.println("1."+items1.get(0)+" "+defaultHpPotion);
        System.out.println("2."+items1.get(1)+" "+defaultMpPotion);
        System.out.println("3."+items1.get(2)+" "+defaultExpPotion);
        System.out.println("0.Exit!!");

    }
}
