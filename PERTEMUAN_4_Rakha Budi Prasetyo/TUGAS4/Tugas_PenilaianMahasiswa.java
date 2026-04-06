package TUGAS4;
import java.util.Scanner;
public class Tugas_PenilaianMahasiswa {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        float bobot_kehadiran, realisasi, bobot_tugas, uts, uas, total;

        System.out.println("=== Sistem Penilaian Mahasiswa ===");
        
        System.out.print("Masukkan Nilai Kehadiran : ");
        bobot_kehadiran = input.nextFloat();
        System.out.print("Masukkan Nilai Realisasi : ");
        realisasi = input.nextFloat();
        System.out.print("Masukkan Nilai Tugas     : ");
        bobot_tugas = input.nextFloat();
        System.out.print("Masukkan Nilai UTS       : ");
        uts = input.nextFloat();
        System.out.print("Masukkan Nilai UAS       : ");
        uas = input.nextFloat();

        if (realisasi != 0) {
            total = (bobot_kehadiran / realisasi * 10) + bobot_tugas + uts + uas;
            String grade;
            if (total >= 95) {
                grade = "A";
            } else if (total >= 90) {
                grade = "B";
            } else if (total >= 80) {
                grade = "C";
            } else if (total >= 70) {
                grade = "D";
            } else {
                grade = "E";
            }

            String status;
            if (grade.equals("A") || grade.equals("B") || grade.equals("C")) {
                status = "LULUS";
            } else {
                status = "TIDAK LULUS";
            }

            System.out.println("\n--- Hasil Akhir ---");
            System.out.println("Total Nilai : " + total);
            System.out.println("Grade       : " + grade);
            System.out.println("Status      : " + status);

        } else {
            System.out.println("\n[Error] Realisasi pertemuan tidak boleh 0!");
        }
        
        input.close();
    }
}