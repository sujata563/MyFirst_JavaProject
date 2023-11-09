package Assignment3;

import java.util.Scanner;

public class Count1Main {
    public static void main(String[] args) {
        Count1 objCount = new Count1();
        Scanner Scan = new Scanner(System.in);
        int noOfLines = 0;
        int noOfChars = 0;

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
            }
        }
        System.out.println("Number of lines is :"+noOfLines);
        System.out.println("Number of character is :"+ noOfChars); //noOfChar

    }
}

