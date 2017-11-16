import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CardTest {

	public Card sut;
	
	@Before
	public void setUp() throws Exception {
		sut = new Card("H", "2");
	}

	@Test
	public void testSuit() {
		assertEquals("H", sut.getSuit());
	}

	@Test
	public void testRank() {
		assertEquals(2, sut.getRank());
	}

}
