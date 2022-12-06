package Giris;

import java.util.Scanner;

public class Baslangic {
    public static void main(String[] args) {
        /*  Soru-6 Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan programı yazınız.
        Formül
        Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2u
        u = (a+b+c) / 2
        Alan * Alan = u * (u − 𝑎)* (u − 𝑏) * (u − 𝑐)
        */
        double a,b,c,u;
        double alan;
        Scanner klavye = new Scanner(System.in);
        System.out.print("birinci kenar : ");
        a = klavye.nextDouble();
        System.out.print("ikinci kenar : ");
        b = klavye.nextDouble();
        System.out.print("ucuncu kenar : ");
        c = klavye.nextDouble();

        u = (a+b+c)/2;
        alan = Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.print("Ucgenin Alani : " + alan);
    }
}
