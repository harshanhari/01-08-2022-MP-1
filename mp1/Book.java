package mp1;

public class Book {
	String isbn;
	String name;
	Author author;
	Double price;
	int qty = 0;

	public Book(String isbn, String name, Author author, Double price) {
		this.isbn = isbn;
		this.name = name;
		this.author = author;
		this.price = price;
	}

	public Book(String isbn, String name, Author author, Double price, int qty) {
		this.isbn = isbn;
		this.name = name;
		this.author = author;
		this.price = price;
		this.qty = qty;
	}

	public String getIsbn() {
		return isbn;
	}

	public String getName() {
		return name;
	}

	public Author getAuthor() {
		return author;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", name=" + name + ", author=" + author + ", price=" + price + ", qty=" + qty
				+ "]";
	}

}
