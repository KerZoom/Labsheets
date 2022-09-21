package Labsheet12;

import javax.swing.*;

public class SnackDeal {
    public static void main(String[] args){
        String name, course;
        int snacks, cost;
        final int price = 2;
        JTextArea TextArea = new JTextArea(4,20);

        name = JOptionPane.showInputDialog("Please enter your name: ");
        course = JOptionPane.showInputDialog("What course are you studying? ");
        snacks = Integer.parseInt(JOptionPane.showInputDialog("How many snacks would you like? "));

        cost = snacks * price;
        TextArea.append("Name: " + name + "\nCourse: " + course + "\nSnacks: " + snacks + "\nCost: \u20ac" + cost);
        JOptionPane.showMessageDialog(null,TextArea,"Receipt",JOptionPane.INFORMATION_MESSAGE);
    }
}