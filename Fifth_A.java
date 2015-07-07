public class Fifth_A {

	public static void main(String[] args) {

		try {
			String s = null;
			System.out.println(s.length());
		} catch (NullPointerException e) {
			System.out.println("NullPointerException例外をcatchしました");
			System.out.println("ーースタックトレースここからーー");

			e.printStackTrace();
			System.out.println("ーースタックトレースここまでーー");

		}
	}
}
