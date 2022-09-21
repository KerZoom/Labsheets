package Labsheet4.exercise2;

import javax.swing.*;

public class TestBook {
    public static void main(String[] args) {
        String output = "";

        Book b1 = new Book();
        Book b2 = new Book("The wizard of OZ",20,"KK2222S",200);

        output += "Calling the no-argument Book constructor. The first Book object details are:\n" + b1.toString();
        output += "Calling the multi-argument Book constructor. The second Book object details are:\n" + b2.toString();
        JOptionPane.showMessageDialog(null,output,"Book object Data", JOptionPane.INFORMATION_MESSAGE);
    }
}
