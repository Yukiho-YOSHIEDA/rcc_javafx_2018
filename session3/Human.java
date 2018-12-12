public class Human{
    protected String name; // 名前
    protected int gender; // 性別:男0,女1,その他2
    protected int HP; // 体力
    protected int MP; // 魔力

	public int getMp(){
		return this.MP;
	}

	public void setMp(int MP){
		this.MP = MP;
	}


	public int getHp()
	{
		return this.HP;
	}

	public void setHp(int HP)
	{
		this.HP = HP;
	}

	public int getGender()
	{
		return this.gender;
	}

	public void setGender(int gender)
	{
		this.gender = gender;
	}


	public String getName()
	{
		return this.name;
	}

	public void setName(String name)
	{
		this.name = name;
	}


    /**
     * コンストラクタ
     *
     * @param name 名前
     * @param gender 性別
     * @param HP 体力
     * @param MP 魔力
     */
    public Human(String name, int gender, int HP, int MP){
        this.name = name;
        this.gender = gender;
        this.HP = HP;
        this.MP = MP;
    }

    /**
     * ダメージを受けました
     *
     * @param attack 攻撃力
     */
    public void getDamage(int attack){
        this.HP -= attack;
    }
}