public class Twelve_Computer extends Twelve_TangibleAsset {

	private String makerName;

	public Twelve_Computer(String name, int price, String color, String makerName) {
		super(name, price, color);
		this.makerName = makerName;
	}

	public String getMakerName() {
		return this.makerName;
	}

}

