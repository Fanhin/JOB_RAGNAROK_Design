/**
 * Novice
 */
public class Novice {
    protected String skill;
    protected int hp, mp , exp, money, level ;
    private String name, gender;
    private String head="STD", body="STD", legs="STD";
    private int itemLevel = 0;
    Bag bag = new Bag();

    

    //////Novice detail//////

    
    public Novice(String name, String gender) {
        this.name = name;
        this.gender = gender;
        this.hp = 1000;
        this.mp = 500;
        this.exp = 0;
        this.money =1000;
        this.level = 0;
    }
    ////Constructor for CHARACTER
    public void characterOfNovice(String head, String body, String shose) {
        this.head = "Empty";
        this.body = "Empty";
        this.legs = "Empty";
    }

    public void upLevel(){
        level++;
    }
    


    public void showNovice() {
        System.out.println("ooooooooooooooooooooooooo");
        System.out.println("----------STATUS---------");
        System.out.println("ooooooooooooooooooooooooo");
        System.out.println("Name:" + name);
        System.out.println("Gender:" + gender);
        System.out.println("Level:" + level);
        System.out.println("Hp:" + hp);
        System.out.println("Mp:" + mp);
        System.out.println("EXP:" + exp);
        System.out.println("Money:" + money);

        System.out.println("ooooooooooooooooooooooooopppp");
        System.out.println("----------CHARACTER----------");
        System.out.println("ooooooooooooooooooooooooooooo");
        System.out.println("HEAD"+"-" + head +" "+" +"+ itemLevel);
        System.out.println("BODY"+"-" + body +" "+"+"+ itemLevel);
        System.out.println("LEGS"+"-" + legs +" "+"+"+ itemLevel);
    }
}