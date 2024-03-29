/**
 * The Zeffit is a character whose purpose is to attack Groks and eliminate them.
 * When Zeffits take a hit, they turn green.  When they take a second hit, Zeffits turn blue.
 * When they take a third hit, Zeffits turn red.  The fourth hit makes them explode in a fiery
 * death!
 *
 * @author (you)
 * @version (a version number or a date)
 */
public class Zeffit
{
    // TODO: add final variables
    final static int MAX_HITS = 4;

    // TODO: add instance variable(s)
    int numOfHits = 0;

    /**
     * Constructor for objects of class Zeffit
     */
    public Zeffit()
    {
        // TODO: initialize instance variable(s)
        int hits = numOfHits;
    }

    /**
     * Inflicts or registers a hit on this Zeffit.
     *
     */
    public void takesHit()
    {
        // TODO: replace this line with your code
        numOfHits = numOfHits + 1;
    }

    /**
     * Indicates whether this Zeffit has taken no hits
     *
     * @return    true if this Zeffit has taken no hits; false otherwise.
     */
    public boolean isHitFree()
    {
        // TODO: replace this line with your code
        return numOfHits == 0;
    }

    /**
     * Indicates whether this Zeffit has taken a hit
     *
     * @return    true if this Zeffit has taken a hit; false otherwise.
     */
    public boolean isGreen()
    {
        // TODO: replace this line with your code
        return numOfHits == 1;
    }

    /**
     * Indicates whether this Zeffit has taken two hits
     *
     * @return    true if this Zeffit has taken two hits; false otherwise.
     */
    public boolean isBlue()
    {
        // TODO: replace this line with your code
        return numOfHits == 2;
    }

    /**
     * Indicates whether this Zeffit has taken three hits
     *
     * @return    true if this Zeffit has taken three hits; false otherwise.
     */
    public boolean isRed()
    {
        // TODO: replace this line with your code
        return numOfHits == 3;
    }

    /**
     * Indicates whether this Zeffit has exploded in a fiery death!
     *
     * @return    true if this Zeffit is dead; false otherwise.
     */
    public boolean isDead()
    {
        // TODO: replace this line with your code
        return numOfHits == 4;
    }
}

