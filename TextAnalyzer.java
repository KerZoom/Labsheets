import javax.swing.*;

public class TextAnalyzer {
    public static void main(String[] args) {
        int totalChars, lowerVowels, spaces, edTimes,
                average, words = 0, runs = 0;
        char letter;
        String text, shortestText;

        text = JOptionPane.showInputDialog("Please enter a piece of text");
        shortestText = text;
        do {
            totalChars = 0;
            lowerVowels = 0;
            spaces = 0;
            edTimes  = 0;

            for (int i = 0;i<text.length();i++){
                letter = text.charAt(i);
                if (Character.isLetter(letter))
                    totalChars++;
                if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u')
                    lowerVowels++;
                if (letter == ' ')
                    spaces++;
            }
            for (int b=0; b+1 <= text.length(); b++){
                if (text.charAt(b) == 'e' && text.charAt(b+1) == 'd')
                    edTimes++;
            }
            if (Character.isLetter(text.charAt(text.length()-1)))
                    spaces += 1;

            System.out.println("\nNumber of characters: "+ totalChars);
            System.out.println("Number of lowercase vowels: "+ lowerVowels);
            System.out.println("Number of words: " + spaces);
            System.out.println("Number of times \"ed\" appears in the text: "+ edTimes);

            if (text.length() < shortestText.length())
                shortestText = text;

            text = JOptionPane.showInputDialog("Please enter a piece of text");
            runs++;
            words += spaces;
        }while (runs < 3);

        System.out.println("\nShortest piece of text: " + shortestText);
        average = words / 3;
        System.out.println("The average number of words: " + average);
    }
}
