package student;
/**
 * By Max Locketz.
 * CSCI 1913, 10/25/23
 */

public class CardPile {
    /**
     * @var Card topCard, indicates the top card of the pile
     */
    private Card topCard;
    /**
     * @var int size, indicates the size of the card pile
     */
    private int size = 1;

    /**
     * Constructs a new card pile with a given top card.
     * @param topCard
     */
    public CardPile(Card topCard) {

        this.topCard = topCard;
    }

    /**
     * Determines if a card is a valid play.
     * @param card
     * @return boolean indicating if it can be played
     */
    public boolean canPlay(Card card) {
        if (card == null) {
            return false;
        } else if (topCard == null) {
            return true;
        } else if (card.getSuitName().equals(topCard.getSuitName()) || card.getRankNum() >= topCard.getRankNum()) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Plays a card onto the card pile, making it the new top card.
     * Increases the card pile size by 1.
     * @param card
     */
    public void play(Card card) {
        if (!canPlay(card)) {
            System.out.println("Illegal move detected!");
        } else {
            topCard = card;
            size++;
        }
    }

    /**
     * Given a card pile, returns the number of cards in the pile.
     * @return int size
     */
    public int getNumCards() {
        return size;
    }

    /**
     * Given a card pile, returns the top card of the pile.
     * @return card topCard
     */
    public Card getTopCard() {
        return topCard;
    }
}
