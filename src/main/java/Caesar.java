import java.util.Scanner;

public class Caesar {
    // Given a String, encrypts the String with the Caesar cipher
    // and returns the encrypted String
    // Ex. encryptCaesar("Hello, World!") => "Khoor, Zruog!"
    public static String encryptCaesar(String message) {
        // REPLACE THIS WITH YOUR CODE
        String new_msg = "";
        for (int i=0;i<message.length();i++){
            int currentAscii = (int) message.charAt(i);
            if (currentAscii >= 97 && currentAscii <= 122){
                if (currentAscii >= 120){
                    new_msg = new_msg + (char) (currentAscii - 23);

                }
                else {
                    new_msg = new_msg + (char) (currentAscii + 3);
                }
            }

            else if (currentAscii >= 65 && currentAscii <= 90){
                if (currentAscii >= 88){
                    new_msg = new_msg + (char) (currentAscii - 23);

                }
                else {
                    new_msg = new_msg + (char) (currentAscii + 3);
                }
            }
            else{
                new_msg = new_msg + (char) (currentAscii);
            }
        }
        return new_msg;
    }

    // Given a String, decrypts the String with the Caesar cipher
    // and returns the original String
    // Ex. decryptCaesar("Khoor, Zruog!") => "Hello, World!"
    public static String decryptCaesar(String message) {
        // REPLACE THIS WITH YOUR CODE
        String new_msg = "";
        for (int i=0; i<message.length();i++){
            int currentAscii = (int) message.charAt(i);
            if (currentAscii >= 65 && currentAscii <= 90){
                if (currentAscii <= 67){
                    new_msg += (char) (currentAscii + 23);
                }
                else{
                    new_msg += (char) (currentAscii - 3);
                }

            }
            else if (currentAscii >= 97 && currentAscii <= 122){
                if (currentAscii <= 99){
                    new_msg += (char) (currentAscii + 23);
                }
                else{
                    new_msg += (char) (currentAscii - 3);
                }
            }
            else{
                new_msg += (char) currentAscii;
            }

        }
        return  new_msg;
    }

    // Given a String and a key corresponding to a shift, encrypts
    // the String using the given key and returns the encrypted String
    // Ex. encryptCaesarKey("Hello, World!", 5) => "Mjqqt, Btwqi!".
    public static String encryptCaesarKey(String message, int key) {
        // REPLACE THIS WITH YOUR CODE
        return message;
    }

    // Given a String and a key corresponding to a shift, decrypts
    // the String using the given key and returns the original String
    // Ex. decryptCaesarKey("Mjqqt, Btwqi!", 5) => "Hello, World!"
    public static String decryptCaesarKey(String message, int key) {
        // REPLACE THIS WITH YOUR CODE
        return message;
    }


    // The main method is already provided for you
    // You do not need to edit this code until Part 2
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Would you like to \"encrypt\" or \"decrypt\" a message?");
        String command = scan.nextLine().trim().toLowerCase();

        if (command.equals("encrypt")) {
            System.out.println("Please enter your message to be encrypted: ");
            String message = scan.nextLine();
            System.out.println("Here is your encrypted message: ");
            System.out.println(encryptCaesar(message));
        }
        else if (command.equals("decrypt")) {
            System.out.println("Please enter your message to be decrypted: ");
            String message = scan.nextLine();
            System.out.println("Here is your decrypted message: ");
            System.out.println(decryptCaesar(message));
        }
        else {
            System.out.println("Unknown command; please type either \"encrypt\" or \"decrypt\"");
        }

        scan.close();
    }
}
