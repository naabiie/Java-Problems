import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int secondsmallest=arr[1];
        int thirdlargest=arr[n-3];
        int sum=secondsmallest+thirdlargest;
        System.out.println(sum);
        sc.close();
    }
}
