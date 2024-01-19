package student;
/**
 * By Max Locketz.
 * CSCI 1913, 10/25/23
 */
public class AI {
    /**
     * Given a hand a cardpile, returns the first card available to play from the hand.
     * @param hand -- the AIs current hand
     * @param cardPile -- the current card pile to play on
     * @return -- the first card in hand available to play
     */
    public Card getPlay(Hand hand, CardPile cardPile) {
        for (int i = 0; i < hand.getSize(); i++) {
            Card tempCard = hand.get(i);
            if (cardPile.canPlay(tempCard)) {
                return tempCard;
            }
        }
        return null;
    }
    /**
     * Prints the name of the AI.
     * @return String Random Card AI
     */
    public String toString() {
        return "Random Card AI";
    }
}
