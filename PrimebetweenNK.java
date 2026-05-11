import java.util.Scanner;
class PrimebetweenNK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Prime No. N to K: ");
        int n = sc.nextInt();
        int k = sc.nextInt();
        for (int i = n; i <= k; i++) {
            if (i < 2)
                continue;
            boolean prime = true;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    prime = false;
                    break;
                }
            }

            if (prime)
                System.out.print(i + " ");
            sc.close();
        }
    }
}

