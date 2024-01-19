package student;
/**
 * By Max Locketz.
 * CSCI 1913, 10/25/23
 */
public class Deck {
    /**
     * @var newDeck Card[] an array of cards representing the deck, DECK_LENGTH long.
     */
    private Card[] newDeck = new Card[52];
    /**
     * @var cardsDrawn represents the number of cards drawn from the deck.
     * Helps to track what card to draw next and when the deck is empty.
     */
    private int cardsDrawn = -1;

    /**
     * Constructs a new deck.
     */
    public Deck() {
        for (int suit = 1; suit <= 4; suit++) {
            for (int rank = 1; rank <= 13; rank++) {
                Card newCard = new Card(rank, suit);
                newDeck[(13 * (suit - 1)) + (rank - 1)] = newCard;
            }
        }
        shuffle();
    }

    /**
     * Randomly shuffles the deck.
     */
    public void shuffle() {
        for (int i = newDeck.length - 1; i > 0; i--) {
            int j = (int) (Math.random() * i);
            Card temp = newDeck[i];
            newDeck[i] = newDeck[j];
            newDeck[j] = temp;
        }
    }

    /**
     * Draws the next card from the top of the deck.
     * If the deck is empty, shuffles a new deck and draws from that.
     * @return -- the card drew
     */
    public Card draw() {
        if (isEmpty()) {
            shuffle();
            cardsDrawn = 0;
            return newDeck[0];
        } else {
            cardsDrawn++;
            return newDeck[cardsDrawn];
        }
    }

    /**
     * Finds how many cards are remaining in the deck.
     * @return the total number of cards in a deck minus the cards drawn.
     */
    public int cardsRemaining() {
        return 52 - (cardsDrawn + 1);
    }

    /**
     * Determines if the deck is out of cards.
     * @return boolean indicating if the deck is empty
     */
    public boolean isEmpty() {
        return cardsRemaining() == 0;
    }
}
