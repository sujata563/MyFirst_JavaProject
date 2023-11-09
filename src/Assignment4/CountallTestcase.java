package Assignment4;

import Assignment3.Count1;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CountallTestcase {
  @Test
  //It will count no of character in string
  public void firstTestcase(){
      Countall myObj = new Countall();
      String myText = "some text";

      int expected = 9;
      int actual;
      actual = myObj.getNoChar(myText);
      assertEquals(expected,actual);

  }
    @Test
    //It will count no of lines
    public void secondTestcase(){
        Countall myObj = new Countall();
        String[] myText1;
        myText1 = new String[5];
        myText1[0] = "Sujata";
        myText1[1] = "Sujata1";
        myText1[2] = "Sujata2";
        myText1[3] = "stop";
        myText1[4] = "Sujata4";

        int expected = 3;
        int actual = 0;
        int i = 0;
        while(true)
        {
            actual = actual+ myObj.getNoLines(myText1[i]);
          if (myObj.getNoLines(myText1[i])==0)
              break;

            i++;
        }

        assertEquals(expected,actual);

    }

    @Test
    //It will count no of lines
    public void ThirdTestcase(){
        Countall myObj = new Countall();
        String[] myText1;
        myText1 = new String[5];
        myText1[0] = "Long word";
        myText1[1] = "Longer word";
        myText1[2] = "Word longestt";
        myText1[3] = "stop";
        myText1[4] = "Hmmmmm let's see";

        String expected = "longestt";
        String  actual = " ";
        int i = 0;
        while(true)
        {
            if (myText1[i] == "stop")
                break;
            actual = myObj.getLongWord(myText1[i],actual);

            i++;
        }

        assertEquals(expected,actual);

    }
}


