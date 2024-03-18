public class Mahasiswa {
    private String nim;
    private String nama;
    private String jenisKelamin;
    private String noTelp;
    private String agama;

    public Mahasiswa(String nim, String nama, String jenisKelamin, String noTelp, String agama) {
        this.nim = nim;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.noTelp = noTelp;
        this.agama = agama;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }
    public void setnoTelp(String noTelp) {
        this.noTelp = noTelp;
    }
    public void setAgama(String agama) {
        this.agama = agama;
    }

    public String getNim() {
        return this.nim;
    }

    public String getNama() {
        return this.nama;
    }

    public String getJenisKelamin() {
        return this.jenisKelamin;
    }
    public String getnoTelp() {
        return this.noTelp;
    }
    public String getAgama() {
        return this.agama;
    }
}
