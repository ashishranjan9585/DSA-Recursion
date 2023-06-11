public class printStarinBetweenString {

    //using String Retrun type --> stack Falling..
    public static String AddInBetween(String str , int index){
        if(index == 0){
            return str.charAt(0) + "";
        }
        String ans = AddInBetween(str, index - 1);
    
         if(str.charAt(index) == str.charAt(index - 1)){
            ans += "*" + str.charAt(index);
        }
        else{
            ans += str.charAt(index);
        }
        return ans;
    }

    //Using void Return type --> stack building

    public static void AddInBetween1(String str , int index , String ans){
        if(index == str.length()){
            System.out.println(ans);
            return;
        }
        if(str.charAt(index) == str.charAt(index - 1)){
            ans += "*" + str.charAt(index);
        }
        else{
            ans += str.charAt(index);
        }
        AddInBetween1(str , index+1 , ans);
        
    }
    public static void main(String[] args) {
        String str = "aabbcc";
        AddInBetween1(str , 0 ,"");
      //  System.out.print(AddInBetween(str, str.length() - 1));
    }
}
