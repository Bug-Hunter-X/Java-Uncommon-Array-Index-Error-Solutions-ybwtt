public class UncommonBug {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum > 10) {
                System.out.println("Sum exceeds 10 at index: " + i);
                break; //This break statement is crucial to prevent IndexOutOfBoundsException
            }
            System.out.println("Current sum: " + sum);
        }
        System.out.println("Final Sum: " + sum);
    }
}