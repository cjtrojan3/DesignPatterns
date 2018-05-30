public class BookDriver {
	
	public static void main(String[] args) {
		BookFactory factory = new BookFactory();

		Book book1 = factory.createBook("Horror");
		System.out.println(book1.getGenre());

		Book book2 = factory.createBook("Romance");
		System.out.println(book2.getGenre());
	}
}
