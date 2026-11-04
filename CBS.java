import java.util.Scanner;

public class CBS {
    public static void main(String[] args) {
        boolean infiniteLoop = true;
        double[] accountBalance = new double[1000];

        String[] accountName = new String[1000];

        int option, size = 100;

        while (infiniteLoop) {
            System.out.println("Welcome to Codingal Banking Services");
            System.out.println("Banking Menu: ");
            System.out.println("Select any one option from below. ");
            System.out.println("1 -> Add Customer");
            System.out.println("2 -> Change Customer Name");
            System.out.println("3 -> Change Account Balance");
            System.out.println("4 -> Update Account Balance");
            System.out.println("5 -> Summary of all accounts");
            System.out.println("6 -> Quit");

            Scanner sc = new Scanner(System.in);
            System.out.print("Enter your option to proceed ahead: ");

            option = sc.nextInt();

            if (option == 1) {
                System.out.println("\nAdd Customer \nMenu ->");

                sc.nextLine();

                System.out.print("\nEnter Customer Name: ");
                String name = sc.nextLine();
                accountName[size] = name;
                System.out.print("Enter Opening Balance Amount: ");
                double amt = sc.nextDouble();
                accountBalance[size] = amt;

                System.out.println("Account Created Successfully. \n");
                System.out.println("Account Details :- \n");
                System.out.println("Account Number: " + (size));
                System.out.println("Account Name: " + accountName[size]);
                System.out.println("Account Balance: " + accountBalance[size] + "Rs \n");
                
                System.out.println("================================")

                size = size + 1;
            }
        }
    }
}