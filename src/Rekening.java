public class Rekening {
    private String nomor;
    private String pemilik;
    private int saldo;

    public Rekening(String nomor, String pemilik, int saldo) {
        this.nomor = nomor;
        this.pemilik = pemilik;
        this.saldo = saldo;
    }

    public String getNomor() { return nomor; }
    public String getPemilik() { return pemilik; }
    public int getSaldo() { return saldo; }

    // Method setor menolak jumlah <= 0
    public boolean setor(int jumlah) {
        if (jumlah <= 0) return false;
        saldo += jumlah;
        return true;
    }

    // Method tarik menolak jumlah <= 0 dan melebihi saldo
    public boolean tarik(int jumlah) {
        if (jumlah <= 0 || jumlah > saldo) return false;
        saldo -= jumlah;
        return true;
    }

    // Uang diformat sebagai method private
    private String formatRupiah(int uang) {
        return String.format("Rp%,d", uang).replace(',', '.');
    }

    // Mencetak satu baris info
    public void cetakInfo() {
        System.out.println(nomor + " | " + pemilik + " | " + formatRupiah(saldo));
    }
}