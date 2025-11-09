public class rem_withoutMod {
    public static void main(String[] args) {
        int dividend = 29;
        int divisor = 5;

        // Calculate quotient
        int quotient = dividend / divisor;

        // Calculate remainder without using modulus operator
        int remainder = dividend - (quotient * divisor);

    System.out.println("Reminder :" + remainder);
    }
    
}
