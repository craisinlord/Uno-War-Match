package student;
/**
 * By Max Locketz.
 * CSCI 1913, 10/25/23
 */
public class UnoWarMatch {
    /**
     * @var AI ai1
     */
    private AI ai1;
    /**
     * @var AI ai2
     */
    private AI ai2;

    /**
     * Constructs a game of Uno War with 2 given AIs.
     * @param aiOne
     * @param aiTwo
     */
    public UnoWarMatch(AI aiOne, AI aiTwo) {
        ai1 = aiOne;
        ai2 = aiTwo;
    }

    /**
     * Returns the first AI.
     * @return ai1
     */
    public AI getAi1() {
        return ai1;
    }

    /**
     * Returns the second AI.
     * @return ai2
     */
    public AI getAi2() {
        return ai2;
    }

    /**
     * Plays the game of uno war with 2 AI.
     * @return boolean indicating whether AI1 won.
     */
    public boolean playGame() {
        int ai1Wins = 0;
        int ai2Wins = 0;
        int nextPlayer = 1;
        Deck deck = new Deck();
        Hand ai1Hand = new Hand(deck, 5);
        Hand ai2Hand = new Hand(deck, 5);
        Card play;
        while (ai1Wins < 10 && ai2Wins < 10) {
            CardPile pile = new CardPile(deck.draw());
            while (true) {
                if (nextPlayer == 1) {
                    nextPlayer = 2;
                    play = ai1.getPlay(ai1Hand, pile);
                    if (play == null) {
                        ai2Wins++;
                        break;
                    }
                    ai1Hand.remove(play);
                } else {
                    nextPlayer = 1;
                    play = ai2.getPlay(ai2Hand, pile);
                    if (play == null) {
                        ai1Wins++;
                        break;
                    }
                    ai2Hand.remove(play);
                }
                pile.play(play);
            }
        }
        if (ai1Wins == 10) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Finds the win rate of AI1 for nTrials.
     * @param nTrials
     * @return double 0.00-1.00
     */
    public double winRate(int nTrials) {
        int ai1Wins = 0;
        for (int i = 0; i < nTrials; i++) {
            if (playGame()) {
                ai1Wins++;
            }
        }
        return ((double) ai1Wins / nTrials);
    }
}
