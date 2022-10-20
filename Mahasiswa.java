public class Mahasiswa {
    // field
    private String kelas;
    private String nama;
    private int nim;

    //Constructor
    public Mahasiswa(String kelas, String nama, int nim) {
        this.kelas = kelas;
        this.nama = nama;
        this.nim = nim;
    }

    // deklarasi method
    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getNim() {
        return nim;
    }

    public void setNim(int nim) {
        this.nim = nim;
    }

    public void output(){
        System.out.print("Halo nama saya "+ this.nama);
        System.out.println("nim " + this.nim);
    }
}