public class PoisonMatango extends Matango {

	private int poison = 5;

	public PoisonMatango(char suffix) {
		super(suffix);
	}

	public void attack(Hero h) {

		super.attack(h);

		if (0 < poison) {
			System.out.println("さらに毒の胞子をばらまいた");
			int t = h.gethp * 0.2;
			h.sethp(h.getHp() - t);
			System.out.println(t + "ポイントのダメージ");
			this.poison--;

		}
	}
}
