import java.util.Scanner;

public class Kombinasi_Switch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("TEBAK PILIHAN (A,B,C,D):");
        String tebak = input.next().toUpperCase();

        switch (tebak) {
            case "A":
                System.out.println("Kamu Mendapatkan Es Krim");
                break;
            case "B":
                System.out.println("Kamu Mendapatkan Teh");
                break;
            case "C":
                System.out.println("Kamu Mendapatkan Susu");
                break;
            case "D":
                System.out.println("Kamu Mendapatkan Kopi");
                break;
            default:
                System.out.println("Input tidak valid!");
        }

        input.close();
    }
}