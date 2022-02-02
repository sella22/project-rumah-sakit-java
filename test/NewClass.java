/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Dwi Sella Faradhiba
 */
public class NewClass {
    
    
    public String ortu, anak, alamat;
    public int umur, no, hp;

    public void imunisasi() {
        if (umur >= 0 && umur <= 11) {
            System.out.println("Obat yang diberikan : 1 kapsul Vitamin A warna biru (100.000 SI)");
        } 
        else if (umur >= 12 && umur <= 59) {
            System.out.println("Obat yang diberikan : kapsul Vitamin A warna merah (200.000 SI) setiap 6 bulan (Februari dan Agustus)");
        }
        else  {
            System.out.println("Obat yang diberikan : Anda tidak perlu melakukan imunisasi lagi");
        }
    }

    public void berat() {
        if (umur >= 0 && umur <= 3) {
            System.out.println("Berat ideal : 3,9-5,8kg)");
        } 
        else if (umur >= 4 && umur <= 6) {
            System.out.println("Berat ideal : 5,7-8,2 kg)");
        } 
        else if (umur >= 7 && umur <= 9) {
            System.out.println("Berat ideal : 6,5-9,3 kg");
        } 
        else if (umur >= 9 && umur <= 12) {
            System.out.println("Berat ideal : 7,7-10,8 kg");
        } 
        else if (umur>12) {
            System.out.println("Berat ideal : Silahkan ukur sendiri:)");
        }
    }
}
