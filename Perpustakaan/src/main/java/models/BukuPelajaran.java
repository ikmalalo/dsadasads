package models;

import java.util.ArrayList;

public class BukuPelajaran extends Buku implements BisaDinilai {
    String namaPelajaran;
    ArrayList<Integer> ratings = new ArrayList<>();
    
    public BukuPelajaran(String namaBuku, String namaPenulis, int halaman, String namaPelajaran){
        super(namaBuku, namaPenulis, halaman);
        this.namaPelajaran = namaPelajaran;
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("Nama Buku          :" + super.getNamaBuku());
        System.out.println("Nama Penulis       :" + super.getNamaPenulis());
        System.out.println("Jumlah Halaman     :" + super.getHalaman());
        System.out.println("Nama Mata Pelajaran: " + this.namaPelajaran);
    }
    
    @Override
     public void beriRating(int nilai){
         ratings.add(nilai);
     }
    
    @Override
    public double getRataRataRating(){
        if (ratings.isEmpty()){
            return 0;
        } else {
            int total = 0;
            
            
            for (int n : ratings){
                total += n;
            }
            
            
            return (double) total/ratings.size();
        }
    }
}
