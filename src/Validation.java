import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Scanner;

/**
 * Created by fhani on 7/11/2017.
 */
public class Validation {
    public static int menuNumValidation(int menuNum) {
        Scanner scan = new Scanner(System.in);

        while ((menuNum != 1) && (menuNum != 2) && (menuNum != 3)) {

            System.out.println("Invalid entry! Enter 1, 2, or 3!");
            menuNum = scan.nextInt();
        }
        return menuNum;
    }

    public static boolean checkForDuplicateCountry (String countryInput) {
        String[] countries;
        boolean isDuplicate = false;

        try {
            countries = Files.readAllLines(new File("countries.txt").toPath()).toArray(new String[0]);
            for(String country:countries){
                if(country.equalsIgnoreCase(countryInput)){
                    isDuplicate = true;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return isDuplicate;
    }

}
