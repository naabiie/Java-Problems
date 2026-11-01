import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double amount=sc.nextDouble();
        String mode=sc.next();
        if(mode.equals("notes")){
            int money=(int) amount;
            int n500=money/500;
            money %=500;
            int n100=money/100;
            money %=100;
            int n50=money/50;
            money %=50;
            int n10=money/10;
            money %=10;
          System.out.println("500: "+n500);
            System.out.println("100: "+n100);
            System.out.println("50: "+n50);
            System.out.println("10: "+n10);
        }
        else if(mode.equals("coins")){
            int cents=(int)Math.round(amount*100);
            int c25=cents/25;
            cents %=25;
            int c10=cents/10;
            cents %=10;
            int c5=cents/5;
            cents %=5;
            int c1=cents;
            System.out.println("25 cents: "+c25);
            System.out.println("10 cents: "+c10);
            System.out.println("5 cents: "+c5);
            System.out.println("1 cent: "+c1);
        }
      else{
            System.out.println("Invalid mode");
        }
        sc.close();
    }
}
