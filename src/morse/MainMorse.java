package morse;
import java.util.HashMap;
import java.util.Scanner;

public class MainMorse {
    public static void main(String[] args) {
        // object of MorseConverter class
        MorseConverter code = new MorseConverter();
        System.out.println("Welcome to MorseCode Translator");
        System.out.println("Please enter your choice as described below");
        System.out.println("1. For Letter to Morse Code");
        System.out.println("2. For MorseCode to Letter");
        System.out.println("3. For Word or sentence to MorseCode");
        System.out.println("Enter your choice");
        Scanner scan = new Scanner(System.in);
        int choice = scan.nextInt();
        if(choice == 1) {
           System.out.println("Enter a Character");
           Scanner input1 = new Scanner(System.in);
            String letter = input1.nextLine();
            // Exception handling
            try {
                if ( letter.length() != 1 )
                {
                    throw new RuntimeException("You have entered more than one char. expected is one: ");
                }

                String morse = code.getMorse(letter);
                if ( morse == null)
                {
                    throw new RuntimeException("Morse code is not defined for : ");
                }
                System.out.println(morse);
            } catch (Exception e)
            {
                System.out.println( e.getMessage() + letter );

            }


        } else if (choice == 2) {
            // Object
            EnglishConverter english = new EnglishConverter();
            System.out.println("Enter the MorseCode");
            Scanner input2 = new Scanner(System.in);
            String morse = input2.nextLine();
            // Exception handling
            try {
            String letter = english.getLetter(morse);
                if ( letter == null)
                {
                    throw new RuntimeException("Letter code is not defined for : ");
                }
            System.out.println(letter);
            } catch (Exception e)
            {
                System.out.println( e.getMessage() + morse );

            }

        }  else if (choice == 3) {

        System.out.println("Enter a word of sentence");
        Scanner input2 = new Scanner(System.in);
        String morse = input2.nextLine();

            String[] myWords = morse.split(" ");

            for(int i=0;i< myWords.length;i++) {
                String[] myLetters = myWords[i].split("");
                for(int j=0;j< myLetters.length;j++) {
                   System.out.print(myLetters[j] + code.getMorse(myLetters[j]));

                    System.out.println();
                }
                System.out.println();
            }


    }
        else {
            System.out.println("Error");
        }

    }
}



