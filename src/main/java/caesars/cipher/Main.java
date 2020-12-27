package caesars.cipher;

public class Main {

	public static void main(String[] args) {
		
		String message = "how are you doing today?";
		int offset = 12;
		
		// creating an instance of the class CaesarsCipher
		CaesarsCipher caesarsCipher = new CaesarsCipher();
		// everytime CaesarsCipher is used, we are putting our hand
		// down into the CaesarsCipher class and access all the code
		// in that class
		String cipheredMessage = caesarsCipher.cipher(message, offset); 
		System.out.println("Original message: " + message);
		System.out.println("Offset: " + offset);
		System.out.println("Ciphered message: " + cipheredMessage);
	}

}
