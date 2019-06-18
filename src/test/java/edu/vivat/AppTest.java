package edu.vivat;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AppTest {

    @Test
    public void shouldRecognizeEmptyString() {
        assertEquals(true, App.palindrom(""));
    }

    @Test
    public void shouldRecognizeOneCharacterPalindrome() {
        assertEquals(true, App.palindrom("a"));
    }

    @Test
    public void shouldRecognizeTwoCharacterPalindrome() {
        assertEquals(true, App.palindrom("aa"));
    }

    @Test
    public void shouldRecognizeTwoCharacterNonPalindrome() {
        assertEquals(false, App.palindrom("ab"));
    }

    @Test
    public void shouldRecognizePalindrome() {
        assertEquals(true, App.palindrom("amanaplanacanalpanama"));
    }

    @Test
    public void shouldRecognizeNonPalindrome() {
        assertEquals(false, App.palindrom("noPalindrome"));
    }

}
