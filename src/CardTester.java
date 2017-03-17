/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		Card card1 = new Card ("2", "diamond", 2);
		Card card2 = new Card ("4", "heart", 4);
		Card card3 = new Card ("9", "heart", 9);
		Card card4 = new Card ("9", "heart", 9);
		
		System.out.println("card1 matches with card4: " + card1.matches(card4));
	}
}
