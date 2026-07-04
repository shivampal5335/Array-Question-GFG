import java.util.Scanner;

public class negative_element_print {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take array size
        System.out.print("Enter array size: ");
        int size = input.nextInt();

        int[] arr = new int[size];

        // Take array elements
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
        }

        // Print negative values
        System.out.println("Negative values are:");
        for (int i = 0; i < size; i++) {
            if (arr[i] < 0) {
                System.out.println(arr[i]);
            }
        }

        input.close();
    }
}