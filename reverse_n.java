package Loops;
import java.util.Scanner;
public class reverse_n {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        for(int num = n; num >= 1; num--){
            System.out.println(num);
        }

    }
}
