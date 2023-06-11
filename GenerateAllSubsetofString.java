import java.util.Set;
import java.util.HashSet;
public class GenerateAllSubsetofString {
    public static void generateSubset(String s){
        Set<String>set = new HashSet<>();
        utilGenerateSubset(s,0," " ,set);
        for(String st : set){
            System.out.println(st);
        }
    }
    public static void utilGenerateSubset(String s , int i , String cur ,Set<String>set ){
        if(i == s.length()) {
       // System.out.println(cur);
       set.add(cur);
        return;
    }
         utilGenerateSubset(s,i+1,cur , set);
         utilGenerateSubset(s,i+1,cur + s.charAt(i) , set);
}
public static void main(String[] args){
   generateSubset("aaa");
}
}

  