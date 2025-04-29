import java.util.Scanner;

public class SuratMain26 {
    
    public static void main(String[] args) {
        Scanner leli = new Scanner(System.in);
        StackSurat26 stack = new StackSurat26(10);
        int pilih;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Terima surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat Berdasarkan Nama");
            System.out.print("Pilih: ");
            pilih = leli.nextInt();
            leli.nextLine();
            switch (pilih) {
                case 1:
                    System.out.print("ID Surat: ");
                    String id = leli.nextLine();
                    System.out.print("Nama Mahasiswa: ");
                    String nama = leli.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = leli.nextLine();
                    System.out.print("Jenis Izin (S/I): ");
                    char jenis = leli.nextLine().toUpperCase().charAt(0);
                    System.out.print("Durasi (hari): ");
                    int durasi = leli.nextInt();
                    leli.nextLine();
                    Surat26 surat = new Surat26(id, nama, kelas, jenis, durasi);
                    stack.push(surat);
                    break;
                case 2:
                    Surat26 diproses = stack.pop();
                    if (diproses != null) {
                        System.out.println("Surat sedang diproses: ");
                        diproses.tampil();
                    }
                    break;
                case 3:
                    Surat26 terakhir = stack.peek();
                    if (terakhir != null) {
                        System.out.println("Surat terkahir ");
                        terakhir.tampil();
                    }
                    break;
                case 4:
                    System.out.print("Masukkan Nama Mahasiswa: ");
                    String cari = leli.nextLine();
                    stack.cariSurat(cari);
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }while (pilih >= 1 && pilih <= 4);
    }
}
