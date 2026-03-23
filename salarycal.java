import java.util.Scanner;

public class salarycal{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double basic, hra, da, bonus, deduction;

        System.out.print("Enter basic salary: ");
        basic = sc.nextDouble();

        System.out.print("Enter HRA: ");
        hra = sc.nextDouble();

        System.out.print("Enter DA: ");
        da = sc.nextDouble();

        System.out.print("Enter Bonus: ");
        bonus = sc.nextDouble();

        System.out.print("Enter Deduction: ");
        deduction = sc.nextDouble();

        double total = basic + hra + da + bonus - deduction;

        System.out.println("Total Salary = " + total);

        sc.close();
    }
}
