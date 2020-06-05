package com.example.tugasmob2;

public class Menu {
    private String gambar;
    private String nama;
    private String harga;
    private String deskripsi1;

    public Menu(String datanama, String dataharga, String datagambar,String datadeskripsi1){
        nama = datanama;
        gambar = datagambar;
        harga = dataharga;
        deskripsi1 = datadeskripsi1;

    }

    public String getGambar() {
        return gambar;
    }

    public String getNama() {
        return nama;
    }

    public String getHarga() {
        return harga;
    }

    public String getDeskripsi1() {
        return deskripsi1;
    }
}

