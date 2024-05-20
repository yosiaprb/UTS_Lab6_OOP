import java.util.Scanner;

// Class Account sebagai parent class
class Akun {
    // Variabel instance
    private String nomorAkun;
    private double saldo;
    
    // Constructor dengan parameter
    public Akun(String nomorAkun, double saldo) {
        this.nomorAkun = nomorAkun;
        this.saldo = saldo;
    }
    
    // Method setter dan getter
    public void setNomorAkun(String nomorAkun) {
        this.nomorAkun = nomorAkun;
    }
    
    public String getNomorAkun() {
        return nomorAkun;
    }
    
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public double getBalance() {
        return saldo;
    }
    
    // Method Overriding
    public void displayInfo() {
        System.out.println("Nomor Akun  : " + nomorAkun);
        System.out.println("Saldo       : Rp" + saldo);
    }
}

// Class RekeningTabungan sebagai subclass yang extends dari Akun
class RekeningTabungan extends Akun {
    // Constructor
    public RekeningTabungan(String nomorAkun, double saldo) {
        // Memanggil constructor parent class
        super(nomorAkun, saldo);
    }
    
    // Method Overriding
    @Override
    public void displayInfo() {
        System.out.println("Informasi rekening tabungan :");
        super.displayInfo();
    }
}

// Class RekeningGiro sebagai subclass yang extends dari Akun
class RekeningGiro extends Akun {
    // Constructor
    public RekeningGiro(String nomorAkun, double saldo) {
        // Memanggil constructor parent class
        super(nomorAkun, saldo);
    }
    
    // Method Overriding
    @Override
    public void displayInfo() {
        System.out.println("Informasi rekening giro     :");
        super.displayInfo();
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Selamat Datang di Bank Sukamaju!");
        System.out.print("Masukkan nomor rekening tabungan Anda: ");
        String nomorRekeningTabungan = scanner.nextLine();
        System.out.print("Masukkan saldo rekening tabungan Anda: Rp");
        double saldoTabungan = scanner.nextDouble();
        
        System.out.print("Masukkan nomor rekening giro Anda    : ");
        scanner.nextLine(); // Membuang newline character
        String nomorRekeningGiro = scanner.nextLine();
        System.out.print("Masukkan saldo rekening giro Anda    : Rp");
        double saldoGiro = scanner.nextDouble();
        
        // Membuat objek SavingsAccount dan CheckingAccount
        RekeningTabungan rekeningTabungan = new RekeningTabungan(nomorRekeningTabungan, saldoTabungan);
        RekeningGiro rekeningGiro = new RekeningGiro(nomorRekeningGiro, saldoGiro);
        
        // Menampilkan informasi akun
        System.out.println();
        rekeningTabungan.displayInfo();
        System.out.println();
        rekeningGiro.displayInfo();
        
        scanner.close();
    }
}
