import java.util.*;
public class Main{
    static int lengthOfLongestSubstring(String str){
        int count=0;
        Set<Character> a=new HashSet<>();
        for(int i=0;i<str.length();i++){
            if(a.contains(str.charAt(i))){
                break;
            }
            else{
                a.add(str.charAt(i));
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        String s=sc.next();
        System.out.println(lengthOfLongestSubstring(s));
        sc.close();
    }
}
