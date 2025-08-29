package Loops;
import java.util.Scanner;
public class n_number_forloop {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int n = sc.nextInt();


        for(int num = 1; num<=n; num++){
            System.out.println(num);
        }

    }
}
