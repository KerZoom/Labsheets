import javax.swing.*;

public class PlanetGravity {
    public static void main(String[] args){
        final double earthGravity = 9.81f;

        double planetMass = Double.parseDouble(JOptionPane.showInputDialog("Please enter the mass of the planet: "));
        double earthMass = Double.parseDouble(JOptionPane.showInputDialog("Please enter the mass of the earth: "));
        double earthRadius = Double.parseDouble(JOptionPane.showInputDialog("Please enter the radius: "));
        double planetRadius = Double.parseDouble(JOptionPane.showInputDialog("Please enter the radius: "));
        double gravity = (earthGravity * planetMass * (earthRadius * earthRadius)) / (earthMass * (planetRadius * planetRadius));
        JOptionPane.showMessageDialog(null,"The acceleration due to gravity on the other planet is " +
                String.format("%.2f%s", gravity," ms"),"Result", JOptionPane.INFORMATION_MESSAGE);
    }
}
