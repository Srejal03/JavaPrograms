
import java.util.Scanner;
class primeno {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean prime = true;
        if (n <= 1)
            prime = false;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                prime = false;
                break;
            }
        }
        if (prime)
            System.out.println(" Given number is Prime");
        else
            System.out.println("Given no is not Prime");
        sc.close();
    }
}

