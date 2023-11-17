package Assignment4;

//import Assignment3.Count1;

import java.util.Scanner;

public class CountallMain {
    public static void main(String[] args) {
        Countall objCount = new Countall();
        Scanner Scan = new Scanner(System.in);
        int noOfLines = 0;
        int noOfChars = 0;
        int noOfWords = 0;
        String lWord = " ";
        String inputText = new String();
        while (inputText.compareTo("stop") != 0)
        {
            System.out.println("Please enter a string to compare");
            inputText = Scan.nextLine();
            if(inputText.equals("stop")) {
                System.out.println("Exiting now");
            }
            else {
                noOfLines = noOfLines+objCount.getNoLines(inputText) ;
                noOfChars = noOfChars+objCount.getNoChar(inputText);
                noOfWords = noOfWords+objCount.getNoWords(inputText);
                lWord     = objCount.getLongWord(inputText,lWord);
              //  System.out.println("Longest word is : " + lWord); //noOfChar
            }
        }
        System.out.println("Number of lines is :"+noOfLines);
        System.out.println("Number of character is :"+ noOfChars); //noOfChar
        System.out.println("Number of words is :"+ noOfWords); //noOfwords
        System.out.println("Longest word is :"+ lWord); //noOfChar
    }
}

