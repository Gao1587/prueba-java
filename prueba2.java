public class prueba2 {
    public static void main(String[] args) {
        System.out.println("Java Programming Challenge\n");
        
        // Define the initial array
        int[] values = {-10, 10};
        
        // Display the initial array
        display(values);
        
        // Display the results of squaring the elements of the initial array
        processResults(values, 77, 0);
    }
    
    public static void processResults(int[] myNum, int maxVal, int minVal){
        // Square each element
        Integer[] squares = new Integer[myNum.length];
        for (int i = 0; i < myNum.length; i++) {
            squares[i] = myNum[i] * myNum[i];
        }
        // Sort the squared elements in ascending order
        sort(squares, maxVal, minVal);
    }

    // Function to display data
    public static void display(int[] array) {
        System.out.println("Input Numbers:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(" " + array[i]);
        }
        System.out.println("\n");
    }
    
    // Function to sort in ascending order using bubble sort
    public static void sort(Integer[] array, int maxVal, int minVal) {
        int temp = 0;
        for (int k = 0; k < array.length - 1; k++) {
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
        }
        
        System.out.println("Result:");
        for (int j = 0; j < array.length; j++) {
            if (array[j] <= maxVal && array[j] >= 0) {
                System.out.print(" " + array[j]);
            }
        }
    }
}
