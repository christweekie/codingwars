/**
 *
 */
package org.lucidant;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author chrisfaulkner
 *
 */
class ValidBracesTest {

	/**
	 * @throws Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testIsValid() {
		assertTrue(ValidBraces.isValid("()"));
		assertTrue(ValidBraces.isValid("(())()"));
		assertFalse(ValidBraces.isValid("(()))("));

		assertTrue(ValidBraces.isValid("([])"));
	}

}
