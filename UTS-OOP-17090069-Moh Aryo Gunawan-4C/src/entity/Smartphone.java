package entity;

public class Smartphone {
    
    private String no_produk;
    private String nama_hp;
    private String tipe_hp;

    public String getno_produk() {
        return no_produk;
    }

    public void setno_produk(String no_produk) {
        this.no_produk = no_produk;
    }

    public String getnama_hp() {
        return nama_hp;
    }

    public void setnama_hp(String nama_hp) {
        this.nama_hp = nama_hp;
    }

    public String gettipe_hp() {
        return tipe_hp;
    }

    public void settipe_hp(String tipe_hp) {
        this.tipe_hp= tipe_hp;
    }

    public Smartphone(String no_produk, String nama_hp, String tipe_hp) {
        this.no_produk = no_produk;
        this.nama_hp = nama_hp;
        this.tipe_hp = tipe_hp;
    }


    public boolean equals(Object object) {
        Smartphone temp = (Smartphone) object;
        return no_produk.equals(temp.getno_produk());
    }
}
