import java.util.Random;
public class GameSolver {
    public static int play(NumberGame game){
        int upperBound = game.getUpperBound();
        int lowerBound = 1;
        Random rand = new Random();
        int value = upperBound/2;
        while(true){
            boolean check = game.guess(value);
            if(check){
                break;
            }
            if(game.getMessage().equals("Too small")){
                lowerBound = value;
            }
            if(game.getMessage().equals("Too large")){
                upperBound = value;
            }
            value = rand.nextInt(upperBound)+lowerBound;
        }
        return value;
    }



    public static void main(String[] args) {
        NumberGame game = new GunGame(100);
        int num = play(game);
        System.out.println("Correct Number is "+num);


    }


}
