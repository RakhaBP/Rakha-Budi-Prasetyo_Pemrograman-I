import java.util.Scanner;

public class Kombinasi_IF_ELSE2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Pilih Bahan Pokok (ayam/kentang): ");
        String bahan = input.nextLine();

        System.out.print("Pilih Rasa (pedas/manis/asin): ");
        String rasa = input.nextLine();

        if (bahan.equalsIgnoreCase("ayam")) {
            if (rasa.equalsIgnoreCase("pedas")) {
                System.out.println("Menu: Ayam Mercon");
            } else if (rasa.equalsIgnoreCase("manis")) {
                System.out.println("Menu: Ayam Kecap");
            } else if (rasa.equalsIgnoreCase("asin")) {
                System.out.println("Menu: Ayam Goreng Mentega");
            } else {
                System.out.println("Rasa tidak tersedia.");
            }
        } else if (bahan.equalsIgnoreCase("kentang")) {
            if (rasa.equalsIgnoreCase("pedas")) {
                System.out.println("Menu: Sambal Goreng Kentang");
            } else if (rasa.equalsIgnoreCase("manis")) {
                System.out.println("Menu: Donat Kentang");
            } else if (rasa.equalsIgnoreCase("asin")) {
                System.out.println("Menu: Kentang Goreng");
            } else {
                System.out.println("Rasa tidak tersedia.");
            }
        } else {
            System.out.println("Bahan pokok tidak tersedia.");
        }

        input.close();
    }
}