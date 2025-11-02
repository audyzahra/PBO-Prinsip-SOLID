package ocp;

public class Main {
    public static void main(String[] args) {
        PembayaranCustomer customer1 = new PembayaranCustomer();
        PembayaranCustomer customer2 = new PembayaranCustomer();
        PembayaranCustomer customer3 = new PembayaranCustomer();
        
        Cash Cash1 = new Cash(); 
        customer1.menerimaPembayaran(Cash1);

        Debit Debit1 = new Debit();
        customer2.menerimaPembayaran(Debit1);

        Kredit Kredit1 = new Kredit();
        customer3.menerimaPembayaran(Kredit1);
      
    }
}
