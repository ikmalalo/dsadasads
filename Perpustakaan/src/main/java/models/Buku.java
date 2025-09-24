package models;

import java.util.Set;

public abstract class Buku {
    private String namaBuku;
    private String namaPenulis;
    private int halaman;
    
    public Buku(String namaBuku, String namaPenulis, int halaman){
        this.namaBuku = namaBuku;
        this.namaPenulis = namaPenulis;
        this.halaman = halaman;
    }

    public String getNamaBuku() {
        return namaBuku;
    }

    public String getNamaPenulis() {
        return namaPenulis;
    }

    public int getHalaman() {
        return halaman;
    }

    public void setNamaBuku(String namaBuku) {
        this.namaBuku = namaBuku;
    }

    public void setNamaPenulis(String namaPenulis) {
        this.namaPenulis = namaPenulis;
    }

    public void setHalaman(int halaman) {
        if (halaman > 20){
            this.halaman = halaman;
        } else {
            System.out.println("Halaman g msk akal");
        }
    }
    
//    OVERLOADING
    public void setHalaman(String halamanStr) {
        try {
            int hal = Integer.parseInt(halamanStr);
            setHalaman(hal);
        } catch (NumberFormatException e) {
            System.out.println("Nilai Halaman Harus Angka!");
        }
    }
    
    public abstract void tampilkanInfo();
}
