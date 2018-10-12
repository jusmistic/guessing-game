import java.util.Random;

/**
 * Game of guessing a secret number
 *
 * @author Focus
 */
public class FocusGame extends NumberGame {

    private int upperBound, secret, counter = 1;

    public FocusGame(int upperbound) {
        this.upperBound = upperbound;
        long seed = System.nanoTime();
        Random rand = new Random(seed);
// get a random number between 0 and 9. Add 1 so the value is 1 - 10.
        secret = rand.nextInt(upperBound) + 1;
        super.setMessage("I'm thinking of a number between 1 and " + upperBound);

    }

    public boolean guess(int number) {
        if (number == secret) {
            super.setMessage("correct");
            return true;
        }
        if (number < secret) {
            super.setMessage("too small");
        }
        if (number > secret) {
            super.setMessage("too large");
        }
        counter++;
        return false;
    }

    public int getUpperBound() {
        return upperBound;
    }

    public int getCount() {
        return counter;
    }

    @Override
    public String toString() {
        return "Guess a secret number"; //To change body of generated methods, choose Tools | Templates.
    }

}