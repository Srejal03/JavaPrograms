import java.util.Scanner;
class sumofdigits {
    public static void main(String[] args) {
        System.out.println("Enter a number or digit:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        System.out.println("Sum of digits = " + sum);
        sc.close();
    }
}
