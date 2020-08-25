
public class Character {
	private int hp;
	private int magicpower;
	private String name;

	public Character(int hp, int maryoku, String name) {
		this.hp = hp;
		this.magicpower = maryoku;
		this.name = name;
	}
	public String getName() {
		return name;
	}


	public void introduce() {
		System.out.println("私の名前は"+name+"。体力は"+hp+"あり、魔力の保有量は、"+magicpower+"です。");
	}
	public void fight() {
		hp-=1;
		System.out.println(name+"は、戦いにより体力が減り、"+hp+"になりました。");
	}
}