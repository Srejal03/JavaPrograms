 import java.util.Scanner;
class PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            rev += s.charAt(i);
        }
        if (s.equals(rev))
            System.out.println("Given String is Palindrome");
        else
            System.out.println("Given string is not Palindrome");
        sc.close();
    }
}

