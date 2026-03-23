import java.util.Scanner;

public class areaoftriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double base, height;

        System.out.print("Enter base: ");
        base = sc.nextDouble();

        System.out.print("Enter height: ");
        height = sc.nextDouble();

        double area = (base * height) / 2;

        System.out.println("Area of triangle = " + area);

        sc.close();
    }
}
