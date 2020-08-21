
public class Introduce {
	public static void main(String[] args) {
		Character s = new Character(30,1,"照");
		Character n = new Character(2,9,"翔太");
		Character o = new Character(10,5,"大介");
		Character w = new Character(20,7,"ふっか");

		s.introduce();
		n.introduce();
		o.introduce();
		w.introduce();
		System.out.println("----"+o.name+"と、"+w.name+"は戦いを始めたようだ。");
		o.fight();
		w.fight();
	}


}
