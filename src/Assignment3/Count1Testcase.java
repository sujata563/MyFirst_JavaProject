package Assignment3;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class Count1Testcase {
  @Test
  //It will count no of character in string
  public void firstTestcase(){
      Count1 myObj = new Count1();
      String myText = "some text";

      int expected = 9;
      int actual;
      actual = myObj.getNoChar(myText);
      assertEquals(expected,actual);

  }
    @Test
    //It will count no of lines
    public void secondTestcase(){
        Count1 myObj = new Count1();
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
}


