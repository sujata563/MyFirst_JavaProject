package morse;

import java.util.HashMap;


//text till Morse
public class MorseConverter {
    private HashMap<String, String> code;

    //Constructor
    public MorseConverter() {
        code = new HashMap<String, String>();
        code.put("A", "*-");code.put("B", "-***");code.put("C", "-*-*");
        code.put("D", "-**");code.put("E", "*");code.put("F", "**-*");code.put("G", "--*");
        code.put("H", "****");code.put("I", "**");code.put("J", "*---");code.put("K", "-*-");
        code.put("L", "*-**");code.put("M", "--");code.put("N", "-*");code.put("O", "---");
        code.put("P", "*--*");code.put("Q", "--*-");code.put("R", "*-*");code.put("S", "***");
        code.put("T", "-");code.put("U", "**-");code.put("V", "***-");code.put("W", "*--");
        code.put("X", "-**-");code.put("Y", "-*--");code.put("Z", "--**");code.put("1", "*----");
        code.put("2", "**---");code.put("3", "***--");code.put("4", "****-");code.put("5", "*****");
        code.put("6", "-****");code.put("7", "--***");code.put("8", "---**");code.put("9", "----*");
        code.put("0", "-----");code.put(".", "*-*-*-");code.put(",", "--*--");code.put("?", "--**--");
    }

    public String getMorse(String letter) {
        return code.get(letter);

    }


}