import javax.swing.*;

public class NumbersMenu {
    public static void main(String[] args) {
        float factorial;
        int number, choice, iteration = 1;

        do {
            number = Math.round(Float.parseFloat(JOptionPane.showInputDialog("----Iteration " + iteration + " -----\n\nPlease enter a whole number")));
            choice = Math.round(Float.parseFloat(JOptionPane.showInputDialog("""
                    What would you like to do?

                    1.Determine if the number is odd or even
                    2.Find the factorial of the number
                    3.Quit the program

                    Please enter your choice:""")));

            switch (choice){
                case (1):
                    if (number % 2 == 0)
                        JOptionPane.showMessageDialog(null,"The number you entered is even","Number data", JOptionPane.INFORMATION_MESSAGE);
                    else
                        JOptionPane.showMessageDialog(null,"The number you entered is odd","Number data", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case (2):
                    if (!(number < 0)) {
                        factorial = number;
                        for (int i = 1; i < number; i++) {
                            factorial *= (number - i);
                        }
                        for (int i = number; i == 1; i--) {
                            factorial *= i;
                        }
                        JOptionPane.showMessageDialog(null, "The factorial is " + factorial, "Number data", JOptionPane.INFORMATION_MESSAGE);
                    }
                    else
                        JOptionPane.showMessageDialog(null, "A factorial cannot use a negative number", "Number data", JOptionPane.ERROR_MESSAGE);
                    break;
                case (3):
                    JOptionPane.showMessageDialog(null,"Exiting program, goodbye!","Number data", JOptionPane.INFORMATION_MESSAGE);
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Please enter a valid number","Number data", JOptionPane.ERROR_MESSAGE);
            }
            iteration++;
        }while(choice != 3);
    }
}
