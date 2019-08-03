package pc_builder;

import java.util.ArrayList;
import java.util.Scanner;

public class Motherboard extends Product {
    private String socketType;
    private String size;
    ArrayList<Motherboard> mobo = new ArrayList<Motherboard>();

    public String getSocketType() {
        return socketType;
    }

    public String getSize() {
        return size;
    }

    public Motherboard(String socketType, String size, String productName, double productPrice, String productBrand) {
        this.socketType = socketType;
        this.size = size;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productBrand = productBrand;
    }

    public Motherboard(){
        this.socketType = null;
        this.size = null;
        this.productBrand = null;
        this.productPrice = 0;
        this.productBrand = null;
    }

    /**
     * Reads mobo text file into ArrayList
     * @param readMobo Scanner
     */
    public void readMobo(Scanner readMobo){
        String productName, productBrand, socketType, size;
        double productPrice;
        for(int i = 0; i < 5; i++){
            productName = readMobo.nextLine();
            productPrice = readMobo.nextDouble();
            readMobo.nextLine();
            productBrand = readMobo.nextLine();
            socketType = readMobo.nextLine();
            size = readMobo.nextLine();
            readMobo.nextLine();
            Motherboard motherboard = new Motherboard(socketType, size, productName, productPrice, productBrand);
            mobo.add(motherboard);
        }
        productName = readMobo.nextLine();
        productPrice = readMobo.nextDouble();
        readMobo.nextLine();
        productBrand = readMobo.nextLine();
        socketType = readMobo.nextLine();
        size = readMobo.nextLine();
        Motherboard motherboard = new Motherboard(socketType, size, productName, productPrice, productBrand);
        mobo.add(motherboard);
        readMobo.close();
    }

    /**
     * Prints all AMD motherboards
     */
    public void printMoboAMD(){
        for(int i = 0; i < mobo.size(); i++){
            if(mobo.get(i).socketType.equals("AM4")){
                System.out.println(i + ". " + mobo.get(i).toString() + "\n");
            }
        }
    }

    /**
     * Prints all Intel motherboards
     */
    public void printMoboIntel() {
        for (int i = 0; i < mobo.size(); i++){
            if(mobo.get(i).socketType.equals("LGA 1151")){
                System.out.println(i + ". " + mobo.get(i).toString() + "\n");
            }
        }
    }
    @Override public String toString(){
        return("Name: " + productName + "\nBrand: " + productBrand + "\nPrice: $" + productPrice + "0\nSocket Type: " + socketType + "\nCompatible with: " + size);
    }

    public Motherboard getMobo(int i) throws IndexOutOfBoundsException{
        return mobo.get(i);
    }

    public void printSingle(int i) throws IndexOutOfBoundsException{
        System.out.println(mobo.get(i).toString());
    }
}

