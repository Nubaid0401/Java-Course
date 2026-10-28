import java.util.Scanner;

public class exceptions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter two numbers: ");
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = x / y;
            System.out.println(x + "/" + y + "=" + z);
        } catch (ArithmeticException ex) {
            System.out.println(ex.toString());
            System.out.println("--- Catch block ---");
        } finally {
            System.out.println("--- Finally block ---");
            System.out.println("Application Designed and Developed by");
            System.out.println("team @ Codingal");
            sc.close();
        }
        System.out.println("--- DONE ---");
    }
}
