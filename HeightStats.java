import javax.swing.*;

public class HeightStats {
    public static void main(String[] args) {
        float height, average = 0f, smallest = 0f, tallest = 0f;
        int between13and19 = 0, exceedAvg = 0;
        final float GLOBAL_AVERAGE = 1.665f;
        boolean valid = true;

        JTextArea output = new JTextArea(4,40);

        height = Float.parseFloat(JOptionPane.showInputDialog("Please enter a height"));
        average += height;
        smallest += height;
        tallest += height;


        for (int i=0;i<5;i++){
            if (height > 2.72 || height < 0.546f)
                valid = false;

            while (!valid) {
                height = Float.parseFloat(JOptionPane.showInputDialog("Height exceeds 2.72 or is less than .542, " +
                        "please enter a valid height: ", JOptionPane.ERROR_MESSAGE));
                if (height < 2.72f || height > .546f)
                    valid = true;
            }
            average += height;

            if (height < smallest)
                smallest = height;
            if (height > tallest)
                tallest = height;
            if (height >= 1.3 && height <= 1.9)
                between13and19++;
            if (height > GLOBAL_AVERAGE)
                exceedAvg++;
            height = Float.parseFloat(JOptionPane.showInputDialog("Please enter a height"));
        }
        average = average / 6;
        output.append("The average of the heights entered is " + average +
                "\nThe smallest of the height values entered is " + smallest +
                "\nThe number of height values between 1.3m and 1.9 inclusive are " + between13and19 +
                "\nThe percentage of height values exceeding the global average height is " + 5/exceedAvg*100 + "%");
        JOptionPane.showMessageDialog(null,output,"Height Statistics", JOptionPane.INFORMATION_MESSAGE);
    }
}
