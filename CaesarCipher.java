import java.util.*;

public class CaesarCipher {
    public static String encrypt(String text, int shift) {
        StringBuilder result = new StringBuilder();

        for (char character : text.toCharArray()) {
            if (Character.isLetter(character)) {
                char base = Character.isUpperCase(character) ? 'A' : 'a';
                char encryptedChar = (char) ((character - base + shift + 26) % 26 + base);
                result.append(encryptedChar);
            } else {
                result.append(character); 
            }
        }
        return result.toString();
    }

    public static String decrypt(String text, int shift) {
        return encrypt(text, -shift);  
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your message: ");
        String message = sc.nextLine();

        System.out.print("Enter shift value: ");
        int shift = sc.nextInt();

        String encrypted = encrypt(message, shift);
        System.out.println("\nEncrypted Message: " + encrypted);

        String decrypted = decrypt(encrypted, shift);
        System.out.println("Decrypted Message: " + decrypted);
    }
}
