import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class arrayOfStrings {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Enter the length of the Array: ");
        int num1 =  sc.nextInt();
        String[] Scientist = new String[num1];
        for (int i = 0; i < Scientist.length; i++) {
            Scientist[i] = sc.nextLine();

        }
        System.out.println(Arrays.toString(Scientist));
       /* for (int i = 0; i < Scientist.length; i++) {
            System.out.println(Scientist[i]+ " ");

        }*/

    }
}
