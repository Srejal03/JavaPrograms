//Fahrenheit To Celsius
import java.util.Scanner;

public class FtoC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double f;
        System.out.print("Enter temperature in Fahrenheit: ");
        f = sc.nextDouble();
        double c = (f - 32) * 5 / 9;
        System.out.println("Celsius = " + c);
        sc.close();
    }
}
