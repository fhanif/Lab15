import java.io.*;
import java.util.Scanner;

/**
 * Created by fhani on 7/11/2017.
 */
public class CountriesTextFile {

        public static void readFromFile() {
            // read from file
            try {
                File myFile = new File("countries.txt");

                // FileReader is a connection stream for characters that connects to a text file
                FileReader reader = new FileReader(myFile);

                // BufferedReader allows the FileReader to chain to it
                // it only goes back to check the file once the buffer is empty
                BufferedReader buff = new BufferedReader(reader);

                // declare a String variable to hold each line as it's read from the file
                String line = null;

                // this while loop says -- read a line fo text and then assign it to the string line
                // while that variable is not null keep printing lines
                while ((line = buff.readLine()) != null) {
                    System.out.println(line);
                }

                buff.close();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public static void writeToFile() {

            try {
                FileWriter writer = new FileWriter("countries.txt", true);
                Scanner scnr = new Scanner(System.in);
                System.out.println("Enter a country");
                String userInput = scnr.nextLine();

                // validation for duplicate country
                if (!Validation.checkForDuplicateCountry((userInput))) {
                    writer.write("\n" + userInput);
                    System.out.println("Country has been saved!");

                }else {
                    System.out.println("Country already exists in list!");
                }
                writer.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

