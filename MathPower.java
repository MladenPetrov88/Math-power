import java.text.DecimalFormat;
import java.util.Scanner;

public class MathPower {

    public static double mathPow(double number, double pow) {
        return Math.pow(number, pow);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double number = scanner.nextDouble();
        int pow = scanner.nextInt();

        System.out.println(new DecimalFormat("0.####").format(mathPow(number, pow)));
    }
}
