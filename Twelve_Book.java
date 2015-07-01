public class Twelve_Book extends Twelve_TangibleAsset {

	private String isbn;

	public Twelve_Book(String name, int price, String color, String isbn) {
		super(name, price, color);
		this.isbn = isbn;
	}

	public String getIsbn() {
		return this.isbn;
	}

}
