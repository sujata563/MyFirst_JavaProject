package Assignment4;

public class Countall {

    String lStr = " ";
        // Counting no.of character in string
        public int getNoChar(String str)
        {

            return str.length();
        }

    public int getNoLines(String str)
    {
        if (str.equals("stop"))
            return 0;
        else
        {
        return 1;
    }

    }

    public int getNoWords(String str)
    {

        String[] words = str.split("\\s+"); //split function with regular expression used to get the number of words

        return words.length;

    }

    public String getLongWord(String str, String lword)
    {

         boolean multiWord = str.contains(" ");
         if (multiWord)
         {
             String[] words = str.split("\\s+"); //split function with regular expression used to get the number of words
            // System.out.println("func:-long word:lStr -IF" + words[1]);

             for (int i = 0; i < words.length-1; i++)
             {

                 if (i == 0) //To compare
                 {
                     lStr = words[i];
                 }

                 if (  words[i+1].length() >= lStr.length() ) //words[0].length())
                 {
                     lStr = words[i+1];
                 }


             }

            // System.out.println("func:-long word:lStr " + lStr);
            // System.out.println("func:-long word:lword " + lword);
             if (lStr.length()>lword.length())
                 return lStr;
             else
                 return lword;
         }
         else
         {
            // System.out.println("func:-long word:lStr else " + lStr.length() + " : " + lword.length());
             if (lword.equals(" "))
                 lword=str;
             else
             if (str.length()>lword.length())
                 lword=str;

         }
     return lword;
    }
}

