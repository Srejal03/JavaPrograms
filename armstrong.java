import java.util.Scanner;
class armstrong {
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int sum = 0;
        while (temp != 0) {
            int digit = temp % 10;
            sum += digit * digit * digit;
            temp /= 10;
        }
        if (n == sum)
            System.out.println("Number is Armstrong");
        else
            System.out.println("Number is not Armstrong");
        sc.close();
    }
}

