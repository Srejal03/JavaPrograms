//Celsius To Fahrenheit
import java.util.Scanner;

public class CtoF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double c;
        System.out.print("Enter temperature in Celsius: ");
        c = sc.nextDouble();
        double f = (c * 9/5) + 32;
        System.out.println("Celsius = " + f);
        sc.close();
    }
}