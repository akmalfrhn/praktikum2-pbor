class Pasien {
    private String nama;
    private int umur;
    private String penyakit;
    private String noRekamMedis;

    public Pasien(String nama, int umur, String penyakit, String noRekamMedis) {
        this.nama = nama;
        this.umur = umur;
        this.penyakit = penyakit;
        this.noRekamMedis = noRekamMedis;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public String getPenyakit() {
        return penyakit;
    }

    public void setPenyakit(String penyakit) {
        this.penyakit = penyakit;
    }

    public String getNoRekamMedis() {
        return noRekamMedis;
    }

    public void setNoRekamMedis(String noRekamMedis) {
        this.noRekamMedis = noRekamMedis;
    }

    public void tampilkanData() {
        System.out.println("=== Data Pasien ===");
        System.out.println("Nama          : " + nama);
        System.out.println("Umur          : " + umur);
        System.out.println("Penyakit      : " + penyakit);
        System.out.println("No Rekam Medis: " + noRekamMedis);
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        Pasien pasien1 = new Pasien("Budi", 30, "Demam Berdarah", "RM001");
        Pasien pasien2 = new Pasien("Siti", 45, "Hipertensi", "RM002");

        pasien1.tampilkanData();
        pasien2.tampilkanData();

        pasien1.setPenyakit("Sembuh / Sehat");
        System.out.println("Update Data Pasien 1:");
        pasien1.tampilkanData();
    }
}
