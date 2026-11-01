import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number % 5 == 0 && number % 7 != 0) {
            System.out.println(number + " is a multiple of 5");
        } else if (number % 7 == 0) {
            System.out.println(number + " is a multiple of 7");
        } else {
            System.out.println(number + " is neither multiple of 5 nor 7");
        }
        scanner.close();
    }
}
