import java.util.Scanner;

public class PhoneMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int option;
        do {
            displayMainMenu();
            option = scanner.nextInt();

            switch (option) {
                case 0:
                    displayOkoaMenu(scanner);
                    break;
                case 1:
                    // Process option 1
                    break;
                case 2:
                    // Process option 2
                    break;
                case 3:
                    // Process option 3
                    break;
                case 4:
                    // Process option 4
                    break;
                case 5:
                    // Process option 5
                    break;
                case 6:
                    // Process option 6
                    break;
                case 7:
                    // Process option 7
                    break;
                case 8:
                    // Process option 8
                    break;
                case 98:
                    // Process option 98
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        } while (option != 99);  // Exit when option 99 is chosen
    }

    public static void displayMainMenu() {
        System.out.println("0: Sh20(30mins, 3hrs)");
        System.out.println("1: Sh10(15mins, 1hr)");
        System.out.println("2: Sh20(15mins, midnight)");
        System.out.println("3: Okoa 50");
        System.out.println("4: Okoa 20");
        System.out.println("5: Okoa 10");
        System.out.println("6: Okoa 5");
        System.out.println("7: Okoa 20(900MB, 1hr)");
        System.out.println("8: Okoa internet");
        System.out.println("98: More");
    }

    public static void displayOkoaMenu(Scanner scanner) {
        int okoaOption;
        do {
            System.out.println("Existing Unpaid Okoa: 0");
            System.out.println("New Okoa request: 20");
            System.out.println("TOTAL DEBT will be: 20");
            System.out.println("1: Accept");
            System.out.println("2: Decline");
            System.out.println("0: BACK");
            System.out.println("99: HOME");
            
            okoaOption = scanner.nextInt();

            switch (okoaOption) {
                case 1:
                    // Process Accept option
                    break;
                case 2:
                    // Process Decline option
                    break;
                case 0:
                    return; // Return to the main menu
                case 99:
                    System.exit(0); // Exit the program
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        } while (okoaOption != 99); // Exit when option 99 is chosen
    }
}

