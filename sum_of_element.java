import java.util.Scanner;

public class sum_of_element {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        System.out.print("Entre the size of array : ");
        int n =input.nextInt();

        int []arr =new int[n];

        System.out.print("Enter the element of array : ");
        for(int i=0;i<n;i++){
            arr[i] = input.nextInt();
        }
         int sum =0;
        for(int i=0;i<n;i++){
            sum = sum + arr[i];


        }
        System.out.println("sum = "+ sum);
    }
    
}
