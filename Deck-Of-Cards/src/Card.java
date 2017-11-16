import java.util.Arrays;

public class Card {

	/**
	 * ALL_SUITS is a constant String of the possible suits a Card object can have.  
	 */
	final static public String[] ALL_SUITS = {"H", "S", "D", "C"};
	
	/**
	 * ALL_RANKS is a constant String of the possible ranks a Card object can have.
	 */
	final static public String[] ALL_RANKS = {"A", "2", "3", "4", "5","6", "7", "8", "9", "10", "J", "Q", "K"};
	
	private String suit; 
	private String rank; 
	
	 
	/**
	 * To create a card a suit and a rank are required parameters - 
	 * these parameters must also match a possible card rank & suit combination. 
	 * If either parameter is not contained in the ALL_SUITS or ALL_RANKS an Illegal Argument Exception is returned. 
	 * @param suit String that is one of the possible suit options from ALL_SUITS
	 * @param rank String that is one of the possible suit options from ALL_RANKS
	 */
	public Card(String suit, String rank){
		if(Arrays.asList(ALL_SUITS).contains(suit) && Arrays.asList(ALL_RANKS).contains(rank)){
			this.suit = suit; 
			this.rank = rank; 
		} else {
			throw new IllegalArgumentException();
		}	
	}

	public String getSuit() {
		return suit;
	}

	public String getRank() {
		return rank;
	}

}
