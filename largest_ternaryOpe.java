public class largest_ternaryOpe {
    public static void main(String[] args) {
        int x = 15;
        int y = 25;
        int z = 20;

        // Using ternary operator to find the largest of three numbers
        int largest = (x > y) ? ( (x > z) ? x : z ) : ( (y > z) ? y : z );

        System.out.println("The largest number among " + x + ", " + y + ", and " + z + " is: " + largest);
    }
    
}
