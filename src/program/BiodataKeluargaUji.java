/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class BiodataKeluargaUji {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        BiodataKeluarga a = new BiodataKeluarga();
        System.out.println(" ----- Biodata Keluarga ----- ");
        System.out.print("Nama Ayah : ");
        String namaAyah = scan.next();
        a.setNamaAyah(namaAyah);
        System.out.print("Nama Ibu : ");
        String namaIbu = scan.next();
        a.setNamaIbu(namaIbu);
        System.out.print("Nama Saudara : ");
        String namaSaudara = scan.next();
        a.setNamaSaudara(namaSaudara);
        System.out.print("Nama Saya : ");
        String namaMu = scan.next();
        a.setNamaMu(namaMu);
        System.out.print("Alamat : ");
        String alamat = scan.next();
        a.setAlamat(alamat);
        System.out.print("Tempat Lahir : ");
        String tempatLahir = scan.next();
        a.setTempatLahir(tempatLahir);
        System.out.print("Tanggal Lahir : ");
        String tanggalLahir = scan.next();
        a.setTanggalLahir(tanggalLahir);
        System.out.print("Hobi : ");
        String hobi = scan.next();
        a.setHobi(hobi);
        System.out.print("Cita Cita : ");
        String citaCita = scan.next();
        a.getCitaCita();
        System.out.print("Nomer Telefon : ");
        String noTelpon = scan.next();
        a.setNoTelpon(noTelpon);
        
        System.out.println("");
        System.out.println("");
        
        System.out.println(" ----- Biodata Keluarga ----- ");
        System.out.println("Nama Ayah : " + a.getNamaAyah());
        System.out.println("Nama Ibu : " + a.getNamaIbu());        
        System.out.println("Nama Saudara : " + a.getNamaSaudara());        
        System.out.println("Nama Saya : " + a.getNamaMu());        
        System.out.println("Alamat : " + a.getAlamat());        
        System.out.println("Tempat Lahir : " + a.getTempatLahir());        
        System.out.println("Tanggal Lahir : " + a.getTanggalLahir());       
        System.out.println("Hobi : " + a.getHobi());       
        System.out.println("Cita Cita : " + a.getCitaCita());       
        System.out.println("Nomer Telefon : " + a.getNoTelpon());
        
        
        
        
    }
    
}
