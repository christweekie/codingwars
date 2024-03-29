/**
 * 
 */
package org.lucidant;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author chrisfaulkner
 *
 */
class WordSpinnerTest {

	private WordSpinner wordSpinner;
	/**
     */
	@BeforeEach
	void setUp() {
		wordSpinner = new WordSpinner();
	}

	@Test
	void testSpinWords() {
		assertEquals("Hey wollef sroirraw", wordSpinner.spinWords("Hey fellow warriors"));
	}

	@Test
	void testSpinWordsMixed() {
		assertEquals("This is rehtona test", wordSpinner.spinWords("This is another test"));
	}
	
	@Test
	void testSpinWordsAllLess() {
		assertEquals("This is a test", wordSpinner.spinWords("This is a test"));
	}
	
	@Test
	void testSpinWordsAllMore() {
		assertEquals("reteP dekcip delkcip reppeP", wordSpinner.spinWords("Peter picked pickled Pepper"));
	}
	
	@Test
	void testSpinWordsNull() {
		assertEquals("", wordSpinner.spinWords(null));
	}
}
