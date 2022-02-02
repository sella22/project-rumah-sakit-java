/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frame;

import javax.swing.JOptionPane;



public class JadwalBerobat_oop extends dataku_oop implements rumahsakit_oop {
    //atribut
    private String dokter;
    
    //constructor
    JadwalBerobat_oop(){
        nama = "mia";
        jadwal = "senin";
        dokter = "sella";
        id = 1;
    }
    
    JadwalBerobat_oop(int id, String nama, String jadwal, String dokter){
        super(id, nama, jadwal);
        this.dokter = dokter;
    }
    
    //method setter
    public void setDokter(String dokter){
        this.dokter = dokter;
    }
    
    //method getter
    public String getDokter(){
        return dokter;
    }
       

    @Override
    public void out() {
        System.out.println("Tampilan Dengan OOP");
    }
    
     public String data(){
        return "Antrian : " + getId() 
                + "\npasien : " +getNama()
                + "\nJadwal : " + getJadwal() 
                + "\nDokter : " + getDokter();
    }
}
