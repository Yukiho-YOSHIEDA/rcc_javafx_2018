public class Pokemon{
    private String name;
    private int hp;
    private int mp;
    private int lv;
    private Skill[] skills;

    public Pokemon(String name, int lv, int hp, int mp){
        this.name = name;
        this.lv = lv;
        this.hp = hp;
        this.mp = mp;
        skills = new Skill[4];
        skills[0] = new Skill("たいあたり", 10);
    }

    public void viewInformation(){
        System.out.println("----------");
        System.out.println("名前：" + name);
        System.out.println("レベル：" + lv);
        System.out.println("体力：" + hp);
        System.out.println("精神力：" + mp);
        for(int i = 0; i < skills.length; i++){
            if(skills[i] != null){
                System.out.println("技" + i + "：");
                System.out.println("  " + skills[i].toString());
            }
        }
        System.out.println("----------");
    }
}