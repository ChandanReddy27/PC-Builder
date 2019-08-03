package pc_builder;

public class Computer implements Comparable<Computer>{
    CPU cpu;
    CPUCooling cpuc;
    GPU gpu;
    Motherboard mobo;
    PowerSupply psu;
    RAM ram;
    Case cases;

    public CPU getCpu() {
        return cpu;
    }

    public CPUCooling getCpuc() {
        return cpuc;
    }

    public GPU getGpu() {
        return gpu;
    }

    public Motherboard getMobo() {
        return mobo;
    }

    public PowerSupply getPsu() {
        return psu;
    }

    public RAM getRam() {
        return ram;
    }

    public Case getCases() {
        return cases;
    }

    Computer(CPU cpu, CPUCooling cpuc, GPU gpu, Motherboard mobo, PowerSupply psu, RAM ram, Case cases){
        this.cpu = cpu;
        this.cpuc = cpuc;
        this.gpu = gpu;
        this.mobo = mobo;
        this.psu = psu;
        this.ram = ram;
        this.cases = cases;
    }

    /**
     * Calculates the performance
     * @return Performance
     */
    public double calculatePerformance(){
        return (cpu.getBaseClock() * gpu.getBaseClock() * ram.getSpeed()) / 100;
    }

    /**
     * Adds the costs
     * @return The cost of the whole build
     */
    public double calculateCost(){
        return (cpu.productPrice + cpuc.productPrice + gpu.productPrice + mobo.productPrice + psu.productPrice + ram.productPrice + cases.productPrice);
    }

    @Override public String toString(){
        return ("CPU: " + cpu.productName + "\nCooler: " + cpuc.productName  + "\nRAM: " + ram.productName + "\nMotherboard: " + mobo.productName + "\nGPU: " + gpu.productName  + "\nPower Supply: " + psu.productName + "\nCase: " + cases.productName +
         "\nCost: $" +calculateCost());
    }

    @Override public boolean equals(Object o){
        if(this == o){
            return true;
        }
        else if(!(o instanceof Computer)){
            return false;
        }
        else{
            Computer c = (Computer) o;
            return(this.cpu.equals(c.cpu) && this.cpuc.equals(c.cpuc) && this.gpu.equals(c.gpu) && this.mobo.equals(c.mobo) && this.psu.equals(c.psu) && this.ram.equals(c.ram) && this.cases.equals(c.cases));
        }
    }

    @Override public int compareTo(Computer c){
        if(this.equals(c)){
            return 0;
        }
        else if(!(this.cpu.equals(c.cpu))){
            return 1;
        }
        else if(!(this.mobo.equals(c.mobo))){
            return 2;
        }
        else if(!(this.cpuc.equals(c.cpuc))){
            return 3;
        }
        else if(!(this.ram.equals(c.ram))){
            return 4;
        }
        else if(!this.gpu.equals(c.gpu)){
            return 5;
        }
        else if(!(this.psu.equals(c.psu))){
            return 6;
        }
        else return 7;
    }


}
