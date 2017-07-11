import java.util.Scanner;

/**
 * Created by fhani on 7/11/2017.
 */
public class CountriesApp {
    public static void main(String[] args) {

        boolean userContinue = true;
        System.out.println("Welcome to the Countries Maintenance Application!");

        do {
            System.out.println("1 - See the list of countries");
            System.out.println("2 - Add a country");
            System.out.println("3 - Exit");
            System.out.println();

            Scanner scnr = new Scanner(System.in);
            System.out.println("Enter menu number: ");
            int menuNumb = scnr.nextInt();
            // validation for entering 1, 2, or 3
            menuNumb = Validation.menuNumValidation(menuNumb);


            switch (menuNumb) {
                case 1:
                    CountriesTextFile.readFromFile();
                    System.out.println();
                    break;

                case 2:
                    CountriesTextFile.writeToFile();
                    System.out.println();

                    break;
                case 3:
                    System.out.println("Goodbye!");
                    userContinue = false;
                    break;

            }
        } while (userContinue);
    }
}
