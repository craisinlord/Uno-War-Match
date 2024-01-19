package student;
/**
 * By Max Locketz.
 * CSCI 1913, 10/25/23
 */

public class Card {
    /**
     * @var rank
     */
    private int rank;
    /**
     * @var suit
     */
    private int suit;

    /**
     * Constructs a new playing card with a rank and suit.
     * @param rank -- the card's rank, 1-13
     * @param suit -- the card's suit, 1-4
     *             1: Spades
     *             2: Clubs
     *             3: Hearts
     *             4: Diamonds
     */
    public Card(int rank, int suit) {
        if (rank < 1 || rank > 13 || suit < 1 || suit > 4) {
            this.rank = 1;
            this.suit = 1;
            System.out.println("Invalid Card");
        } else {
            this.rank = rank;
            this.suit = suit;
        }
    }

    /**
     * Returns the rank of a given card.
     * @return -- rank integer
     */
    public int getRankNum() {
        return rank;
    }

    /**
     * Returns the name of rank of a given card.
     * @return -- rank string
     */
    public String getRankName() {
        if (rank == 1) {
            return "Ace";
        } else if (rank == 2) {
            return "Two";
        } else if (rank == 3) {
            return "Three";
        } else if (rank == 4) {
            return "Four";
        } else if (rank == 5) {
            return "Five";
        } else if (rank == 6) {
            return "Six";
        } else if (rank == 7) {
            return "Seven";
        } else if (rank == 8) {
            return "Eight";
        } else if (rank == 9) {
            return "Nine";
        } else if (rank == 10) {
            return "Ten";
        } else if (rank == 11) {
            return "Jack";
        } else if (rank == 12) {
            return "Queen";
        } else if (rank == 13) {
            return "King";
        }
        return null;
    }

    /**
     * Returns the name of the suit of a given card.
     * @return -- String suit
     */
    public String getSuitName() {
        if (suit == 1) {
            return "Spades";
        } else if (suit == 2) {
            return "Hearts";
        } else if (suit == 3) {
            return "Clubs";
        } else if (suit == 4) {
            return "Diamonds";
        }
        return null;
    }

    /**
     * Returns a string of the card's rank and suit.
     * @return -- String
     */
    public String toString() {
        return (getRankName() + " of " + getSuitName());
    }

    /**
     * Returns boolean indicating if 2 cards at the same.
     * @return -- boolean
     * @param obj -- Object card being compared to instance card
     */
    public boolean equals(Object obj) {
        if (obj instanceof Card) {
            return this.rank == ((Card) obj).rank && this.suit == ((Card) obj).suit;
        }
        return false;
    }
}
