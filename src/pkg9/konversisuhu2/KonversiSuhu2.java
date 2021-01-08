/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg9.konversisuhu2;
/**
 *
 * @author Intan
 */
public class KonversiSuhu2 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Membuat judul
        System.out.print("\n Konversi Suhu dari Celcius \n"); //digunakan untuk membuat judul
        double suhu = 78; //menginisialisasikan variabel suhu dengan bilangan 78
        //program Fahrenheit
        System.out.println("Koversi suhu dari Celcius ke Fahrenheit"); //menampilkan hasil output keterangan konversi suhu ke fahrenheit
        double fahrenheit = (9*suhu/5)+32; //operasi hitung dari konversi suhu
        System.out.println("Hasil Koversi Suhu : (9/5*"+suhu+")+32 = "+fahrenheit+" F"); //menampilkan output dari hasil fahrenheit 
        //program Kelvin
        System.out.println("Koversi suhu dari Celcius ke Kelvin"); //menampilkan hasil output keterangan konversi suhu ke kelvin
        double kelvin = suhu+273; //operasi hitung dari konversi suhu
        System.out.println("Hasil Koversi Suhu : "+suhu+"+273 = "+kelvin+" K"); //menampilkan output dari hasil kelvin
        //program reamur
        System.out.println("Koversi suhu dari Celcius ke Reamur"); //menampilkan hasil output keterangan konversi suhu ke reamur
        double reamur = 4*suhu/5; //operasi hitung dari konversi suhu
        System.out.println("Hasil Koversi Suhu : 4/5*"+suhu+" = "+reamur+" R"); //menampilkan output dari hasil reamur
    } 
}
