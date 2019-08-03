package pc_builder;

import java.util.ArrayList;
import java.util.Scanner;

public class CPUCooling extends Product{
    private boolean waterCooled;
    private int radiatorSize;
    ArrayList<CPUCooling> CPUCooling = new ArrayList<CPUCooling>();

    public CPUCooling(boolean waterCooled, int radiatorSize, String productName, double productPrice, String productBrand) {
        this.waterCooled = waterCooled;
        this.radiatorSize = radiatorSize;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productBrand = productBrand;
    }

    public CPUCooling(){
        this.waterCooled = false;
        this.radiatorSize = 0;
        this.productBrand = null;
        this.productPrice = 0;
        this.productBrand = null;
    }

    /**
     * Reads the CPUCooler text file into the ArrayList
     * @param readCPUCooler Scanner
     */
    public void readCPUCooling(Scanner readCPUCooler){
        String productName, productBrand;
        double productPrice;
        Boolean waterCooled;
        int radiatorSize;
        for(int i = 0; i < 3; i++){
            productName = readCPUCooler.nextLine();
            productPrice = readCPUCooler.nextDouble();
            readCPUCooler.nextLine();
            productBrand = readCPUCooler.nextLine();
            waterCooled = readCPUCooler.nextBoolean();
            readCPUCooler.nextLine();
            radiatorSize = readCPUCooler.nextInt();
            readCPUCooler.nextLine();
            readCPUCooler.nextLine();
            CPUCooling object = new CPUCooling(waterCooled, radiatorSize, productName, productPrice, productBrand);
            CPUCooling.add(object);
        }
        productName = readCPUCooler.nextLine();
        productPrice = readCPUCooler.nextDouble();
        readCPUCooler.nextLine();
        productBrand = readCPUCooler.nextLine();
        waterCooled = readCPUCooler.nextBoolean();
        readCPUCooler.nextLine();
        radiatorSize = readCPUCooler.nextInt();
        readCPUCooler.close();
        CPUCooling object = new CPUCooling(waterCooled, radiatorSize, productName, productPrice, productBrand);
        CPUCooling.add(object);
    }

    /**
     * Prints the CPUCooler ArrayList
     */
    public void printCPUCooling(){
        for(int i = 0; i < CPUCooling.size(); i++){
            System.out.println(i + ". " + CPUCooling.get(i).toString() + "\n");
        }
    }

    @Override public String toString(){
        return("Name: " + productName + "\nBrand: " + productBrand + "\nPrice: $" + productPrice + "0\nWater Cooled? " + waterCooled + "\nRadiator Size: " + radiatorSize + "mm");
    }

    public void printSingle(int i) throws IndexOutOfBoundsException{
        System.out.println(CPUCooling.get(i).toString());
    }

    public CPUCooling getCPUC(int i) throws IndexOutOfBoundsException{
        return CPUCooling.get(i);
    }
}
