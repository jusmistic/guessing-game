import java.util.Random;
public class GunGame extends NumberGame {
    private int upperBound;
    private  int secret;
    private int count = 0;


    public GunGame(int upperBound){
        this.upperBound = upperBound;
        Random rand = new Random();
        this.secret = rand.nextInt(50)+1;
        super.setMessage("I'm thinking of a number between 1 and " + Integer.toString(upperBound,10));
//        System.out.println(secret);

    }

    public int getCount(){
        return count;
    }

    @Override
    public int getUpperBound(){
        return this.upperBound;
    }
    @Override
    public boolean guess(int number){
    count++;

        if (number == secret) {
            super.setMessage("Correct!");
            return true;
        }
        else{
            if (number > this.secret){
                super.setMessage("Too large");
            }
            if (number < this.secret){
                super.setMessage("Too ssmall");
            }
            return false;
        }
    }
    @Override
    public String toString(){
        return  "Guess a secret number between 1 and "+Integer.toString(this.upperBound);
    }
}
