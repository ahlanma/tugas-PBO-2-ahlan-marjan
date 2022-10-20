class main {

    public static void main(String[] args) {

        Mahasiswa ido = new Mahasiswa("J", "Ido", 456);
        Mahasiswa dina = new Mahasiswa("A", "dina", 474);
        Mahasiswa dino = new Mahasiswa("B", "dino", 476);

        Mahasiswa2 ahlan = new Mahasiswa2("J", "Ahlan", 123, "UAD 1");
        Mahasiswa2 tio = new Mahasiswa2("002", "tio", 25, "UAD 2");


        ahlan.setKampus("UNIVERSITAS AHMAD DAHLAN");

        ahlan.output();
    }
}