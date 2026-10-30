public class Rekening {
    // Field nomor, pemilik, dan saldo semuanya private
    private String nomor;
    private String pemilik;
    private int saldo;

    // Constructor diisi memakai this
    public Rekening(String nomor, String pemilik, int saldo) {
        this.nomor = nomor;
        this.pemilik = pemilik;
        this.saldo = saldo;
    }

    public String getNomor() { return nomor; }
    public String getPemilik() { return pemilik; }

    // Saldo read-only (hanya ada get, tidak ada set)
    public int getSaldo() { return saldo; }
}