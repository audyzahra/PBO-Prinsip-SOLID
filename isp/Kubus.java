package isp;

public class Kubus implements Shape2Dimension, Shape3Dimension {

    @Override
    public void calculateVolume() {
      System.out.println("Menghitung Volume Kubus");
    }

    @Override
    public void calculateArea() {
       System.out.println("Menghitung Luas Area Kubus");
    }
    
}
