package org.lucidant.kyu6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.lucidant.kyu6.MexicanWave.wave;

class MexicanWaveTest
{
    @Test
    public void basicTest1() {
        final String[] result = new String[] { "Hello", "hEllo", "heLlo", "helLo", "hellO" };
        assertArrayEquals(result, wave("hello"));
    }

    @Test
    public void basicTest2() {
        final String[] result = new String[] { "Codewars", "cOdewars", "coDewars", "codEwars", "codeWars", "codewArs", "codewaRs", "codewarS" };
        assertArrayEquals(result, wave("codewars"));
    }

    @Test
    public void basicTestEmptyString() {
        final String[] result = new String[] { };
        assertArrayEquals(result, wave("    "));
    }

    @Test
    public void basicTestWithInternalSpace() {
        final String[] result = new String[]
            { " Two words", " tWo words", " twO words", " two Words", " two wOrds", " two woRds", " two worDs", " two wordS" };
        assertArrayEquals(result, wave(" two words"));
    }

    @Test
    public void basicTestStartAndEndPos() {
        final String[] result = new String[] { " Gap ", " gAp ", " gaP " };
        assertArrayEquals(result, wave(" gap "));
    }

}
