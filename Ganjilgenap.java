
package Ulanganharian;
import java.util.Scanner;
public class Ganjilgenap {

    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.print("Masukan bilangan: ");
         int bil = input.nextInt();
         
         if (bil % 2 == 0){
             System.out.println("Bilangan "+bil+ " adalah bilangan genap");
         }
         else {
             System.out.println("Bilangan "+bil+" adalah bilangan ganjil");
         }
    }
    
}
