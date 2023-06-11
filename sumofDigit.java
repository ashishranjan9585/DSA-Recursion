public class sumofDigit {
     static int Sum(int n){
        if(n==0) return 0;
        int lastdigit = n%10;
         return lastdigit +(Sum(n/10));
     }

     static int sod(int n , int sum ){
      if(n == 0) {return sum ; }
      int lastD = n % 10;
      sum += lastD;
      sod(n/10 , 0);
       return sum;
     }
     public static void main(String[] args){
        int n = 2314 ;
        System.out.println(Sum(n));
     }
}
