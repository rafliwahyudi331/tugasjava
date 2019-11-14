/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan.pkg6;

/**
 *
 * @author Rafli
 * NAMA                 : Rafli Wahyudi 
 * KELAS                : TI-1A
 * NIM                  : A2.1900039
 * Deskripsi Program    : Perintah Menampilkan Value ke Layar
 */
public class Latihan6 {
    // NAMA_KAMBING sebagai konstanta
    public static int jumlahKambing;

    // NAMA_KAMBING sebagai konstanta
    public static final String NAMA_KAMBING = "MIDUN";
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mamalia.jumlahKambing = 485000;
        System.out.println(NAMA_KAMBING + " memiliki kambing sebanyak " + Mamalia.jumlahKambing);
        
    }
    
}
