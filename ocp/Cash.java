package ocp;

public class Cash implements TipePembayaran {

    @Override
    public void memprosesPembayaran() {
        
        System.out.println("Memproses Pembayaran Menggunakan Tipe Pembayaran Cash");
    }
}
