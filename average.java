import java.util.Scanner;

public class average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, sum = 0;

        System.out.print("Enter how many numbers: ");
        n = sc.nextInt();

        for(int i = 1; i <= n; i++) {
            System.out.print("Enter number " + i + ": ");
            int num = sc.nextInt();
            sum = sum + num;
        }

        double avg = (double) sum / n;

        System.out.println("Average = " + avg);

        sc.close();
    }
}