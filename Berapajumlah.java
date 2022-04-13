package Ulanganharian;

import java.util.Scanner;

public class Berapajumlah {

    public static void main(String[] args) {
        int hasil = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan bilangan: ");
        int bil = input.nextInt();

        for (int i = 1; i <= bil; i++) {
            hasil = hasil + i;
        }
        System.out.println("Hasilnya hitungan: " + hasil);

    }

}
