public class RPG{
    public static void main(String[] args){
        System.out.println("RPGだお");

        Human[] party = new Human[2];

        party[0] = new Brave("ヨシヒコ", 0, 10, 0, -110);
        party[1] = new Monk("ムラサメ", 1, 1000, 100);

        party[0].getDamage(10);
        System.out.println("ヨシヒコの体力は" + party[0].getHp());
        party[1].getDamage(10);
        System.out.println("ムラサメの体力は" + party[1].getHp());
    }
}