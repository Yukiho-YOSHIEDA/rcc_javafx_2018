public class Skill{
    private String name;
    private int power;

    public Skill(String name, int power){
        this.name = name;
        this.power = power;
    }

    @Override
    public String toString(){
        return "名前：" + name + " " + "攻撃力：" + power;
    }
}