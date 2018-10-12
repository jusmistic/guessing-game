import javax.swing.JOptionPane;
public class GameDialog {
    public static void main(String[] args) {
        NumberGame game = new FocusGame(100);
        while(true) {
            String title = "Guessing Number";
            String message = "Input your guessing number from 1-" + game.getUpperBound();
            int type = JOptionPane.QUESTION_MESSAGE;
            String reply = JOptionPane.showInputDialog(null, message, title, type);
            if (reply == null) {
                break;
            } else {
                boolean check = game.guess(Integer.parseInt(reply));
                if(check){
                    type = JOptionPane.INFORMATION_MESSAGE;
                    message = game.getMessage();
                    message += " You count " + game.getCount()+ " Times";
                    title = "Answer";
                    JOptionPane.showMessageDialog(null, message, title, type);
                    type = JOptionPane.YES_NO_OPTION;
                    message = "You want to play again?";
                    title = "Answer";
                    int opt  = JOptionPane.showConfirmDialog(null, message, title, type);
                    if(opt == JOptionPane.YES_OPTION){
                        game = new FocusGame(100);
                        continue;

                    } else {
                        break;
                    }
                }
                else{
                    type = JOptionPane.WARNING_MESSAGE;
                }
                message = game.getMessage();
                title = "Answer";
                JOptionPane.showMessageDialog(null, message, title, type);
            }
        }
    }
}
