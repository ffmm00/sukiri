public class Wand {

	private String name;
	private double power;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		if (name == null || name.length() < 3) {
			throw new IllegalArgumentException("杖に設定される名前の長さが異常です");
		}
		this.name = name;
	}

	public double getPower() {
		return this.power;
	}

	public void setPower(double power) {
		if (power < 0.5 || 100 < power) {
			throw new IllegalArgumentException("杖に設定される魔力が異常です");
		}
		this.power = power;
	}

}
