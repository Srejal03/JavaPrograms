import java.util.Scanner;
class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int rev = 0;
        while (temp != 0) {
            rev = rev * 10 + temp % 10;
            temp /= 10;
        }
        if (n == rev)
            System.out.println("Number is Palindrome");
        else
            System.out.println("Number is not Palindrome");
        sc.close();

    }
}

