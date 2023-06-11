public class CountZero {
    static int countZero(int num){
      int count = 0 ;
        //Termination Case
  if(num == 0) { //just handle the case when num = 0
    return 0; 
  }

        //small problem 
        if(num % 10 == 0){
            return count+1 + countZero(num/10);
        }
        else{
            return countZero(num/10);
        }
    }
     public static void main(String[] args) {
        System.out.println(countZero(102300));
     }
}
