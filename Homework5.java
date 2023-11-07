public class Homework5 {
    public static void main(String[] args) {
        PersonalComputer personalComputer = new PersonalComputer();
        personalComputer.turnOn();
    }
}
class PersonalComputer{//PersonalComputer.java
    PersonalComputer(){}
    Computer computer = new Computer("Core i7", "32GB", "2TB", "White", "700W");
    Monitor monitor = new Monitor("32 inch", "Black", "45W");

    public void turnOn(){
        computer.turnOn();
        monitor.turnOn();
        computer.printInfo();
        monitor.printInfo();
    }
}

class Monitor{//Monitor.java
    private String monitorSize;
    private String color;

    private String power;

    public Monitor(String monitorSize, String color, String power){
        this.monitorSize = monitorSize;
        this.color = color;
        this.power = power;
    }

    public void turnOn(){
        System.out.println("Turning on the computer");
    }

    public void printInfo(){
        System.out.println("The spec of the monitor");
        System.out.println(" Size: " + monitorSize);
        System.out.println(" Color: " + color);
        System.out.println(" Power: " + power);
    }
}

class Computer{//Computer.java
    private String cpu;
    private String memory;
    private String hd;
    private String color;
    private String power;

    public Computer(String cpu, String memory, String hd, String color, String power){
        this.cpu = cpu;
        this.memory = memory;
        this.hd = hd;
        this.color = color;
        this.power = power;
    }

    public void turnOn(){
        System.out.println("Turning on the computer");
    }

    public void printInfo(){
        System.out.println("The spec of the computer");
        System.out.println(" Cpu: " + cpu);
        System.out.println(" Memory: " + memory);
        System.out.println(" HDD: " + hd);
        System.out.println(" Color: " + color);
        System.out.println(" Power: " + power);
    }
}