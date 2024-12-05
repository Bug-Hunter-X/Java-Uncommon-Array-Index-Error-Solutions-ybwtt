public class UncommonBugSolution {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum > 10) {
                System.out.println("Sum exceeds 10 at index: " + i);
                break; //This break prevents further iteration and potential IndexOutOfBoundsException
            }
            System.out.println("Current sum: " + sum);
        }
        System.out.println("Final Sum: " + sum);
    }
} 
//The solution is the same as bug, but this is to show the solution file.  The key is to handle the break to prevent IndexOutOfBoundsException.