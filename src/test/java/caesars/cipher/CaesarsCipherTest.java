package caesars.cipher;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CaesarsCipherTest {

	private CaesarsCipher caesarCipher = new CaesarsCipher();	
	
	@Test
	void testCipheredMessageWithOffsetOf12() {
		// the left side of "tai mdq..." is equal to
		// the right side of "how are..."
		assertEquals("tai mdq kag pauzs fapmke", caesarCipher.cipher("how are you doing today?", 12));
	}
	
	@Test
	void testEmptyString() {
		assertEquals("", caesarCipher.cipher("", 12));
	}
	
//	@Test
//	void testCipheredMessageWithOffsetOf11() {
//		assertEquals("tai mdq kag pauzs fapmke", caesarCipher.cipher("how are you doing today?", 11));
//	}
}
