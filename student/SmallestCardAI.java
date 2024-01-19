package student;
/**
 * By Max Locketz.
 * CSCI 1913, 10/25/23
 */
public class SmallestCardAI extends AI {
    /**
     * Given a hand a cardpile, returns the smallest ranked card available to play from the hand.
     * @param hand -- the AIs current hand
     * @param cardPile -- the current card pile to play on
     * @return
     */
    @Override
    public Card getPlay(Hand hand, CardPile cardPile) {
        Card smallCard = super.getPlay(hand, cardPile);
        for (int i = 1; i < hand.getSize(); i++) {
            Card tempCard = hand.get(i);
            if (cardPile.canPlay(tempCard)) {
                if (tempCard.getRankNum() < smallCard.getRankNum()) {
                    smallCard = tempCard;
                }
            }
        }
        return smallCard;
    }

    /**
     * Prints the name of the AI.
     * @return
     */
    @Override
    public String toString() {
        return "Smallest Card AI";
    }
}
