/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihan28;
import java.util.Scanner;
/**
 *
 * @author nm
 */
public class Latihan28 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("====Program Mengganti Kata====");
        System.out.print("Masukkan Kalimat :");
        String masukkalimat = scanner.nextLine();

        System.out.print("Ganti Kata :");
        String gantikata = scanner.next();

        System.out.print("Menjadi Kata :");
        String jadikata = scanner.next();

        String kalimatBaru = masukkalimat.replace(gantikata, jadikata);

        System.out.println("====Hasil Formatting====");
        System.out.println("Kalimat Awal: " +masukkalimat.toLowerCase());
        System.out.println("Kalimat Baru: " + kalimatBaru);
    }
    
}
