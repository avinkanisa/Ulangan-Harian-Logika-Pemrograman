package Ulanganharian;

import java.util.Scanner;

public class Ganjilgenap2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int hasil = 0;
        System.out.print("Masukan bilangan: ");
        
        int bil = input.nextInt();

        for (int n = 1; n <= bil; n++) {
            hasil = hasil + n;
            System.out.println("Hasilnya: " + hasil);

            if (hasil % 2 == 0) {
                System.out.println("Bilangan " + hasil + " genap");

            } else {
                System.out.println("Bilangan " + hasil + " ganjil");
            }
        }

    }

}
