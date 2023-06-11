import java.util.Arrays;
public class GetAllSearchElement {
    public static int[] getAllElement(int[] arr , int index , int element , int[] result , int m){
        if(index == arr.length) {
            return result;
        }
        result = getAllElement(arr, index+1, element, result, m);
        if(arr[index] == element) result[m++] = index;
        return result;
    }
    public static void main(String[] args) {
        int arr[] = {12,23,24,45,67,12,34,12};
        int element = 12;
        int[] result = new int[arr.length];
        Arrays.fill(result , -1);
        int res[] = getAllElement(arr, 0, element, result, 0);
        System.out.print("[");
        for(int i = 0 ; i< result.length; i++){
            if(result[i] == -1) break;
            if(i==0 && result[i] != -1) System.out.print(result[i]);
            else
              System.out.print(" , "+result[i]);
        }
        System.out.print("]");
    }
}
