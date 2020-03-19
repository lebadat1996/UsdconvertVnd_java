import java.util.Scanner;

public class UsdConvertVnd {
    public static void main(String[] args) {
        double vnd;
        double usd;
        Scanner scanner = new Scanner(System.in);
        System.out.print("USD: ");
        vnd = scanner.nextDouble();
        usd = 23000 * vnd;
        System.out.print(" = " + usd + " VND");
    }
}
