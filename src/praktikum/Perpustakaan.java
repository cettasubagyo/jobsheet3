/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum;

/**
 *
 * @author CRex64
 */
public class Perpustakaan extends Sekolah {
   public String buku;
   
   public Perpustakaan(String buku,int id_guru,String nama_guru){
       super(id_guru, nama_guru);
       this.buku=buku;
   }
   public void infoguru(){
       super.infoguru();
       System.out.println("Nama Buku : "+this.buku);
   }
    
}
