package ca.sheridancollege.project;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CardTest {

    public CardTest() {
    }

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
    }

    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getSuit method, of class Card.
     */
    @Test
    public void testGetSuit() {
        System.out.println("getSuit");
        Card instance = new Card(Rank.ACE, Suit.SPADES);
        Suit expResult = Suit.SPADES;
        Suit result = instance.getSuit();
        assertEquals(expResult, result);
    }

    /**
     * Test of getRank method, of class Card.
     */
    @Test
    public void testGetRank() {
        System.out.println("getRank");
        Card instance = new Card(Rank.ACE, Suit.SPADES);
        Rank expResult = Rank.ACE;
        Rank result = instance.getRank();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCard method, of class Card.
     */
    @Test
    public void testGetCard() {
        System.out.println("getCard");
        Card instance = new Card(Rank.ACE, Suit.SPADES);
        String expResult = "AS";
        String result = instance.getCard();
        assertEquals(expResult, result);
    }

    /**
     * Test of compareTo method, of class Card.
     */
    @Test
    public void testCompareTo() {
        System.out.println("compareTo");
        Card instance1 = new Card(Rank.ACE, Suit.SPADES);
        Card instance2 = new Card(Rank.KING, Suit.HEARTS);
        int expResult = 1; // ACE > KING
        int result = instance1.compareTo(instance2);
        assertEquals(expResult, result);
    }

    /**
     * Test of isSameSuit method, of class Card.
     */
    @Test
    public void testIsSameSuit() {
        System.out.println("isSameSuit");
        Card instance1 = new Card(Rank.ACE, Suit.SPADES);
        Card instance2 = new Card(Rank.KING, Suit.SPADES);
        boolean expResult = true;
        boolean result = instance1.isSameSuit(instance2);
        assertEquals(expResult, result);
    }

    /**
     * Test of isSameRank method, of class Card.
     */
    @Test
    public void testIsSameRank() {
        System.out.println("isSameRank");
        Card instance1 = new Card(Rank.ACE, Suit.SPADES);
        Card instance2 = new Card(Rank.ACE, Suit.HEARTS);
        boolean expResult = true;
        boolean result = instance1.isSameRank(instance2);
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class Card.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Card instance = new Card(Rank.ACE, Suit.SPADES);
        String expResult = "Ace of Spades";
        String result = instance.toString();
        assertEquals(expResult, result);
    }

    /**
     * Test of getSuitLetter method, of class Card.
     */
    @Test
    public void testGetSuitLetter() {
        System.out.println("getSuitLetter");
        Card instance = null;
        String expResult = "";
        String result = instance.getSuitLetter();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRankLetter method, of class Card.
     */
    @Test
    public void testGetRankLetter() {
        System.out.println("getRankLetter");
        Card instance = null;
        String expResult = "";
        String result = instance.getRankLetter();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCardPoints method, of class Card.
     */
    @Test
    public void testGetCardPoints() {
        System.out.println("getCardPoints");
        Card instance = null;
        Integer expResult = null;
        Integer result = instance.getCardPoints();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Card.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        Card instance = null;
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
