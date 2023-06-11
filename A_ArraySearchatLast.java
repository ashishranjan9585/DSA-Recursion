public class A_ArraySearchatLast {
    //int return type -> during stack falling
    public static int lastIndexSearch(int[] arr , int index , int element){
        if(index == arr.length) return -1;
        int result = lastIndexSearch(arr, index+1, element);
         if(arr[index] == element) {
                 result = index;

         }

         return result;
    }
   
    // void return type - during stack building --> not processing logic after recursion call
    public static void lastIndexSearch1(int[] arr , int index , int result , int element){
        if( index == arr.length) {
            System.out.println((result >= 0)?  "Element Found :" + result :"Element Not Found");
           return;
        }
            
        
        if(arr[index] == element) result = index;
    
        lastIndexSearch1(arr, index+1, result, element);
        
    }

       public static void main(String[] args) {
           int arr[] = {23,24,56,78 ,56};
           int element = 56;
           lastIndexSearch1(arr, 0, -1 ,element);
           //System.out.println(lastIndexSearch(arr, 0, element));
       }
}
