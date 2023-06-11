public class StringReplaceWithHash {
    public static String replaceWithHash(String str , int index){
        if(index == 0){
             return str.charAt(0) + " ";
        }
        String replace = replaceWithHash(str, index -1);
        if(str.charAt(index) == str.charAt(index-1)) replace += "#";
        else 
          replace += str.charAt(index);
          return replace;
    }
     public static void main(String[] args) {
        String str = "aabbcc";
         System.out.print(replaceWithHash(str , str.length() - 1));
     }
}
