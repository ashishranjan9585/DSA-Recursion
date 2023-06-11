public class SumOfNaturalNumber {
     static int sumofNaturalNumber(int num){
      //Termination case
        if(num <= 1){
               return num;
          }

        //small problem - 
        int sum = num+sumofNaturalNumber(num-1) ;
        return sum ;
     }

         public static void main(String[] args){
 System.out.println("Sum of N-Natural-Number"+sumofNaturalNumber(5));
         }
}
