package LATIHAN4;
import java.util.Scanner;
public class Latihan_PenilaianMahasiswa {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        float bobot_kehadiran, realisasi, bobot_tugas, uts, uas, total;

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
            System.out.println("Total: " + total);
        } else {
            System.out.println("Realisasi tidak boleh 0!");
        }
        input.close();
    }
}