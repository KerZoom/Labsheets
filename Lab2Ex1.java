import javax.swing.*;
import java.util.ArrayList;

public class Lab2Ex1 {
    public static void main(String[] args) {
        ArrayList<String> SerialNum = new ArrayList<>();
        ArrayList<Integer> DiskSpace = new ArrayList<>();
        ArrayList<String> Processor = new ArrayList<>();
        ArrayList<Float> Price = new ArrayList<>();

        String serial, disk, price;
        int avgDiskSpace = 0, iteration = 0, highestIndex = 0, lowestIndex = 0;
        boolean active = true;

        serial = JOptionPane.showInputDialog("Please enter the serial number(<Enter> to exit)");
        do{
            if (serial.isEmpty() && iteration > 0)
                active = false;
            else if (serial.isEmpty() && iteration == 0) {
                JOptionPane.showMessageDialog(null,"No date entered!","Goodbye!",JOptionPane.ERROR_MESSAGE);
                active = false;
            }
            else {
                SerialNum.add(serial);
                disk = JOptionPane.showInputDialog("Please enter the size of the disk");
                for (int i=0;i<disk.length();i++){
                    if (!(Character.isDigit(disk.charAt(i)))){
                        disk = JOptionPane.showInputDialog("Error, disk size can only be integer numbers, " +
                                "please re-enter disk size:", JOptionPane.ERROR_MESSAGE);
                        i = 0;
                    }
                }
                for (int i=0;i<disk.length();i++){
                    if (Integer.parseInt(disk) > 5000 || Integer.parseInt(disk) < 50){
                        disk = JOptionPane.showInputDialog("Error, disk size must be between 50 and 5000, " +
                                "please re-enter disk size:", JOptionPane.ERROR_MESSAGE);
                        i = 0;
                    }
                }
                DiskSpace.add(Integer.parseInt(disk));

                Processor.add(JOptionPane.showInputDialog("Please enter processor type"));
                price = JOptionPane.showInputDialog("Please enter the price of the processor");
                for (int i=0;i<price.length();i++){
                    if (!Character.isDigit(price.charAt(i)) && !(price.charAt(i) == '.')) {
                        price = JOptionPane.showInputDialog("Error, price must be numerical, " +
                                "please re-enter price:", JOptionPane.ERROR_MESSAGE);
                        i = 0;
                    }
                }
                Price.add(Float.parseFloat(price));
                iteration++;
                serial = JOptionPane.showInputDialog("Please enter the serial number(<Enter> to exit)");
            }
        }while (active);
        if (iteration > 0){
            for (int i=1; i<Price.size();i++){
                if (Price.get(i) > highestIndex)
                    highestIndex = i;
                else if (Price.get(i) < Price.get(lowestIndex))
                    lowestIndex = i;
            }
            for (Integer integer : DiskSpace) {
                avgDiskSpace += integer;
            }
            avgDiskSpace /= DiskSpace.size();

            JOptionPane.showMessageDialog(null,"The average disk space on the computers processed is: " +
                    avgDiskSpace + "GB\nThe price range of the computers is from \u20ac" + Price.get(lowestIndex)
                    + " to \u20ac" + Price.get(highestIndex) + "\nThe processor type on the cheapest computer is " +
                    Processor.get(lowestIndex),"Computer stats", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
