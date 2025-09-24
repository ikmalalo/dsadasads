
package com.mycompany.perpustakaan;

import models.Buku;
import models.BukuPelajaran;

public class Perpustakaan {
    
    
    public static void main(String[] args) {
//          Buku buku1 = new Buku("Ini Buku", "Arya", 221);
//          buku1.tampilkanInfo();
//          
//          System.out.println("||=======================================||");
//          
//          buku1.setHalaman("123");
//          buku1.tampilkanInfo();
//          
//          System.out.println("||=======================================||");
//          
//          buku1.setHalaman("asd");
//          buku1.tampilkanInfo();

        BukuPelajaran buku2 = new BukuPelajaran("Buku IPA 10", "Arya", 120, "Ilmu Pengetahuan Alam");
        buku2.tampilkanInfo();
        
        buku2.beriRating(5);
        
        System.out.println("Rating:  " + buku2.getRataRataRating());
    }
}
