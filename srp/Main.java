package srp;

public class Main {
    public static void main(String[] args) {
        Persegi persegi1 = new Persegi(5);

        PenghitungPersegi penghitung = new PenghitungPersegi();
        System.out.println(penghitung.hitungLuas(persegi1));
    }
}
