public class prueba1 {
    public static void main(String[] args) {
        System.out.println("Java Programming Challenge\n");
        
        // Initial array
        Integer[] array = {60, 6, 5, 4, 3, 2, 7, 7, 29, 1};
        int limitMax = 7;
        
        // Empty array to store the result
        Integer[] resultArray = new Integer[array.length];
        
        for (int i = 0; i < array.length; i++) {
            // If condition to classify numbers greater than or equal to 10
            if (array[i] >= 10) {
                // Calculate units place
                Integer units = array[i] % 10;
                // Calculate tens place
                Integer tens = (array[i] - units) / 10;
                // Remove digits equal to 6 and store the others
                if (tens != limitMax && units != limitMax) {
                    // Store both digits different from 6
                    resultArray[array.length - 1 - i] = array[i];
                } else if (tens == limitMax && units != limitMax) {
                    // Store the unit digit that is different from 6
                    resultArray[array.length - 1 - i] = units;
                } else if (tens != limitMax && units == limitMax) {
                    // Store the tens digit that is different from 6
                    resultArray[array.length - 1 - i] = tens;
                }
            } else {
                // Analyze numbers less than 10
                if (array[i] != limitMax) {
                    // Store the digit different from 6
                    resultArray[array.length - 1 - i] = array[i];
                } else {
                    // Store the digit equal to 6 with a flag -1
                    resultArray[array.length - 1 - i] = -1;
                }
            }
        }
        
        System.out.println("Result\n");
        for (int j = 0; j < array.length; j++) {
            if (resultArray[j] != -1) {
                System.out.print("  " + resultArray[j]);
            } else {
                System.out.print("  ");
            }
        }
    }
}
