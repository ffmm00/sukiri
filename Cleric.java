import java.util.Random;

public class Cleric {
	static final int MAX_HP = 50;
	static final int MAX_MP = 10;

	String name;
	int hp = 50;
	int mp = 10;

	public Cleric(String name, int hp, int mp) {
		this.name = name;
		this.hp = hp;
		this.mp = mp;
	}

	public Cleric(String name, int hp) {
		this(name, hp, Cleric.MAX_MP);

	}

	public Cleric(String name) {
		this(name, MAX_HP);
	}

	public void selfAid() {
		this.mp -= 5;
		this.hp = this.MAX_HP;
	}

	public int pray(int sec) {
		int r = sec + new Random().nextInt(3);
		int R = Math.min(r, this.MAX_MP - this.mp);

		this.mp += R;
		return R;
	}
}
