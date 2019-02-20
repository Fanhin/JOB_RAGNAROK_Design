/**
 * Bag
 */
public class Bag {
    
    Item i1 = new Item();

    public void showItem() {
        i1.showpotionList();
    }

    public int dissHpPotion() {
        return i1.HpAmount();
    }
    public int dissMpPotion() {
       return i1.MpAmount();
    }
    public int dissExpPotion() {
       return i1.ExpAmount();
    }

}