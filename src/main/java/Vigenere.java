import java.util.Scanner;


public class Vigenere {
    public static String encryptVigenere(String message, String key) {
        String new_msg = "";
        int count = 0;
        for(int i=0;i<message.length();i++){
            if ((int) message.charAt(i) < 65 || ((int) message.charAt(i) > 90 && (int) message.charAt(i) < 97) || (int) message.charAt(i) > 122){
                new_msg += message.charAt(i);
            }
            else{
                new_msg += encryptCaesarLetter(message.charAt(i), Math.abs((key.charAt(count % key.length()) - 65)));
                count ++;
            }
        }
        return new_msg;
        // REPLACE THIS WITH YOUR CODE

    }

    public static String decryptVigenere(String message, String key) {
        String new_msg = "";
        int count = 0;
        for(int i=0;i<message.length();i++){
            if ((int) message.charAt(i) < 65 || ((int) message.charAt(i) > 90 && (int) message.charAt(i) < 97) || (int) message.charAt(i) > 122){
                new_msg += message.charAt(i);
            }
            else{
                new_msg += decryptCaesarLetter(message.charAt(i), Math.abs((key.charAt(count % key.length()) - 65)));
                count ++;
            }
        }
        return new_msg;
        // REPLACE THIS WITH YOUR CODE
    }
    public static char encryptCaesarLetter(char ch, int key) {
        // YOUR CODE HERE
        int chAscii = (int) ch;
        if (chAscii >= 65 && chAscii <= 90){
            if(chAscii >= 90 - key + 1){
                return (char) (chAscii - (26 - key));
            }
            return (char) (chAscii + key);
        }
        else  {//(chAscii >= 97 && chAscii <= 122){
            if(chAscii >= 122 - key + 1){
                return (char) (chAscii - (26 - key));
            }
            return (char) (chAscii + key);
        }


    }

    public static char decryptCaesarLetter(char ch, int key) {
        // YOUR CODE HERE
        int chAscii = (int) ch;
        if (chAscii >= 65 && chAscii <= 90){
            if(chAscii <= 65 + key - 1){
                return (char) (chAscii + (26 - key));
            }
            return (char) (chAscii - key);
        }
        else if (chAscii >= 97 && chAscii <= 122){
            if(chAscii <= 97 + key - 1){
                return (char) (chAscii + (26 - key));
            }
            return (char) (chAscii - key);
        }
        else{
            return ch;
        }
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Would you like to \"encrypt\" or \"decrypt\" a message?");
        String command = scan.nextLine().trim().toLowerCase();

        if (command.equals("encrypt")) {
            System.out.println("Please enter your message to be encrypted: ");
            String message = scan.nextLine();
            System.out.println("Please enter the key for your message: ");
            String key = scan.nextLine().trim().toUpperCase();
            System.out.println("Here is your encrypted message: ");
            System.out.println(encryptVigenere(message, key));
        }
        else if (command.equals("decrypt")) {
            System.out.println("Please enter your message to be decrypted: ");
            String message = scan.nextLine();
            System.out.println("Please enter the key for your message: ");
            String key = scan.nextLine().trim().toUpperCase();
            System.out.println("Here is your decrypted message: ");
            System.out.println(decryptVigenere(message, key));
        }
        else {
            System.out.println("Unknown command; please type either \"encrypt\" or \"decrypt\"");
        }

        scan.close();
    }
}
