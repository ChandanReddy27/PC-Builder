package pc_builder;

import java.util.ArrayList;
import java.util.Scanner;

public class PowerSupply extends Product{
    private int watts;
    private String rating;
    ArrayList<PowerSupply> psu = new ArrayList<PowerSupply>();
    public int getWatts() {
        return watts;
    }

    public String getRating() {
        return rating;
    }

    public PowerSupply(int watts, String rating, String productName, double productPrice, String productBrand) {
        this.watts = watts;
        this.rating = rating;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productBrand = productBrand;
    }

    public PowerSupply(){
        this.watts = 0;
        this.rating = null;
        this.productBrand = null;
        this.productPrice = 0;
        this.productBrand = null;
    }

    /**
     * Reads psu text file into ArrayList
     * @param readPSU Scanner
     */
    public void readPSU(Scanner readPSU){
        int watts;
        String rating, productName, productBrand;
        double productPrice;
        for(int i = 0; i < 5; i++) {
            productName = readPSU.nextLine();
            productPrice = readPSU.nextDouble();
            readPSU.nextLine();
            productBrand = readPSU.nextLine();
            watts = readPSU.nextInt();
            readPSU.nextLine();
            rating = readPSU.nextLine();
            readPSU.nextLine();
            PowerSupply tempPSU = new PowerSupply(watts, rating, productName, productPrice, productBrand);
            psu.add(tempPSU);
        }
        productName = readPSU.nextLine();
        productPrice = readPSU.nextDouble();
        readPSU.nextLine();
        productBrand = readPSU.nextLine();
        watts = readPSU.nextInt();
        readPSU.nextLine();
        rating = readPSU.nextLine();
        PowerSupply tempPSU = new PowerSupply(watts, rating, productName, productPrice, productBrand);
        psu.add(tempPSU);
        readPSU.close();
    }

    /**
     * Prints PSU arraylist
     */
    public void printPSU(){
        for(int i = 0; i < psu.size(); i++){
            System.out.println(i + ". " + psu.get(i).toString() + "\n");
        }
    }

    @Override public String toString(){
        return("Name: " + productName + "\nBrand: " + productBrand + "\nPrice: $" + productPrice + "0\nWattage: " + watts + "W" + "\nRating: " + rating);
    }

    public void printSingle(int i) throws IndexOutOfBoundsException{
        System.out.println(psu.get(i).toString());
    }

    public PowerSupply getPSU(int i) throws IndexOutOfBoundsException{
        return psu.get(i);
    }
}
