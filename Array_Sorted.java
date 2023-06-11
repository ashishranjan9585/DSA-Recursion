public class Array_Sorted {
    static boolean isSortedArray(int[] arr , int index){
        int n = arr.length - 1 ;
        if( n == index) return true;

        if(arr[index] > arr[index+1]) {
            return false;
    }

    return isSortedArray(arr , index+1);
    }
     public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
          System.out.println(isSortedArray(arr, 0));
     }
}
