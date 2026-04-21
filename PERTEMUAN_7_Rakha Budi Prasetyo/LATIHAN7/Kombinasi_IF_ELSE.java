import java.util.Scanner;

public class Kombinasi_IF_ELSE{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Jenjang (S1/S2/S3): ");
        String jenjang = input.nextLine();

        if (jenjang.equalsIgnoreCase("S1")) {
            System.out.println("Anda Mendapatkan Gelar Sarjana");
        } else if (jenjang.equalsIgnoreCase("S2")) {
            System.out.println("Anda Mendapatkan Gelar Magister");
        } else if (jenjang.equalsIgnoreCase("S3")) {
            System.out.println("Anda Mendapatkan Gelar Doktor");
        } else {
            System.out.println("Input Kamu Tidak Valid!");
        }

        input.close();
    }
}