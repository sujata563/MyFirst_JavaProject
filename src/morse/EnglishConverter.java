package morse;

import java.util.HashMap;

//Morse till text
public class EnglishConverter {
    private HashMap<String,String> english;
      //public void EnglishConverter() {
    //Constructor
    public  EnglishConverter(){

        english = new HashMap<String, String>();
        english.put("*-", "A");english.put("-***", "B");english.put("-*-*", "C");english.put("-**", "D");
        english.put("*", "E");english.put("**-*", "F");english.put("--*", "G");english.put("****", "H");
        english.put( "**", "I");english.put( "*---", "J");english.put("-*-","K");english.put("*-**","L");
        english.put("--", "M");english.put("-*", "N");english.put("---","O");english.put("*--*","P");
        english.put("--*-","Q");english.put("*-*","R");english.put("***","S");english.put("T","-");
        english.put("**-", "U");english.put("***-","V");english.put( "*--","W");english.put( "-**-","X");
        english.put("-*--", "Y");english.put("--**", "Z");english.put("*----", "1");english.put("**---", "2");
        english.put("***--", "3");english.put("****-", "4");english.put("*****", "5");english.put("-****", "6");
        english.put("--***", "7");english.put("---**", "8");english.put("----*", "9");english.put("-----","0");
        english.put("*-*-*-", ".");english.put("--*--", ",");english.put("--**--", "?")
        ;


}

    public String getLetter(String testdata) {
        return english.get(testdata);
    }
}
