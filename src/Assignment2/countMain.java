package Assignment2;

import java.util.Scanner;

public class countMain {
    public static void main(String[] args) {
        Count objCount = new Count();
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
                noOfLines = noOfLines + 1;
                noOfChars = noOfChars+objCount.getNoChar(inputText);
            }
        }
        System.out.println("Number of lines is :"+noOfLines);
        System.out.println("Number of character is :"+ noOfChars); //noOfChar

    }
}
