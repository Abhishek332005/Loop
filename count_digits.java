package Loops;
import java.util.Scanner;
public class count_digits {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
        System.out.print("Enter the digit: ");
        int n = sc.nextInt();

        int count = 0;
        int orignal_n = n;
        while(n>0){
            n= n/10;
            count++;
        }
        System.out.println(count);
    }
}
