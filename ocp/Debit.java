package ocp;

public class Debit implements TipePembayaran {

    @Override
    public void memprosesPembayaran() {
       
        System.out.println("Memproses Pembayaran Menggunakan Tipe Pembayaran Debit");
    }
    
}
