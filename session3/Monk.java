public class Monk extends Human {
    public Monk(String name, int gender, int HP, int MP){
        super(name, gender, HP, MP);
    }

    public void Meisou(){
        System.out.println("僧侶は寝た");
        this.HP += 10;
    }

    public void Meisou(int life){
        System.out.println("僧侶は寝た");
        this.HP += life;
    }

    @Override
    public void getDamage(int attack){
        this.HP -= attack * 3;
    }
}