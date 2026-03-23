import java.util.Scanner;
public class sum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num1,num2;
        System.out.println("Enter number1: ");
        num1=sc.nextInt();
        System.out.println("Enter number2: ");
        num2=sc.nextInt();
        int sum=num1+num2;
        System.out.println("Sum: "+ sum);
        sc.close();
    }
    
}
