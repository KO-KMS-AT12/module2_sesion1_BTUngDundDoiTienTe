import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("USD = ");
        double usd = scanner.nextDouble();
        double rate = 23000;
        double vnd = (int) (usd * rate);
        System.out.printf("VND = %.2f",vnd);
    }
}
