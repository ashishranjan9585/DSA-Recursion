

//import java.util.Scanner;

public class Palidrome {
    static void palidromeArray(int a[] , int n){
        int flag = 0 ;
        for(int i=0;i<n/2 && n != 0 ;i++){
            if(a[i] != a[n-i-1]){
                flag = 1;
                break;
            }

        }
        if(flag == 1)
           System.out.println("Not Palidrome");
           else
           System.out.println("Palidrome");
    }
  static int palidrome(int a[] , int start , int end ){
            if(start >= end) return 1;
            if(a[start] == a[end]) return palidrome(a , start+1 , end-1);
            else{
                return 0;
            }
  } 

  static boolean  palidromeString(String str ){
        // if string has  0 or  1 character
        if(str.length() == 0  || str.length() == 1) {
            return true;
        }
        //if multiple character we will check 
        if(str.charAt(0) == str.charAt(str.length()-1)){
            return palidromeString(str.substring(1 , str.length() - 1));
        }
        return false;
      
          
      }
  
    public  static void main(String[] args){
    int a[] = {1,2,3,2,1};
    int n = a.length;
     String str = "ABBA";
     System.out.println(palidromeString(str));
  //  palidromeArray(a,n);
   if(palidrome(a , 0, n-1) == 1)
       System.out.println("Palidrome");
       else
       System.out.println("Not Palidrome");
    }
}
