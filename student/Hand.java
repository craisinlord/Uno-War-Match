package student;
/**
 * By Max Locketz.
 * CSCI 1913, 10/25/23
 */
public class Hand {
    /**
     * @var Deck deck
     */
    private Deck deck;
    /**
     * @var int size
     */
    private int size;
    /**
     * @var Array of cards, hand
     */
    private Card[] hand;

    /**
     * Constructs a new hand with a given deck and hand size.
     * @param deck
     * @param size
     */
    public Hand(Deck deck, int size) {
        this.deck = deck;
        this.size = size;
        hand = new Card[size];
        for (int i = 0; i < size; i++) {
            hand[i] = deck.draw();
        }
    }

    /**
     * Returns the size of the hand.
     * @return int size
     */
    public int getSize() {
        return size;
    }

    /**
     * Gets the card in the hand at index i.
     * @param i
     * @return the index the card is found out
     */
    public Card get(int i) {
        try {
            return hand[i];
        } catch (Exception invalidHandIndex) {
            System.out.println("Invalid hand index!");
            return hand[0];
        }
    }

    /**
     * Finds a card in a hand and removes it.
     * Replaces it with a new card drawn from the deck.
     * @param card -- card to be searched for
     * @return a boolean indicating weather the card was removed
     */
    public boolean remove(Card card) {
        for (int i = 0; i < hand.length; i++) {
            if (card.equals(hand[i])) {
                hand[i] = deck.draw();
                return true;
            }
        }
        return false;
    }
}
