package models;

import java.util.ArrayList;

public class Mahasiswa {
    String namaMahasiswa;
    String nim;
    ArrayList<Buku> bukuDipinjam;
    
    public Mahasiswa(String namaMahasiswa, String nim){
        this.namaMahasiswa = namaMahasiswa;
        this.nim = nim;
        bukuDipinjam = new ArrayList<>();
    }
    
//    public void pinjamBuku(Buku buku){
//        bukuDipinjam.add(buku);
//        System.out.println(this.namaMahasiswa + " meminjam: " + buku.namaBuku);
//    }
    
    public void infoMahasiswa(){
        System.out.println("===================");
        System.out.println("Nama: " + this.namaMahasiswa);
        System.out.println("NIM: " + this.nim);
        System.out.println("===================");
        System.out.println("Daftar buku yang dipinjam: ");
        
        if(bukuDipinjam.isEmpty()){
            System.out.println("Belum ada pinjam buku");
        } else {
            for (Buku buku : bukuDipinjam){
                buku.tampilkanInfo();
                System.out.println("===============");
            }
        }
    }
}