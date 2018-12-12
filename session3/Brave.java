public class Brave extends Human{
    int money;

    public Brave(String name, int gender, int HP, int MP, int money){
        super(name, gender, HP, MP);
        this.money = money;
    }

    public void getMoney(int earn){
        this.money += earn;
    }

}