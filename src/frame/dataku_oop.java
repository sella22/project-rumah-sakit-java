/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frame;

/**
 *
 * @author hp
 */
public class dataku_oop extends data_oop{
    String jadwal;
    
    //method overloading constructor
    public dataku_oop() { 
        jadwal = "senin";
    }
    
    public dataku_oop(String jadwal) { 
    this.jadwal = jadwal;
    }
    
    public dataku_oop(int id, String nama, String jadwal) { 
        this.id = id;
        this.nama = nama;
        this.jadwal = jadwal;
    }
    
    public void setJadwal(String jadwal) {   
        this.jadwal = jadwal;
    }

    public String getJadwal() { 
        return jadwal;
    }

    //overriden method
    @Override
    public void setNama(String nama){
        this.nama = nama;
    }
    
    @Override
    public void setId(int id){
        this.id = id;
    }
    
    @Override
    public String getNama(){
        return nama;
    }
    
    @Override
    public int getId(){
        return id;
    }
    
    public String data(){
        return "Antrian : " + getId() 
                + "\npasien : " +getNama()
                + "\nJadwal : " + getJadwal();
    }
}
