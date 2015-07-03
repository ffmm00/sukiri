public class Thirte_main {

	public static void main(String[] args) {

		Thirte_Y[] array = new Thirte_Y[2];

		array[0] = new Thirte_A();
		array[1] = new Thirte_B();

		for (Thirte_Y y : array) {
			y.b();
		}

	}

}
