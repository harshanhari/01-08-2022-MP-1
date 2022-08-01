package mp1;

public class Qus3 {

	public static void main(String[] args) {

		Author a1 = new Author("Jaims john", "jaimsjohn@gmail.com");
		Author a2 = new Author("Robert Bore", "robertbore@gmail.com");

		Book b1 = new Book("01", "Tails of john", a1, 200.00);
		Book b2 = new Book("02", "Major", a2, 250.00, 5);
		System.out.println(b1.toString());
		System.out.println(b2.toString());

	}

}
