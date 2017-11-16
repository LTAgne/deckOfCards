import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *  Class that creates a new Deck of Cards. 
 *  Includes methods to deal one card from the deck as well as shuffle the cards in the deck. 
 * @author laurenagne
 */

public class Deck {

	
	/**
	 * List to contain all the Card Objects that make a full deck.
	 */
	private List<Card> deckOfCards = new ArrayList<>();  
	
	
	/**
	 * Deck method will create a new deck of cards. 
	 * Each Card will then be added to the list called deckOfCards.
	 */
	public Deck(){
		for(String suit : Card.ALL_SUITS){
			for(String rank : Card.ALL_RANKS){
				deckOfCards.add(new Card(suit, rank));
			}
		}
	}

	
	/**
	 * dealOne method will remove one card from the deck and return it.
	 * If the deck is out of cards the method will return null. 
	 * @return Card, or null if deck is empty
	 */
	public Card dealOne(){
		if (! deckOfCards.isEmpty()){
		return deckOfCards.remove(0);
		} else {
			return null;
		}
	}

	/**
	 * Method that will shuffle (randomize) the order of the Card Objects currently within the deck. 
	 */
	public void shuffle(){
		Collections.shuffle(deckOfCards);
	}
	
}
	
