/**
 * Novice
 */
public class Novice {

    private int hp = 1000, mp = 500, exp = 0, money = 1000, level = 0;
    private String name, gender;
    private String head="STD", body="STD", legs="STD";
    private int itemLevel = 0;
    Bag bag = new Bag();

    public void showBag() {
        bag.showItem();
    }

    public void useHpPotion() {
        if (bag.dissHpPotion() <= 0) {
            System.out.println("Out of Potion");
        } else {
            hp = hp + bag.i1.upHp();
        }
    }

    public void useMpPotion() {
        if (bag.dissMpPotion() <= 0) {
            System.out.println("Out of Potion");
        } else {
            mp = mp + bag.i1.upMp();
        }

    }

    public void useExpPotion(){
        if (bag.dissExpPotion()<=0) {
            System.out.println("Out of Potion");
        }else{
            exp = exp + bag.i1.upExp();
        }
    }

    public void useExp() {
        if (bag.dissExpPotion() <= 0) {
            System.out.println("Out of Potion");
        } else {
            exp = exp + bag.i1.upExp();
        }
    }

    public Novice(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }

    public Novice(String head, String body, String shose) {
        this.head = "Empty";
        this.body = "Empty";
        this.legs = "Empty";
    }

    public Novice() {

    }

    public void reduceHp(int damageReceived) {
        hp = hp - damageReceived;
    }

    public void reduceMp(int manaUsed) {
        mp = mp - manaUsed;
    }

    public void showNovice() {
        System.out.println("[[[[[[[[[[STATUS]]]]]]]]]]");
        System.out.println("Name:" + name);
        System.out.println("Gender:" + gender);
        System.out.println("Level:" + level);
        System.out.println("Hp:" + hp);
        System.out.println("Mp:" + mp);
        System.out.println("EXP:" + exp);
        System.out.println("Money:" + money);
        System.out.println("[[[[[[[[[[CHARACTER]]]]]]]]]");
        System.out.println("HEAD"+"-" + head +" "+"+"+ itemLevel);
        System.out.println("BODY"+"-" + body +" "+"+"+itemLevel);
        System.out.println("LEGS"+"-" + legs +" "+"+"+ itemLevel);
    }
}