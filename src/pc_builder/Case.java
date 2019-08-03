package pc_builder;

import java.util.ArrayList;
import java.util.Scanner;

public class Case extends Product{
    private boolean glassWindow;
    private String type;
    ArrayList<Case> cases = new ArrayList<Case>();

    public boolean isGlassWindow() {
        return glassWindow;
    }

    public String getType() {
        return type;
    }

    public Case(boolean glassWindow, String type, String productName, double productPrice, String productBrand) {
        this.glassWindow = glassWindow;
        this.type = type;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productBrand = productBrand;
    }

    public Case(){
        this.glassWindow = false;
        this.type = null;
        this.productBrand = null;
        this.productPrice = 0;
        this.productBrand = null;
    }

    //Case
    public void readCase(Scanner readCase){
        String productName, productBrand, type;
        double productPrice;
        boolean glassWindow;
        for(int i = 0; i < 3; i++){
            productName = readCase.nextLine();
            productPrice = readCase.nextDouble();
            readCase.nextLine();
            productBrand = readCase.nextLine();
            glassWindow = readCase.nextBoolean();
            readCase.nextLine();
            type = readCase.nextLine();
            readCase.nextLine();
            Case tempCase = new Case(glassWindow, type, productName, productPrice, productBrand);
            cases.add(tempCase);
        }
        productName = readCase.nextLine();
        productPrice = readCase.nextDouble();
        readCase.nextLine();
        productBrand = readCase.nextLine();
        glassWindow = readCase.nextBoolean();
        readCase.nextLine();
        type = readCase.nextLine();
        Case tempCase = new Case(glassWindow, type, productName, productPrice, productBrand);
        cases.add(tempCase);
        readCase.close();
    }
    public void printCase(){
        for(int i = 0; i < cases.size(); i++){
            System.out.println(i + ". " + cases.get(i).toString() + "\n");
        }
    }

    @Override public String toString(){
        return("Name: " + productName + "\nBrand: " + productBrand + "\nPrice: $" + productPrice + "0\nSupports: " + type);
    }

    public void printSingle(int i) throws IndexOutOfBoundsException{
        System.out.println(cases.get(i).toString());
    }

    public Case getCase(int i) throws IndexOutOfBoundsException{
        return cases.get(i);
    }
}
