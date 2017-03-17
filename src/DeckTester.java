/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		String[] rank = {"2", "5", "1", "4"};
		String[] suit = {"heart", "diamond"};
		int[] value = {2, 5, 1};
		
		Deck deck1 = new Deck(rank, suit, value);
		System.out.println(deck1.size());
	}
}
