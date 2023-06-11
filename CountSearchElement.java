public class CountSearchElement {

    //Using int Return type --> stack falling
    public static int count1(int[] arr , int index , int element ){
        if(index == arr.length) return 0 ;
        int count  = count1(arr , index+1 , element);
         if(arr[index] == element ) count++;
         return count;
    }

    //Using void Return type  --> stack building

    public static void count2(int[] arr , int index , int element  , int count){
        if(index == arr.length){
            System.out.println("Count Search"+count);
            return;
        }
        if(arr[index] == element) count++;
          count2(arr,index+1 , element , count);
    }

    public static void main(String[] args) {
        int arr[] = {23 , 24, 56, 78, 56};
        int element = 56;
        System.out.println(count1(arr, 0, element));
        count2(arr, 0, element, 0);
    }
}
