package ca.sheridancollege.project;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

public class DeckTest {

    @Test
    public void testShuffleDeck() {
        // Create a new deck
        Deck deck = new Deck();

        // Shuffle the deck
        deck.shuffleDeck();

        // To verify if the deck is shuffled properly, we can't use direct assertions.
        // We can check if the order of cards before and after shuffling is different.
        List<Card> beforeShuffle = deck.getCards();
        deck.shuffleDeck();
        List<Card> afterShuffle = deck.getCards();

        assertNotEquals(beforeShuffle, afterShuffle);
    }

    @Test
    public void testGetCards() {
        // Create a new deck
        Deck deck = new Deck();

        // Get the cards from the deck
        List<Card> cards = deck.getCards();

        // Verify that the list of cards is not null
        assertNotNull(cards);
        // Verify that the list of cards is not empty
        assertFalse(cards.isEmpty());
    }

    @Test
    public void testGetCardsCount() {
        // Create a new deck
        Deck deck = new Deck();

        // Get the count of cards in the deck
        int count = deck.getCardsCount();

        // Verify that the count is correct (standard deck has 52 cards)
        assertEquals(52, count);
    }

    @Test
    public void testDealCard() {
        // Create a new deck
        Deck deck = new Deck();

        // Deal a card from the deck
        Card card = deck.dealCard();

        // Verify that the dealt card is not null
        assertNotNull(card);
        // Verify that the deck has one less card after dealing
        assertEquals(51, deck.getCardsCount());
    }

    @Test
    public void testAddCard() {
        // Create a new deck
        Deck deck = new Deck();

        // Add a card to the deck
        Card card = new Card(Card.Rank.ACE, Card.Suit.HEARTS);
        deck.addCard(card);

        // Verify that the card is added to the deck
        assertTrue(deck.getCards().contains(card));
    }

    @Test
    public void testToString() {
        // Create a new deck
        Deck deck = new Deck();

        // Convert the deck to a string
        String deckString = deck.toString();

        // Verify that the string representation is not null
        assertNotNull(deckString);
        // Verify that the string representation is not empty
        assertFalse(deckString.isEmpty());
    }
}
