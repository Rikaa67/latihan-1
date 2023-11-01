/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan.rika;

import java.util.Scanner;
public class Latihan {

    public static void main(String[] args) {
        double Nilai1, Nilai2, Hasil;
        boolean Hasil1;
        Scanner keyboard = new Scanner(System.in);
        
         //OPERATOR ARITMATIKA
        //penjumlahan
        System.out.print("Input angka-1 : ");
        Nilai1 = keyboard.nextInt();
        System.out.print("Input angka-2 : ");
        Nilai2 = keyboard.nextInt();
        Hasil = Nilai1+Nilai2;
        System.out.println("OPERATOR ARITMATIKA");
        System.out.println("Hasil Penjumlahan = "+Hasil);
        
        //pengurangan
        System.out.print("Input angka-1 : ");
        Nilai1 = keyboard.nextInt();
        System.out.print("Input angka-2 : ");
        Nilai2 = keyboard.nextInt();
        Hasil = Nilai1-Nilai2;
        System.out.println("OPERATOR ARITMATIKA");
        System.out.println("Hasil Pengurangan = "+Hasil);
        
        //perkalian
        System.out.print("Input angka-1 : ");
        Nilai1 = keyboard.nextInt();
        System.out.print("Input angka-2 : ");
        Nilai2 = keyboard.nextInt();
        Hasil = Nilai1*Nilai2;
        System.out.println("OPERATOR ARITMATIKA");
        System.out.println("Hasil Perkalian = "+Hasil);
        
        //pembagian
        System.out.print("Input angka-1 : ");
        Nilai1 = keyboard.nextInt();
        System.out.print("Input angka-2 : ");
        Nilai2 = keyboard.nextInt();
        Hasil = Nilai1/Nilai2;
        System.out.println("OPERATOR ARITMATIKA");
        System.out.println("Hasil Pembagian = "+Hasil);
        
        //sisa bagi
        System.out.print("Input angka-1 : ");
        Nilai1 = keyboard.nextInt();
        System.out.print("Input angka-2 : ");
        Nilai2 = keyboard.nextInt();
        Hasil = Nilai1%Nilai2;
        System.out.println("OPERATOR ARITMATIKA");
        System.out.println("Hasil Sisa Bagi = "+Hasil);
        
        
        //OPERARTOR PENUGASAN
        //pengisian nilai
        System.out.print("Input angka-1 : ");
        Nilai1 = keyboard.nextInt();
        System.out.print("Input angka-2 : ");
        Nilai2 = keyboard.nextInt();
        Hasil = Nilai1=Nilai2;
        System.out.println("OPERATOR PENUGASAN");
        System.out.println("Hasil pengisian  nilai = "+Hasil);
       
        //pengisian dan penambahan
        System.out.print("Input angka-1 : ");
        Nilai1 = keyboard.nextInt();
        System.out.print("Input angka-2 : ");
        Nilai2 = keyboard.nextInt();
        Hasil = Nilai1+=Nilai2;
        System.out.println("OPERATOR PENUGASAN");
        System.out.println("Hasil pengisian dan penambahan = "+Hasil);
        
        //pengisian dan pengurangan
        System.out.print("Input angka-1 : ");
        Nilai1 = keyboard.nextInt();
        System.out.print("Input angka-2 : ");
        Nilai2 = keyboard.nextInt();
        Hasil = Nilai1-=Nilai2;
        System.out.println("OPERATOR PENUGASAN");
        System.out.println("Hasil pengisian dan pengurangan = "+Hasil);
        
        //pengisian dan perkalian
        System.out.print("Input angka-1 : ");
        Nilai1 = keyboard.nextInt();
        System.out.print("Input angka-2 : ");
        Nilai2 = keyboard.nextInt();
        Hasil = Nilai1*=Nilai2;
        System.out.println("OPERATOR PENUGASAN");
        System.out.println("Hasil pengisian dan perkalian = "+Hasil);
        
        //pengisian dan pembagian
        System.out.print("Input angka-1 : ");
        Nilai1 = keyboard.nextInt();
        System.out.print("Input angka-2 : ");
        Nilai2 = keyboard.nextInt();
        Hasil = Nilai1/=Nilai2;
        System.out.println("OPERATOR PENUGASAN");
        System.out.println("Hasil pengisian dan pembagian = "+Hasil);
        
        //pengisian dan sisa bagi
        System.out.print("Input angka-1 : ");
        Nilai1 = keyboard.nextInt();
        System.out.print("Input angka-2 : ");
        Nilai2 = keyboard.nextInt();
        Hasil = Nilai1%=Nilai2;
        System.out.println("OPERATOR PENUGASAN");
        System.out.println("Hasil pengisian dan sisa bagi = "+Hasil);
        
        
        //OPERATOR PEMBANDING
        // Lebih besar
        System.out.print("Input angka-1: ");
        Nilai1 = keyboard.nextInt();
        System.out.print("Input angka-2: ");
        Nilai2 = keyboard.nextInt();
        Hasil1 = Nilai1 > Nilai2;
        System.out.println("OPERATOR BOOLEAN");
        System.out.println("Nilai1 > Nilai2 = " + Hasil1);
        
        // Lebih kecil
        System.out.print("Input angka-1: ");
        Nilai1 = keyboard.nextInt();
        System.out.print("Input angka-2: ");
        Nilai2 = keyboard.nextInt();
        Hasil1 = Nilai1 < Nilai2;
        System.out.println("OPERATOR BOOLEAN");
        System.out.println("Nilai1 < Nilai2 = " + Hasil1);

        // sama dengan
        System.out.print("Input angka-1: ");
        Nilai1 = keyboard.nextInt();
        System.out.print("Input angka-2: ");
        Nilai2 = keyboard.nextInt();
        Hasil1 = Nilai1 == Nilai2;
        System.out.println("OPERATOR BOOLEAN");
        System.out.println("Nilai1 == Nilai2 = " + Hasil1);
        
        //tidak sama dengan
        System.out.print("Input angka-1: ");
        Nilai1 = keyboard.nextInt();
        System.out.print("Input angka-2: ");
        Nilai2 = keyboard.nextInt();
        Hasil1 = Nilai1 != Nilai2;
        System.out.println("OPERATOR BOOLEAN");
        System.out.println("Nilai1 != Nilai2 = " + Hasil1);
        
        //lebih besar sama dengan
        System.out.print("Input angka-1: ");
        Nilai1 = keyboard.nextInt();
        System.out.print("Input angka-2: ");
        Nilai2 = keyboard.nextInt();
        Hasil1 = Nilai1 >= Nilai2;
        System.out.println("OPERATOR BOOLEAN");
        System.out.println("Nilai1 >= Nilai2 = " + Hasil1);
        
        //lebih kecil sama dengan
        System.out.print("Input angka-1: ");
        Nilai1 = keyboard.nextInt();
        System.out.print("Input angka-2: ");
        Nilai2 = keyboard.nextInt();
        Hasil1 = Nilai1 <= Nilai2;
        System.out.println("OPERATOR BOOLEAN");
        System.out.println("Nilai1 <= Nilai2 = " + Hasil1);
        
        
           //OPERATOR BITWISE
           int Nilai3, Nilai4, hasil3;
        
         // and 
        System.out.print("Input angka-1: ");
        Nilai3 = keyboard.nextInt();
        System.out.print("Input angka-2: ");
        Nilai4 = keyboard.nextInt();
        hasil3 = Nilai3 & Nilai4;
        System.out.println("Bitwise AND (&)");
        System.out.println("Nilai3 & Nilai4 = " + hasil3);
        
        //or
        System.out.print("Input angka-1: ");
        Nilai3 = keyboard.nextInt();
        System.out.print("Input angka-2: ");
        Nilai4 = keyboard.nextInt();
        hasil3 = Nilai3 | Nilai4;
        System.out.println("Bitwise OR (|)");
        System.out.println("Nilai3 | Nilai4 = " + hasil3);

        //Xor
        System.out.print("Input angka-1: ");
        Nilai3 = keyboard.nextInt();
        System.out.print("Input angka-2: ");
        Nilai4 = keyboard.nextInt();
        hasil3 = Nilai3 ^ Nilai4;
        System.out.println("Bitwise XOR");
        System.out.println("Nilai3 ^ Nilai4 = " + hasil3);
        
        //Negasi
        System.out.print("Input angka : ");
        Nilai4 = keyboard.nextInt();
        hasil3 = ~ Nilai4;
        System.out.println("Bitwise NEGASI");
        System.out.println("~Nilai4 = " + hasil3);

         //Left shift
         System.out.print("Input angka-1: ");
         Nilai3 = keyboard.nextInt();
         hasil3 = Nilai3 << 1;
         System.out.println("Bitwise LEFT SHIFT");
         System.out.println(" Nilai3 << 1 = " + hasil3);
        
          //right shift
         System.out.print("Input angka-1: ");
         Nilai3 = keyboard.nextInt();
         hasil3 = Nilai3 >> 1;
         System.out.println("Bitwise RIGHT SHIFT");
         System.out.println(" Nilai3 << 1 = " + hasil3);
         
         //right shift unsigned
         System.out.print("Input angka-1: ");
         Nilai3 = keyboard.nextInt();
         hasil3 = Nilai3 >>> 2;
         System.out.println("Bitwise RIGHT SHIFT UNSIGNED");
         System.out.println(" Nilai3 >>> 2 = " + hasil3);
    }
    
}

