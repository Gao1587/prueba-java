import java.util.Arrays;

public class prueba3 {
    public static void main(String[] args) {
        System.out.println("Java Programming Challenge\n");
        
        // Define the initial array of coins
        int[] coins = {1, 5, 1, 1, 1, 10, 15, 20, 100};
        
        // Display the initial array of coins
        display(coins);
        
        // Calculate and display the change
        calculateChange(coins);
    }
    
    public static void calculateChange(int[] myNum) {
        // Array to store the cumulative sums
        int[] verification = new int[myNum.length];
        
        // Sort the array of coins
        Arrays.sort(myNum);
        
        // Calculate the cumulative sums
        int sum = 0;
        for (int j = 0; j < myNum.length; j++) {
            sum += myNum[j];
            verification[j] = sum;
        }
        
        // Calculate the smallest amount of change that cannot be created
        int change = verification[myNum.length - 2] + 1;
        if (change < verification[myNum.length - 1]) {
            System.out.println("Result: " + change);
        } else {
            System.out.println("Result: " + (verification[myNum.length - 1] + 1));
        }
    }

    public static void display(int[] myNum) {
        // Display the array of coins
        System.out.println("Coins available for change:");
        for (int i = 0; i < myNum.length; i++) {
            System.out.print(" " + myNum[i]);
        }
        System.out.println("\n");
    }
}
