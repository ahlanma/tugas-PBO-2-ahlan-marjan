public class Mahasiswa2 extends Mahasiswa {
    private String kampus;

    public Mahasiswa2(String kelas, String nama, int nim,String kampus) {
        super(kelas, nama, nim);
        this.kampus = kampus;
    }

    public String getKampus() {
        return kampus;
    }

    public void setKampus(String kampus) {
        this.kampus = kampus;
    }

    public void output(){
        System.out.println("nama saya "+ super.getNama()+" nim "+ this.getNim()+
                "\nSaya mahasiswa di "+ this.kampus);
    }
}
