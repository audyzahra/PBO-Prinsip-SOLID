package isp;

public class Main {
    public static void main(String[] args) {
        Kubus kubus = new Kubus();

        kubus.calculateArea();
        kubus.calculateVolume();

        System.out.println("---------------------------------");
        
        Persegi persegi = new Persegi();

        persegi.calculateArea();
        
    }
    
    
}
