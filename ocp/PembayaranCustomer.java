package ocp;

public class PembayaranCustomer {
    public void menerimaPembayaran(TipePembayaran tipe){
        System.out.println("Proses Pembayaran Dimulai");

        tipe.memprosesPembayaran();
        System.out.println("Proses Pembayaran Selesai");
    }
}
