import java.util.Scanner;

class Fractionseries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += (double)i / (i + 1);
        }
         System.out.println("Sum = " + sum);
         sc.close();
    }
}


