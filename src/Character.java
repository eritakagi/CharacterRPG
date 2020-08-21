
public class Character {
	public int hp;
	public int MagicPower;
	public String name;

	public Character(int hp, int Maryoku, String name) {
		this.hp = hp;
		this.MagicPower = Maryoku;
		this.name = name;
	}


	public void introduce() {
		System.out.println("私の名前は"+name+"。体力は"+hp+"あり、魔力の保有量は、"+MagicPower+"です。");
	}
	public void fight() {
		hp-=1;
		System.out.println(name+"は、戦いにより体力が減り、"+hp+"になりました。");
	}
}