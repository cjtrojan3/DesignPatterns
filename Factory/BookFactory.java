public class BookFactory {

	public Book createBook(String genre) {
		if(genre.equals("Horror")) {
			return (new HorrorBook());
		}
		else if(genre.equals("Fantasy")) {
			return (new FantasyBook());
		}
		else if(genre.equals("Romance")) {
			return (new RomanceBook());
		}
		else {
			return null;
		}
	}
}
