import java.util.Scanner;

public class min_of_array {
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
          // Assume first element is maximum
        int min = arr[0];

        for(int i=0;i<size;i++){
            if(arr[i]<min){
                min=arr[i];

            }
        }
        System.out.println("Minimume number = "+min);
    
}
    
}
