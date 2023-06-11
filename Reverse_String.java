public class Reverse_String {

    static String reverse(String str){
         //Termination case 
         if(str.length() == 1 ){
            return str;
         }
  //small problem(make a string small) and add in recursion cycle
         String smallString = str.substring(1);
         String smallResult = reverse(smallString);
         char firstchar = str.charAt(0);    
           return  smallResult + firstchar;            }
     public static void main(String[] args){
          String str = "Amit";
          System.out.println("Reverse String is " + reverse(str));
     }
}


//StringvalueOf method -> convert character into string 