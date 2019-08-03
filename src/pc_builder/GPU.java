package pc_builder;

import java.util.ArrayList;
import java.util.Scanner;

public class GPU extends Product{
    private int baseClock;
    private int boostClock;
    private int ram;
    ArrayList<GPU> gpu = new ArrayList<GPU>();

    public int getBaseClock() {
        return baseClock;
    }

    public int getBoostClock() {
        return boostClock;
    }

    public GPU(int baseClock, int boostClock, int ram, String productName, double productPrice, String productBrand) {
        this.baseClock = baseClock;
        this.boostClock = boostClock;
        this.ram = ram;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productBrand = productBrand;
    }

    public GPU(){
        this.baseClock = 0;
        this.boostClock = 0;
        this.ram = 0;
        this.productBrand = null;
        this.productPrice = 0;
        this.productBrand = null;
    }

    /**
     * Reads GPU text file into ArrayList
     * @param readGPU Scanner
     */
    public void readGPU(Scanner readGPU){
        String productName, productBrand;
        double productPrice;
        int baseClock, boostClock, ram;
        for(int i = 0; i < 3; i++){
            productName = readGPU.nextLine();
            productPrice = readGPU.nextDouble();
            readGPU.nextLine();
            productBrand = readGPU.nextLine();
            baseClock = readGPU.nextInt();
            readGPU.nextLine();
            boostClock = readGPU.nextInt();
            readGPU.nextLine();
            ram = readGPU.nextInt();
            readGPU.nextLine();
            readGPU.nextLine();
            GPU tempgpu = new GPU(baseClock,boostClock, ram, productName, productPrice, productBrand);
            gpu.add(tempgpu);
        }
        productName = readGPU.nextLine();
        productPrice = readGPU.nextDouble();
        readGPU.nextLine();
        productBrand = readGPU.nextLine();
        baseClock = readGPU.nextInt();
        readGPU.nextLine();
        boostClock = readGPU.nextInt();
        readGPU.nextLine();
        ram = readGPU.nextInt();
        GPU tempgpu = new GPU(baseClock,boostClock, ram, productName, productPrice, productBrand);
        gpu.add(tempgpu);
        readGPU.close();
    }

    /**
     * Prints GPU ArrayList
     */
    public void printGPU(){
        for(int i = 0; i < gpu.size(); i++){
            System.out.println(i + ". " + gpu.get(i).toString() + "\n");
        }
    }

    @Override public String toString(){
        return("Name: " + productName + "\nBrand: " + productBrand + "\nPrice: $" + productPrice + "0\nBase Clock: " + baseClock + "MHz\nBoost Clock: " + boostClock + "MHz\nRAM: " + ram + "GB");
    }

    public void printSingle(int i) throws IndexOutOfBoundsException{
        System.out.println(gpu.get(i).toString());
    }

    public GPU getGPU(int i) throws IndexOutOfBoundsException{
        return gpu.get(i);
    }
}

