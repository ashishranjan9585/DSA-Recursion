

import java.util.Scanner;

public class Factorial {
    /**
     * @param n
     */
    static int squareSum(int n ){
        if(n==1)return 1;
        return (n*n + squareSum(n-1));
      }
    public static int fact(int n){
        if(n==1) return 1;
        return(n*fact(n-1)) ;
    }
    static int GCD(int a, int b){
        if(a % b == 0)return b ;
        return GCD(b,a%b);
    }
        public static void main(String[] args){
          Scanner sc = new Scanner(System.in);
         System.out.println("Enter the number");
      //   int n = sc.nextInt();
         int a = sc.nextInt();
         int b = sc.nextInt();
        // System.out.println(fact(n));
       //  System.out.println(squareSum(n));
         System.out.println(GCD(a,b));
         sc.close();

          
        }
}
