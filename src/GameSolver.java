import java.util.Random;
public class GameSolver {
    public static int play(NumberGame game){
        int upperBound = game.getUpperBound();
        int lowerBound = 1;
        Random rand = new Random();
        int value = rand.nextInt(upperBound)+lowerBound;
        while(true){
            boolean check = game.guess(value);
            if(check){
                break;
            }
            if(game.getMessage().equals("too small")){
                lowerBound = value;
            }
            if(game.getMessage().equals("too large")){
                upperBound = value;
            }
            value = rand.nextInt(upperBound)+lowerBound;
        }
        return value;
    }



    public static void main(String[] args) {
        NumberGame game = new FocusGame(100);
        int num = play(game);
        System.out.println("Correct Number is "+num);

    }


}
