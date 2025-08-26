package Loops;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class add_n_forloop {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Number: ");
        int n = sc.nextInt();
        int sum = 0;

        for(int num = 1; num <= n; num++){
            sum = sum + num;
        }
        System.out.println(sum);

    }

}
