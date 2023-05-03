import java.util.Scanner;

public class arrayUsingForLoop {

    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        int[] arr =  new int[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();

        }
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        // Another easy way to do it is this 
        
        for (int j = 0; j < arr.length; j++) {
            arr[j] = input.nextInt();

        }
        System.out.println(Arrays.toString(arr)); // line basically converts array to a string and prints it.



    }
}
