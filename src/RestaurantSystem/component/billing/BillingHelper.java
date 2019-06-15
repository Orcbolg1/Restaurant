package RestaurantSystem.component.billing;

import java.io.File;
import java.io.FileInputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class BillingHelper {

    private Scanner sc;
    private Scanner scan;
    private String name;
    private String price;
    private String quantity;
    private StringBuilder fullnames;
    private double dPrice;
    private int dQuantity;
    private double multi;
    private PrintWriter pw;

    public BillingHelper(){
        fullnames = new StringBuilder();
        openFile();
        readFile();
        closeFile();
    }

    public StringBuilder getFullNames() {return fullnames;}

    /**
     *
     * @return total price amount
     */
    public String getTotal(){

        double totalPrice = 0;

    }

    /**
     *Open files, give error if file isnt found
     */
    private void openFile(){
        try {
            scan = new Scanner(new File("storage/order.txt"));
            System.out.println("File found!");
        } catch (Exception e) {
            System.out.println("File not found");
        }
    }

    private void readFile(){
        try {
            while (scan.hasNextLine()) {
                name = scan.nextLine();
                quantity = scan.nextLine();
                price = scan.nextLine();
                fullnames.append(name + " \t" + quantity + "\t" + price + "\n");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private void closeFile(){scan.close(); }

}
