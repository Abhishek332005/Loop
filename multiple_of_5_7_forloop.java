package Loops;

public class multiple_of_5_7_forloop {
    public static void main(String[] args) {

        for(int num = 1; ;   num++){
            if((num%5==0) && (num%7==0)){
                System.out.println(num);
                break;
            }
        }
    }
}
