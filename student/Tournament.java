package student;
/**
 * By Max Locketz.
 * CSCI 1913, 10/25/23
 */
public class Tournament {
    /**
     * Main program.
     * @param args
     */
    public static void main(String[] args) {
        AI smol = new SmallestCardAI();
        AI big = new BiggestCardAI();
        AI ran = new AI();

        UnoWarMatch ranRanWar = new UnoWarMatch(ran, ran);
        match(ranRanWar);
        UnoWarMatch ranSmolWar = new UnoWarMatch(ran, smol);
        match(ranSmolWar);
        UnoWarMatch ranBigWar = new UnoWarMatch(ran, big);
        match(ranBigWar);

        UnoWarMatch smolRanWar = new UnoWarMatch(smol, ran);
        match(smolRanWar);
        UnoWarMatch smolSmolWar = new UnoWarMatch(smol, smol);
        match(smolSmolWar);
        UnoWarMatch smolBigWar = new UnoWarMatch(smol, big);
        match(smolBigWar);

        UnoWarMatch bigRanWar = new UnoWarMatch(big, ran);
        match(bigRanWar);
        UnoWarMatch bigSmolWar = new UnoWarMatch(big, smol);
        match(bigSmolWar);
        UnoWarMatch bigBigWar = new UnoWarMatch(big, big);
        match(bigBigWar);
    }

    /**
     * Given an uno war match, prints out the win rate of AI1 playing AI2 10 thousand times.
     * @param war
     */
    public static void match(UnoWarMatch war) {
        double winRate = war.winRate(10000);
        System.out.println(war.getAi1() + " vs. " + war.getAi2() + " winRate: " + winRate);
    }
}
