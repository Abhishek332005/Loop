package Loops;
import java.util.Scanner;
public class sum_of_digit {
    public static void main(String[] args) {
             Scanner sc = new Scanner(System.in);
        System.out.println("Enter the digit: ");
        int n = sc.nextInt();

        int sum = 0;
//        int orignal_n = n;
        while(n>0){
            sum = sum + n%10;
            n = n/10;


        }
        System.out.println("Sum of digit is: "+sum);
    }
}
