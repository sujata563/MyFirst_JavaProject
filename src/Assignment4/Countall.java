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

        String[] words = str.split("\\s+"); //split function with regular expression used to get the number of words


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

      //  System.out.println("func:-long word:1 " + lStr);

          if (lStr.length()>lword.length())
              return lStr;
          else
              return lword;

    }

    }
