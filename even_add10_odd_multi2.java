import java.util.Scanner;

public class even_add10_odd_multi2 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);


        System.out.print("Enter the size of array :");
        int size = input.nextInt();

        int []arr = new int[size];

        System.out.print("Enter the element : ");

        for(int i=0;i<size;i++){
             arr[i] =input.nextInt();
        }

        for(int i=0;i<size;i++){
            if(i%2==0){
                arr[i] =arr[i]+10;
            }
            else {                // Odd index
                arr[i] = arr[i] * 2;
        }


    }
    System.out.println("Updated Array:");

        for(int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    
}
}