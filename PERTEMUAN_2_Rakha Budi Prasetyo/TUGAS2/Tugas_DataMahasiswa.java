package TUGAS2;
import java.util.Scanner;

public class Tugas_DataMahasiswa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Form Input Mahasiswa ===");
        System.out.print("Input Nama: ");
        String nama = input.nextLine();
        System.out.print("Input NIM: ");
        String nim = input.nextLine();
        System.out.print("Input Program Studi: ");
        String programStudi = input.nextLine();
        System.out.print("Input Semester: ");
        int semester = input.nextInt(); 

        String status;
        if (semester <= 2) {
            status = "Mahasiswa Baru";
        } else {
            status = "Mahasiswa Lama";
        }

        System.out.println("\n--- Hasil Data Mahasiswa ---");
        System.out.println("Nama          : " + nama);
        System.out.println("NIM           : " + nim);
        System.out.println("Program Studi : " + programStudi);
        System.out.println("Semester      : " + semester);
        System.out.println("Status        : " + status); 

        input.close();
    }
}