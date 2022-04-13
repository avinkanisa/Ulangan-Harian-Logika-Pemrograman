/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ulanganharian;

import java.util.Scanner;

public class Lebihbesar {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan bilangan pertama: ");
        int bil1 = input.nextInt();
        System.out.print("Masukan bilangan kedua: ");
        int bil2 = input.nextInt();

        if (bil1 > bil2) {
            System.out.println("Bilangan " + bil1 + " lebih besar dari " + bil2);
        }
        if (bil1 == bil2) {
            System.out.println("Bilangan " + bil1 + " sama dengan " + bil2);
        } else {
            System.out.println("Bilangan " + bil2 + " lebih besar dari " + bil1);
        }
    }

}
