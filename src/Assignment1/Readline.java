package Assignment1;

import com.sun.source.tree.WhileLoopTree;

import java.util.Scanner;

public class Readline {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);

        String text = new String();
     //   int noOfChar = 0;
        int noOfLine = 0;
        int Count= 0;
        while(text.compareTo("stop") != 0 ) //here 0 is false and 1 is true
        {
            System.out.println("Please enter a string to compare");
            text = Scan.nextLine();
           if(text.equals("stop")) {
                System.out.println("Exiting now");
            }
            else{
               noOfLine = noOfLine+1;
                System.out.println("Waiting for stop");
                Count = Count + text.length();

            }

        }

        System.out.println("Number of lines is :"+noOfLine);
        System.out.println("Number of character is :"+ Count); //noOfChar

        }

}