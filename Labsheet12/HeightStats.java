package Labsheet12;

import javax.swing.*;

public class HeightStats {
    public static void main(String[] args) {
        float height, average = 0f, smallest = 0f, tallest = 0f;
        int between13and19 = 0, exceedAvg = 0;
        final float GLOBAL_AVERAGE = 1.665f;
        boolean valid = true;

        height = Float.parseFloat(JOptionPane.showInputDialog("Please enter a height"));
        average += height;
        smallest += height;
        tallest += height;

        for (int i=0;i<5;i++){
            height = Float.parseFloat(JOptionPane.showInputDialog("Please enter a height"));
            if (height > 2.72f || height < .546f){
                valid = false;
                while (valid = false) {
                    height = Float.parseFloat(JOptionPane.showInputDialog("Height exceeds 2.72 or is less than .542, " +
                            "please enter a valid height: "));
                }
            }
            else
                valid = true;
            average += height;

            if (height < smallest)
                smallest = height;
            if (height > tallest)
                tallest = height;
            if (height >= 1.3 && height <= 1.9)
                between13and19++;
            if (height > GLOBAL_AVERAGE)
                exceedAvg++;
        };
    }
}
