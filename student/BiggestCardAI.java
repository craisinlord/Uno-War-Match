package student;
/**
 * By Max Locketz.
 * CSCI 1913, 10/25/23
 */
public class BiggestCardAI extends AI {
    /**
     * Given a hand a cardpile, returns the largest ranked card available to play from the hand.
     * @param hand -- the AIs current hand
     * @param cardPile -- the current card pile to play on
     * @return -- returns the largest ranked card available to play
     */
    @Override
    public Card getPlay(Hand hand, CardPile cardPile) {
        Card bigCard = super.getPlay(hand, cardPile);
        for (int i = 1; i < hand.getSize(); i++) {
            Card tempCard = hand.get(i);
            if (cardPile.canPlay(tempCard)) {
                if (tempCard.getRankNum() > bigCard.getRankNum()) {
                    bigCard = tempCard;
                }
            }
        }
        return bigCard;
    }

    /**
     * Prints the name of the AI.
     * @return String Biggest Card AI
     */
    @Override
    public String toString() {
        return "Biggest Card AI";
    }
}
