public class PrimeNumber {

    //boolean return type  -->  stack falling
      static boolean flag = false;
   public  static boolean isPrime(int num , int i){
          if(i == num) {
             flag = true;
             return flag;
          }
          if(num % i == 0) return false;
          isPrime(num , i+1);
          return flag;
        }

        //void return type --> stack building
        public static void isPrime2(int num , int i){
            if( num == i){
                System.out.println(num+" is Prime ");
                return;
            }
            if( num % i == 0){
                System.out.println(num+" is not Prime ");
                return;
            }
            isPrime2(num , i+1);
        }

     public static void main(String[] args) {
        int num = 7;
        isPrime2(num , 2);
    if(isPrime(num , 2)){
        System.out.println(true);
    }
    System.out.println(false);
     
     }
}
