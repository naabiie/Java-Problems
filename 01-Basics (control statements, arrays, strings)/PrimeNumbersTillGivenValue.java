import java.util.*;
public class Main{
    static boolean isprime(int num){
        if(num<2){
            return false;
        }
        for(int i=2;i*i<=num;i++){
            if(num%i==0)
             return false;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        StringBuilder sb=new StringBuilder();
        for(int i=2;i<=n;i++){
            if(isprime(i)){
                sb.append(i).append(" ");
            }
        }
        System.out.println(sb.toString());
        sc.close();
    }
}
