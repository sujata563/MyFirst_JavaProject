package morse;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestConverter {
    @Test
    public void testConverterB() {
        // Object of MorseConverter class
        MorseConverter converter = new MorseConverter();
        String testdata = "B";
        String actual = converter.getMorse(testdata);
        String expected = "-***";
        assertEquals(expected, actual);
    }

    @Test
    public void testConverterD() {
        MorseConverter converter = new MorseConverter();
        String testdata = "D";
        String actual = converter.getMorse(testdata);
        String expected = "-**";
        assertEquals(expected, actual);
    }

    @Test
    public void testConverter7() {
        MorseConverter converter = new MorseConverter();
        String testdata = "7";
        String actual = converter.getMorse(testdata);
        String expected = "--***";
        assertEquals(expected, actual);
    }

    @Test
    public void testConverter1() {
       EnglishConverter converter = new EnglishConverter();
        String testdata = "*";
        String actual = converter.getLetter(testdata);
        String expected = "E";
        assertEquals(expected, actual);

    }
}