public abstract class Twelve_TangibleAsset extends Twelve_Asset implements Twelve_Thing {

	private String color;
	private double weight;

	public Twelve_TangibleAsset(String name, int price, String color) {
		super(name, price);
		this.color = color;
	}

	public String getColor() {
		return this.color;
	}

	public double getWeight() {
		return this.weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

}
