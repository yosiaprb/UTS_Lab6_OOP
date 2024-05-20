package Nomor4;

public class KalkulatorEnergiPotensial {
    private double hasil;

    // Constructor tanpa parameter
    public KalkulatorEnergiPotensial() {
        this.hasil = 0;
    }

    // Constructor dengan parameter untuk inisialisasi hasil awal
    public KalkulatorEnergiPotensial(double nilaiAwal) {
        this.hasil = nilaiAwal;
    }

    // Overloading method untuk menghitung energi potensial gravitasi
    public void menghitungGravitasi(double massa, double tinggi) {
        final double g = 9.81; // percepatan gravitasi bumi dalam m/s^2
        this.hasil += massa * g * tinggi; // Menggunakan operator penjumlahan
        System.out.println("Energi Potensial Gravitasi: " + (massa * g * tinggi) + " Joule");
    }

    // Overloading method untuk menghitung energi potensial pegas
    public void menghitungPegas(double konstantaPegas, double pergeseran) {
        this.hasil += 0.5 * konstantaPegas * Math.pow(pergeseran, 2); // Menggunakan operator penjumlahan
        System.out.println("Energi Potensial Pegas     : " + (0.5 * konstantaPegas * Math.pow(pergeseran, 2)) + " Joule");
    }

    // Metode untuk mendapatkan hasil perhitungan
    public double getHasil() {
        return this.hasil;
    }

    public static void main(String[] args) {
        // Membuat objek KalkulatorEnergiPotensial
        KalkulatorEnergiPotensial kalkulator = new KalkulatorEnergiPotensial();

        // Menghitung energi potensial gravitasi dengan massa 18 kg dan ketinggian 7 m
        kalkulator.menghitungGravitasi(18, 7);

        // Menghitung energi potensial pegas dengan konstanta pegas 24 N/m dan pergeseran 0.15 m
        kalkulator.menghitungPegas(24, 0.15);

        // Menampilkan hasil akhir
        System.out.println("Hasil akhir (EP Gravitasi + EP Pegas): " + kalkulator.getHasil() + " Joule");
    }
}

