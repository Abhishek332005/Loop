package Loops;

public class multiple_bw_1_to_50_of_3 {
    public static void main(String[] args) {

        // Without "continue" operation
//        for(int num = 1; num<=50; num++){
//            if(num%3 != 0){
//                System.out.println(num);
//            }
//    }




//        with "continue" operation

      for(int num = 1; num<=50; num++){
          if(num%3 ==0){
              continue;
          }
          System.out.println(num);
      }


        }
    }

