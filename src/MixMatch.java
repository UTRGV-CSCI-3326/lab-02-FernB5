public class MixMatch {
    public static void main(String[] args) {

        // Declare and initialize 8 variables of type 
        // String, char, short, int, long, float, double, and boolean

        String varStr = "Hello";
        char varChar = 'A';
        short varShort = 12;
        int varInt = 1529167;
        long varLong = 1000000000;
        float varFloat = 7;
        double varDouble = 3745.975812;
        boolean varBool = true;
        
        // Output the stored literal value for each variable 
        // along with a brief description of the data type
        System.out.println("String stores a group of characters, Example: " + varStr);
        System.out.println("char stores single letters or numbers, Example: " + varChar);
        System.out.println("short stores whole numbers in a 16-bit range, Example: " + varShort);
        System.out.println("int stores whole numbers in a 32-bit range, Example: " + varInt);
        System.out.println("long stores whole numbers in a 64-bit range, Example: " + varLong);
        System.out.println("float stores single prescision decimal numbers, Example: " + varFloat);
        System.out.println("double stores double prescision decimal numbers, Example: " + varDouble);
        System.out.println("boolean stores true or false statements, Example: " + varBool);

        // Output mutiple variables with a single print method
        System.out.println("Example of number variables: " + varShort + ", " + varInt + ", " + varLong);
        System.out.println("Example of decimal number variables: " + varFloat + ", " + varDouble);
        String varStr2 = "World";
        System.out.println("Example of variables with letters: " + varStr + ", " + varStr2 + ", " + varChar);
    }
}