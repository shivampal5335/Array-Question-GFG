import java.util.Scanner;

public class product_of_array {
   
      public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        
      
    
        System.out.print("Entre the size of array : ");
        int n =input.nextInt();

        int []arr =new int[n];

        System.out.print("Enter the element of array : ");
        for(int i=0;i<n;i++){
            arr[i] = input.nextInt();
        }
         int mul =1;
        for(int i=0;i<n;i++){
            mul = mul * arr[i];


        }
        System.out.println("Product of element  = "+ mul);
    }
    
    
}
