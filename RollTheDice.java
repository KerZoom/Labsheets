import javax.swing.*;

public class RollTheDice {
    public static void main(String[] args) {
        int draws = 0, playerWin = 0, compWin = 0;
        boolean playing = true;
        String input = "";

        do{
            if (input.equals("no")){
                playing = false;
            }
            else{
                JOptionPane.
            }

            input = JOptionPane.showInputDialog("Do you want to keep playing? (no to exit)");
        }while (playing);

    }
    static char diceRoll(){
        int player, computer;
        char winner = ' ';
        player = (int)(Math.random()*12);
        computer = (int)(Math.random()*12);
        if (player > computer)
            winner = 'p';
        else if (player < computer)
            winner = 'c';
        else
            winner = 'd';
        return winner;
    }
}
