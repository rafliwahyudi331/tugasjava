/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan.pkg4;

/**
 *
 * @author Rafli
 * NAMA                 : Rafli Wahyudi
 * KELAS                : TI-1A
 * NIM                  : A2.1900039
 * Deskripsi Program    : Perintah Menampilkan Value ke Layar
 */
public class Latihan4 {
    public void tambahKambing(){
        // Deklarasi variabel lokal //
        int jumlahKambing = 0;
        jumlahKambing = jumlahKambing + 5;
        System.out.println("Jumlah Kambing setelah ditambah: " + jumlahKambing);    
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Latihan4 kambingJantan = new Latihan4() ;
        kambingJantan.tambahKambing();
    }
    
}
