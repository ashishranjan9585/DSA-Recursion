
public class Power {
    static int power(int n , int m ){
        if( m == 0){
             return 1;
        }
        else{
            int result =  n* power(n , m-1);
             return result;
    }
}

   
    public static void main(String[] args){
         System.out.println("Power is " +power(2,5));
    }
}
