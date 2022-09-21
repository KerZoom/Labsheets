import javax.swing.*;

public class CyclistSponsor {
    public static void main(String[] args){
        final float lowRate = 1.75f, highRate = 2.5f;
        float total = 0;
        String name;
        int distanceCycled;

        JTextArea output = new JTextArea(3,20);
        name = JOptionPane.showInputDialog("Please enter your name");
        distanceCycled = Integer.parseInt(JOptionPane.showInputDialog("Please enter the number of km cycled"));

        if (distanceCycled > 10) {
            total = 10f * lowRate;
            total += (distanceCycled - 10) * highRate;
        }
        else
            total += distanceCycled * lowRate;

        output.append("Name: " + name + "\nDistance cycled: " + distanceCycled + "km\n" +
                "Sponsorship amount due: \u20ac" + Float.toString(total));
        JOptionPane.showMessageDialog(null,output,"Receipt", JOptionPane.INFORMATION_MESSAGE);
    }
}
