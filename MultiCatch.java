import java.util.Scanner;

public class MultiCatch {
    public static void main(String[] args) {
        int int1 = 0;
        int int2 = 0;
        try {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter two numbers: ");

            System.out.println("Enter the first number: ");
            int1 = sc.nextInt();

            System.out.println("Enter the second number: ");
            int2 = sc.nextInt();

            float quotient = int1 / int2;
            System.out.println(int1 + " / " + int2 + " = " + quotient);
        }
        catch (ArithmeticException ex) {
            System.out.println("--- Catch ---");
            if (int2 == 0){
                System.out.println("Divisor cannot be zero.");
            } else if (int1 < int2) {
                System.out.println("For this case, give the first number bigger");
            } else {
                System.out.println(ex.toString());
            }
            
        } finally {
            System.out.println("--- Finally ---");
            System.out.println("Developed & Designed by Nubaid");
        }
        System.out.println("--- DONE ---");
    }
}
