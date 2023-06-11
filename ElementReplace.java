public class ElementReplace {
    public static int[] replace(int[] arr , int index , int element , int repl){
        if(index == arr.length){
            return arr;
        }
        arr = replace(arr , index+1 , element , repl);
        if(arr[index] == element) arr[index] = repl;
        return arr;
    }
     public static void main(String[] args) {
        int arr[] = {12,34,56,34,45,34};
        int element = 34;
        int repl = 12;
        replace(arr, 0, element, repl);
        System.out.print("[");
        for(int i = 0 ; i< arr.length ; i++){
            if(i == 0){
                System.out.print(arr[i]);
            }
            else{
                System.out.print(" ," +arr[i]);
            }
           
        }
        System.out.print("]");
     }
}
