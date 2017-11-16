import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class DeckTest {

	Deck sut; 
	
	@Before
	public void setUp() throws Exception {
		sut = new Deck();
	}

	/**
	 * test will return true if the dealOne method returns a card.
	 */
	@Test
	public void testDealOne() {
		Card newCard= sut.dealOne();
		assertEquals(true, newCard instanceof Card);
	}
	
}
