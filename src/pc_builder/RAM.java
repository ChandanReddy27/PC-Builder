package pc_builder;

import java.util.ArrayList;
import java.util.Scanner;

public class RAM extends Product{
    private int speed;
    private int capacity;
    ArrayList<RAM> ram = new ArrayList<RAM>();

    public RAM(int speed, int Capacity, String productName, double productPrice, String productBrand) {
        this.speed = speed;
        this.capacity = Capacity;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productBrand = productBrand;
    }

    public RAM(){
        this.speed = 0;
        this.capacity = 0;
        this.productBrand = null;
        this.productPrice = 0;
        this.productBrand = null;
    }

    public int getSpeed() {
        return speed;
    }

    /**
     * Reads ram text file into ArrayList
     * @param readRAM Scanner
     */
    public void readRAM(Scanner readRAM){

        String productName, productBrand;
        double productPrice;
        int speed, capacity;
        for(int i = 0; i < 4; i++){
            productName = readRAM.nextLine();
            productPrice = readRAM.nextDouble();
            readRAM.nextLine();
            productBrand = readRAM.nextLine();
            speed = readRAM.nextInt();
            readRAM.nextLine();
            capacity = readRAM.nextInt();
            readRAM.nextLine();
            readRAM.nextLine();
            RAM tempram = new RAM(speed, capacity, productName, productPrice, productBrand);
            ram.add(tempram);
        }
        productName = readRAM.nextLine();
        productPrice = readRAM.nextDouble();
        readRAM.nextLine();
        productBrand = readRAM.nextLine();
        speed = readRAM.nextInt();
        readRAM.nextLine();
        capacity = readRAM.nextInt();
        RAM tempram = new RAM(speed, capacity, productName, productPrice, productBrand);
        ram.add(tempram);
        readRAM.close();
    }

    /**
     * Prints RAM arraylist
     */
    public void printRAM(){
        for(int i = 0; i < ram.size(); i++){
            System.out.println(i + ". " + ram.get(i).toString() + "\n");
        }
    }

    public RAM getRAM(int i) throws IndexOutOfBoundsException{
        return ram.get(i);
    }

    public void printSingle(int i) throws IndexOutOfBoundsException{
        System.out.println(ram.get(i).toString());
    }

    @Override public String toString(){
        return("Name: " + productName + "\nBrand: " + productBrand + "\nPrice: $" + productPrice + "0\nSpeed: " + speed + "MHz" + "\nCapacity: " + capacity + "GB");
    }

}

