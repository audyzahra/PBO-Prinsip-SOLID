package dip;

public class PostgreSQL implements Database {

    @Override
    public void insert(String data) {
        System.out.println("Menyimpan data ke PostgreSQL: " + data);
    }
    
}
